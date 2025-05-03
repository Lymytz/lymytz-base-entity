/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.BaseEntity;
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

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_conditionnement")
@Getter
@Setter
public class ConditionnementArticleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_conditionnement_id_seq", name = "yvs_base_conditionnement_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_conditionnement_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "prix_min")
    private Double prixMin;
    @Column(name = "prix_achat")
    private Double prixAchat;
    @Column(name = "prix_prod")
    private Double prixProd;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "prix")
    private Double prix;
    @Column(name = "taux_pua")
    private Double tauxPua;
    @Column(name = "cond_vente")
    private Boolean byVente;
    @Column(name = "by_prod")
    private Boolean byProd;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "by_achat")
    private Boolean byAchat;
    @Column(name = "defaut")
    private Boolean defaut;
    @Column(name = "proportion_pua")
    private Boolean proportionPua;
    @Column(name = "nature_prix_min")
    private String naturePrixMin = NATURE_MTANT;
    @Column(name = "photo")
    private String photo;
    @Column(name = "photo_extension")
    private String photoExtension;
    @Column(name = "code_barre")
    private String codeBarre;
    @Column(name = "marge_min")
    private Double margeMin;

    @JoinColumn(name = "article", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ArticlesEntity article;
    @JoinColumn(name = "unite", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UniteDeMesureEntity unite;


}
