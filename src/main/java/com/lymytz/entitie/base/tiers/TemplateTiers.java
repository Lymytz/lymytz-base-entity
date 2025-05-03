/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers;

import com.lymytz.entitie.base.AgencesEntity;
import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.Dictionnaire;
import com.lymytz.entitie.base.compta.CategorieComptable;
import com.lymytz.entitie.base.compta.ModeDeReglement;
import com.lymytz.entitie.base.compta.PlanComptable;
import com.lymytz.entitie.base.tiers.client.PlanDeRistourne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_tiers_template")
@Getter
@Setter
public class TemplateTiers extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_tiers_template_id_seq", name = "yvs_base_tiers_template_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_tiers_template_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "add_secteur")
    private Boolean addSecteur;
    @Column(name = "taille_secteur")
    private Integer tailleSecteur;
    @Column(name = "add_nom")
    private Boolean addNom;
    @Column(name = "taille_nom")
    private Integer tailleNom;
    @Column(name = "add_prenom")
    private Boolean addPrenom;
    @Column(name = "add_radical")
    private Boolean addRadical;
    @Column(name = "radical")
    private String radical;
    @Column(name = "taille_prenom")
    private Integer taillePrenom;
    @Column(name = "add_separateur")
    private Boolean addSeparateur;
    @Column(name = "separateur")
    private String separateur;
    @Column(name = "type")
    private char type = 'M';
    @Column(name = "always_visible")
    private Boolean alwaysVisible;
    
    @JoinColumn(name = "compte_collectif", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptable compteCollectif;
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire secteur;
    @JoinColumn(name = "ville", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire ville;
    @JoinColumn(name = "pays", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire pays;
    @JoinColumn(name = "categorie_comptable", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieComptable categorieComptable;
    @JoinColumn(name = "mdr", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeDeReglement modeDeReglement;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgencesEntity agence;
    @JoinColumn(name = "ristourne", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanDeRistourne ristourne;
    /*@JoinColumn(name = "comission", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private YvsComPlanCommission comission;*/

}
