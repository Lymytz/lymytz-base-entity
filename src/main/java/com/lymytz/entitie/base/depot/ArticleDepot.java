/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.depot;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.Articles;
import com.lymytz.entitie.base.article.ConditionnementArticle;
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

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_article_depot")
@Getter
@Setter
public class ArticleDepot extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_article_depot_id_seq", name = "yvs_base_article_depot_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_article_depot_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "stock_max")
    private Double stockMax;
    @Column(name = "stock_min")
    private Double stockMin;
    @Column(name = "mode_appro")
    private String modeAppro = "ACHT_PROD_EN";
    @Column(name = "mode_reappro")
    private String modeReappro = "RUPTURE";
    @Column(name = "categorie")
    private String categorie;
    @Column(name = "interval_approv")
    private Integer intervalApprov;
    @Column(name = "unite_interval")
    private String uniteInterval;
    @Column(name = "quantite_stock")
    private Double quantiteStock;
    @Column(name = "supp")
    private Boolean supp = false;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "stock_alert")
    private Double stockAlert;
    @Column(name = "stock_initial")
    private Double stockInitial;
    @Column(name = "date_appro")
    private LocalDate dateAppro;
    @Column(name = "marg_stock_moyen")
    private Double margStockMoyen;
    @Column(name = "stock_net")
    private Double stockNet;
    @Column(name = "lot_livraison")
    private Integer lotLivraison;
    @Column(name = "type_document_generer")
    private String typeDocumentGenerer = "FA";
    @Column(name = "generer_document")
    private Boolean genererDocument = false;
    @Column(name = "requiere_lot")
    private Boolean requiereLot = false;
    @Column(name = "suivi_stock")
    private Boolean suiviStock = false;
    @Column(name = "sell_without_stock")
    private Boolean sellWithoutStock = true;
    @Column(name = "default_pr")
    private Boolean defaultPr = false;
    @Column(name = "last_date_calcul_pr")
    private LocalDate lastDateCalculPr;

    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Articles article;
    @JoinColumn(name = "depot", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Depots depot;
    @JoinColumn(name = "depot_pr", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Depots depotPr;
    @JoinColumn(name = "default_cond", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConditionnementArticle defaultCond;

}
