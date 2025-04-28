/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lymytz.entitie.base.tiers.fournisseur;

import com.lymytz.entitie.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author Lymytz Dowes
 */
@Entity
@Table(name = "yvs_ext_fournisseur")
@Getter
@Setter
public class ExtFournisseur extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_ext_fournisseur_id_seq", name = "yvs_ext_fournisseur_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_ext_fournisseur_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_externe")
    private String codeExterne;
    @JoinColumn(name = "fournisseur", referencedColumnName = "id")
    @OneToOne
    private Fournisseur fournisseur;

}
