/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.Societe;
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
@Table(name = "yvs_base_articles_template")
@Getter
@Setter
public class ArticlesTemplate extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_articles_template_id_seq", name = "yvs_articles_template_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_articles_template_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "change_prix")
    private Boolean changePrix;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "description")
    private String description;
    @Column(name = "designation")
    private String designation;
    @Column(name = "ref_art")
    private String refArt;
    @Column(name = "suivi_en_stock")
    private Boolean suiviEnStock;
    @Column(name = "visible_en_synthese")
    private boolean visibleEnSynthese;
    @Column(name = "service")
    private Boolean service;
    @Column(name = "methode_val")
    private String methodeVal;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "fichier")
    private String fichier;

    @JoinColumn(name = "classe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClassesStatistique classe;
    @JoinColumn(name = "groupe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupesArticle groupe;
    @JoinColumn(name = "famille", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private FamilleArticle famille;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;
}
