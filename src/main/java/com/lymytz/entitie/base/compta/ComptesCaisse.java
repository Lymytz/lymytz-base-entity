/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

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
 * @author hp Elite 8300
 */
@Entity
@Table(name = "Yvs_base_comptes_caisse")
@Getter
@Setter
public class ComptesCaisse extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_comptes_caisse_id_seq", name = "yvs_base_comptes_caisse_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_comptes_caisse_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_comptable")
    private String codeComptable;
    @JoinColumn(name = "caisse ", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Caisses caisse;
    @JoinColumn(name = "compte_general ", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptable compteGeneral;

}
