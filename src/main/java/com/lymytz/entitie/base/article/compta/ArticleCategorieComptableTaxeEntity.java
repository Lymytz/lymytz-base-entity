/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.compta;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.TaxesEntity;
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
@Table(name = "yvs_base_article_categorie_comptable_taxe", schema = "public")
@Getter
@Setter
public class ArticleCategorieComptableTaxeEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_taxe_article_id_seq", name = "yvs_base_taxe_article_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_taxe_article_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "app_remise")
    private Boolean appRemise;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "taxe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TaxesEntity taxe;
    @JoinColumn(name = "article_categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticleCategorieComptableEntity articleCategorie;
}
