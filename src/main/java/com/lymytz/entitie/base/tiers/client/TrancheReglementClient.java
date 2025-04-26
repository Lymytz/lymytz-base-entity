/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.client;

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
@Table(name = "yvs_com_tranche_reglement_client")
@Getter
@Setter
public class TrancheReglementClient extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_tranche_reglement_client_id_seq", name = "yvs_com_tranche_reglement_client_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_tranche_reglement_client_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "taux")
    private Double taux;
    @Column(name = "interval_jour")
    private Integer intervalJour;
    @JoinColumn(name = "plan_categorie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanReglementCategorie planCategorie;
    @JoinColumn(name = "plan_client", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanReglementClient planClient;
}
