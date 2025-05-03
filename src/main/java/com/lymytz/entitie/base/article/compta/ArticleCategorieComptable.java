/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.compta;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.Articles;
import com.lymytz.entitie.base.article.ArticlesTemplate;
import com.lymytz.entitie.base.compta.CategorieComptable;
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
@Table(name = "yvs_base_article_categorie_comptable", schema = "public")
@Getter
@Setter
public class ArticleCategorieComptable extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_compte_article_id_seq", name = "yvs_base_compte_article_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_compte_article_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "actif")
    private Boolean actif;

    @JoinColumn(name = "compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptable compte;
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieComptable categorie;
    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Articles article;
    @JoinColumn(name = "template", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesTemplate template;
    @OneToMany(mappedBy = "articleCategorie")
    private List<ArticleCategorieComptableTaxe> taxes;
}
