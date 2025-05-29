/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.com;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.ArticlesEntity;
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
@Table(name = "yvs_base_article_point")
@Getter
@Setter
public class ArticlePointDeventeEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_article_point_id_seq", name = "yvs_base_article_point_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_article_point_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "puv_min")
    private Double puvMin;
    @Column(name = "nature_prix_min")
    private String naturePrixMin;
    @Column(name = "puv")
    private Double puv;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "nature_remise")
    private String natureRemise;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "change_prix")
    private Boolean changePrix = false;
    @Column(name = "prioritaire")
    private Boolean prioritaire = false;


    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesEntity article;
    @JoinColumn(name = "point", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PointDeVenteEntity point;
/*    @JoinColumn(name = "conditionement_vente", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConditionnementArticle conditionementVente;*/
}
