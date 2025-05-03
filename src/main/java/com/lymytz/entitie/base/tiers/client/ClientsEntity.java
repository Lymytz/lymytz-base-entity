/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.client;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.compta.CategorieComptableEntity;
import com.lymytz.entitie.base.compta.ModelDeReglementEntity;
import com.lymytz.entitie.base.compta.PlanComptableEntity;
import com.lymytz.entitie.base.tiers.TiersEntity;
import com.lymytz.entitie.base.user.UsersEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_com_client")
@Getter
@Setter
public class ClientsEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_client_id_seq", name = "yvs_com_client_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_client_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "defaut")
    private Boolean defaut;
    @Column(name = "suivi_comptable")
    private Boolean suiviComptable;
    @Column(name = "code_client")
    private String codeClient;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "confirmer")
    private Boolean confirmer;
    @Column(name = "seuil_solde")
    private Double seuilSolde;
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;
    @Column(name = "vente_online")
    private Boolean venteOnline;
    @Column(name = "exclus_for_home")
    private Boolean exclusForHome;

    @OneToOne(mappedBy = "client", fetch = FetchType.LAZY)
    private ExtClientsEntity codeExterne;

    @JoinColumn(name = "tiers", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiersEntity tiers;
    @JoinColumn(name = "representant", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersEntity representant;
    @JoinColumn(name = "categorie_comptable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieComptableEntity categorieComptable;
    @JoinColumn(name = "plan_ristourne", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanDeRistourneEntity planRistourne;
    @JoinColumn(name = "compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptableEntity compte;
    @JoinColumn(name = "model", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModelDeReglementEntity modelDeReglement;
    @JoinColumn(name = "create_by", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersEntity createBy;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<CategorieTarifaireEntity> categories;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<PlanReglementClientEntity> models;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<ContratsClientEntity> contrats;

}
