/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.com;

import com.lymytz.entitie.base.Agences;
import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.Dictionnaire;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import static com.lymytz.entitie.Constantes.SERVICE_COMMERCE_GENERAL;

/**
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_point_vente")
@Getter
@Setter
public class PointDeVente extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_point_vente_id_seq", name = "yvs_base_point_vente_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_point_vente_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "photo")
    private String photo;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "code_pin")
    private String codePin;
    @Column(name = "color")
    private String color;
    @Column(name = "type")
    private Character type = SERVICE_COMMERCE_GENERAL;
    @Column(name = "accept_client_no_name")
    private Boolean acceptClientNoName = false;
    @Column(name = "validation_reglement")
    private Boolean validationReglement = false;
    @Column(name = "reglement_auto")
    private Boolean reglementAuto = false;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "prix_min_strict")
    private Boolean prixMinStrict = false;
    @Column(name = "livraison_on")
    private Character livraisonOn;
    @Column(name = "commission_for")
    private Character commissionFor;
    @Column(name = "vente_online")
    private Boolean venteOnline = false;
    @Column(name = "activer_notification")
    private Boolean activerNotification = false;
    @Column(name = "saisie_phone_obligatoire")
    private Boolean saisiePhoneObligatoire = false;
    @Column(name = "miminum_active_livraison")
    private Double miminumActiveLivraison;
    @Column(name = "comptabilisation_auto")
    private Boolean comptabilisationAuto;

    @JoinColumn(name = "secteur", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire secteur;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Agences agence;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PointDeVente parent;

    @OneToMany(mappedBy = "pointVente", fetch = FetchType.LAZY)
    private List<PointDeVenteDepot> depots;
    @OneToMany(mappedBy = "point", fetch = FetchType.LAZY)
    private List<CreneauPointDeVente> listTranche; //planification

}
