/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.base.BaseEntity;
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
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_articles")
@Getter
@Setter
public class Articles extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_articles_id_seq", name = "yvs_articles_id_seq_name")
    @GeneratedValue(generator = "yvs_articles_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "tags")
    private String tags;
    @Column(name = "designation")
    private String designation;
    @Column(name = "mode_conso")
    private String modeConso;
    @Column(name = "photo_1")
    private String photo1;
    @Column(name = "photo_1_extension")
    private String photo1Extension;
    @Column(name = "ref_art")
    private String refArt;
    @Column(name = "coefficient")
    private Double coefficient;
    @Column(name = "service")
    private Boolean service;
    @Column(name = "methode_val")
    private String methodeVal;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "photo_2")
    private String photo2;
    @Column(name = "photo_2_extension")
    private String photo2Extension;
    @Column(name = "photo_3")
    private String photo3;
    @Column(name = "photo_3_extension")
    private String photo3Extension;
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "pua_ttc")
    private Boolean puaTtc;
    @Column(name = "change_prix")
    private Boolean changePrix;
    @Column(name = "puv_ttc")
    private Boolean puvTtc;
    @Column(name = "suivi_en_stock")
    private Boolean suiviEnStock;
    @Column(name = "visible_en_synthese")
    private Boolean visibleEnSynthese;
    @Column(name = "fichier")
    private String fichier;
    @Column(name = "nature_prix_min")
    private String naturePrixMin;
    @Column(name = "type_service")
    private Character typeService;
    @Column(name = "lot_fabrication")
    private Integer lotFabrication;
    @Column(name = "taux_ecart_pr")
    private Double tauxEcartPr;
    @Column(name = "requiere_lot")
    private Boolean requiereLot = false;

    @JoinColumn(name = "template", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    private ArticlesTemplate template;
    @JoinColumn(name = "groupe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    private GroupesArticle groupe;
    @JoinColumn(name = "famille", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private FamilleArticle famille;
    @JoinColumn(name = "classe1", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    private ClassesStatistique classe1;
    @JoinColumn(name = "classe2", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY, cascade = {})
    private ClassesStatistique classe2;

}
