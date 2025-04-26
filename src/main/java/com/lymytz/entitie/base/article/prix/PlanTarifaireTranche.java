/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.prix;

import com.lymytz.entitie.base.BaseEntity;
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
@Table(name = "yvs_base_plan_tarifaire_tranche")
@Getter
@Setter
public class PlanTarifaireTranche extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_plan_tarifaire_tranche_id_seq", name = "yvs_base_plan_tarifaire_tranche_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_plan_tarifaire_tranche_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "puv")
    private Double puv;
    @Column(name = "valeur_min")
    private Double valeurMin;
    @Column(name = "valeur_max")
    private Double valeurMax;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "base")
    private String base;
    @Column(name = "nature_remise")
    private String natureRemise;
    @JoinColumn(name = "plan", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanTarifaire plan;
}
