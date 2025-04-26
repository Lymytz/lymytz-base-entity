/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.compta;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author GOUCHERE YVES
 */
@Embeddable
@Getter
@Setter
public class ArticleComptePk implements Serializable {
    private long article;
    private long categorie;
}
