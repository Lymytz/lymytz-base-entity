/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.client;

import com.lymytz.entitie.base.compta.ModeDeReglementEntity;
import com.lymytz.entitie.base.tiers.CategorieClientEntity;
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
@Table(name = "yvs_com_plan_reglement_categorie")
@Getter
@Setter
public class PlanReglementCategorieEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_plan_reglement_categorie_id_seq", name = "yvs_com_plan_reglement_categorie_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_plan_reglement_categorie_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "montant_minimal")
    private Double montantMinimal;
    @Column(name = "montant_maximal")
    private Double montantMaximal;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "model", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModeDeReglementEntity modeDeReglement;
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieClientEntity categorie;
}
