/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.prix;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.ArticlesEntity;
import com.lymytz.entitie.base.article.ArticlesTemplateEntity;
import com.lymytz.entitie.base.article.ConditionnementArticleEntity;
import com.lymytz.entitie.base.article.FamilleArticleEntity;
import com.lymytz.entitie.base.tiers.CategorieClientEntity;
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
@Table(name = "yvs_base_plan_tarifaire")
@Getter
@Setter
public class PlanTarifaireEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_categorie_tarifaire_client_id_seq", name = "yvs_com_categorie_tarifaire_client_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_categorie_tarifaire_client_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "puv")
    private Double puv;
    @Column(name = "puv_min")
    private Double puvMin;
    @Column(name = "nature_prix_min")
    private String naturePrixMin;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "ristourne")
    private Double ristourne;
    @Column(name = "coef_augmentation")
    private Double coefAugmentation;
    @Column(name = "nature_coef_augmentation")
    private String natureCoefAugmentation;
    @Column(name = "nature_remise")
    private String natureRemise;
    @Column(name = "nature_ristourne")
    private String natureRistourne;
    @Column(name = "actif")
    private Boolean actif;

    @JoinColumn(name = "categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieClientEntity categorie;
    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesEntity article;
    @JoinColumn(name = "template", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesTemplateEntity template;
    @JoinColumn(name = "famille", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private FamilleArticleEntity famille;
    @JoinColumn(name = "conditionnement", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConditionnementArticleEntity conditionnement;
    @OneToMany(mappedBy = "plan")
    private List<PlanTarifaireTrancheEntity> grilles;

}
