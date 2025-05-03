/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

import com.lymytz.entitie.BaseEntityWithSociete;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_categorie_comptable")
@Getter
@Setter
public class CategorieComptable extends BaseEntityWithSociete implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_catcompta_id_seq", name = "yvs_catcompta_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_catcompta_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_appel")
    private String codeAppel;
    @Column(name = "code")
    private String code;
    @Column(name = "nature")
    private String nature;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "designation")
    private String designation;

}
