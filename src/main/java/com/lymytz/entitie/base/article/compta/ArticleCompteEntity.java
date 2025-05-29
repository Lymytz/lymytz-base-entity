/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.compta;

import com.lymytz.entitie.base.article.ArticlesEntity;
import com.lymytz.entitie.base.compta.PlanComptableEntity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author GOUCHERE YVES
 */
@Entity
@Table(name = "yvs_article_compte")
@Getter
@Setter
public class ArticleCompteEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private ArticleComptePk id;
    @JoinColumn(name = "article", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesEntity article;
    @JoinColumn(name = "compte", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptableEntity compte;
}
