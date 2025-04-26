/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers;

import com.lymytz.entitie.base.Agences;
import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.Dictionnaire;
import com.lymytz.entitie.base.Societe;
import com.lymytz.entitie.base.compta.CategorieComptable;
import com.lymytz.entitie.base.compta.ModeDeReglement;
import com.lymytz.entitie.base.compta.PlanComptable;
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
import java.util.List;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_tiers")
@Getter
@Setter
public class Tiers extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_tiers_id_seq", name = "yvs_tiers_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_tiers_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "bp")
    private String bp;
    @Column(name = "civilite")
    private String civilite;
    @Column(name = "classe")
    private String classe;
    @Column(name = "code_barre")
    private String codeBarre;
    @Column(name = "code_tiers")
    private String codeTiers;
    @Column(name = "email")
    private String email;
    @Column(name = "logo")
    private String logo;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "tel")
    private String tel;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "code_ration")
    private String codeRation;
    @Column(name = "responsable")
    private String responsable;
    @Column(name = "statut")
    private String statut;
    @Column(name = "site")
    private String site;
    @Column(name = "always_visible")
    private Boolean alwaysVisible;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "fabriquant")
    private Boolean fabriquant;
    @Column(name = "compte")
    private String compte;
    @Column(name = "employe")
    private Boolean employe;
    @Column(name = "client")
    private Boolean client;
    @Column(name = "fournisseur")
    private Boolean fournisseur;
    @Column(name = "representant")
    private Boolean representant;
    @Column(name = "st_societe")
    private Boolean stSociete;
    @Column(name = "personnel")
    private Boolean personnel;

    @JoinColumn(name = "compte_collectif", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptable compteCollectif;
    @JoinColumn(name = "pays", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire pays;
    @JoinColumn(name = "ville", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire ville;
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire secteur;
    @JoinColumn(name = "mdr", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeDeReglement modeDeReglement;
    @JoinColumn(name = "categorie_comptable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieComptable categorieComptable;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Agences agence;/*utile seulement pour les tiers employé*/
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;

    @OneToOne(mappedBy = "tiers", fetch = FetchType.LAZY)
    private ExtTiers codeExterne;

    @OneToMany(mappedBy = "tiers", fetch = FetchType.LAZY)
    private List<TiersTelephone> telephones;



}
