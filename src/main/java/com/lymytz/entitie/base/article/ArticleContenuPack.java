/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
 * @author Lymytz Dowes
 */
@Entity
@Table(name = "yvs_base_article_contenu_pack")
@Getter
@Setter
public class ArticleContenuPack extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_article_contenu_pack_id_seq", name = "yvs_base_article_contenu_pack_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_article_contenu_pack_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "montant")
    private Double montant;
    @Column(name = "quantite")
    private Double quantite;
    @Column(name = "quantite_max")
    private Double quantiteMax;
    @JoinColumn(name = "pack", referencedColumnName = "id")
    @ManyToOne
    private ArticlePack pack;
    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne
    private ConditionnementArticle article;
}
