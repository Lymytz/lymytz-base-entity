/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

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

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_base_liaison_caisse")
@Getter
@Setter
public class LiaisonCaisseEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_liaison_caisse_id_seq", name = "yvs_base_liaison_caisse_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_liaison_caisse_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "caisse_source", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaissesEntity caisseSource;
    @JoinColumn(name = "caisse_cible", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaissesEntity caisseCible;
    @JoinColumn(name = "compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptableEntity compte;
}
