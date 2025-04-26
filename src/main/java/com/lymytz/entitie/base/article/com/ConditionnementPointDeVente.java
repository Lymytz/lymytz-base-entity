/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.com;

import com.lymytz.entitie.base.BaseEntity;
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

import java.io.Serial;
import java.io.Serializable;

import static com.lymytz.entitie.Constantes.NATURE_MTANT;

@Entity
@Table(name = "yvs_base_conditionnement_point")
@Getter
@Setter
public class ConditionnementPointDeVente extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_conditionnement_point_id_seq", name = "yvs_base_conditionnement_point_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_conditionnement_point_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "puv")
    private Double puv;
    @Column(name = "prix_min")
    private Double prixMin;
    @Column(name = "nature_prix_min")
    private String naturePrixMin = NATURE_MTANT;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "nature_remise")
    private String natureRemise = NATURE_MTANT;
    @Column(name = "avance_commance")
    private Double avanceCommance;
    @Column(name = "taux_pua")
    private Double tauxPua;
    @Column(name = "proportion_pua")
    private Boolean proportionPua = false;
    @JoinColumn(name = "conditionnement", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConditionnementArticle conditionnement;
    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlePointDevente article;
    @Column(name = "change_prix")
    private Boolean changePrix = false;
    @Column(name = "actif")
    private Boolean actif;

}
