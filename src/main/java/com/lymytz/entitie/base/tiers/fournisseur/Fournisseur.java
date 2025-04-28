/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.fournisseur;

import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.compta.CategorieComptable;
import com.lymytz.entitie.base.compta.ModelDeReglement;
import com.lymytz.entitie.base.compta.PlanComptable;
import com.lymytz.entitie.base.tiers.Tiers;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_fournisseur")
@Getter
@Setter
public class Fournisseur extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_fournisseur_id_seq", name = "yvs_base_fournisseur_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_fournisseur_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_fsseur")
    private String codeFsseur;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "seuil_solde")
    private Double seuilSolde;
    @Column(name = "defaut")
    private Boolean defaut;    
    @Column(name = "exclus_for_home")
    private Boolean exclusForHome;    

    @JoinColumn(name = "tiers", referencedColumnName = "id")
    @ManyToOne
    private Tiers tiers;
    @JoinColumn(name = "categorie_comptable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieComptable categorieComptable;
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieFournisseur categorie;
    @JoinColumn(name = "compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptable compte;
    @JoinColumn(name = "model", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModelDeReglement modelDeReglement;
    @OneToOne(mappedBy = "fournisseur", fetch = FetchType.LAZY)
    private Fournisseur codeExterne;

}
