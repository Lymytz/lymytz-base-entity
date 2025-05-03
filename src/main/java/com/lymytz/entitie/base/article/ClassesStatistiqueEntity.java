/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.SocieteEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_base_classes_stat")
@Getter
@Setter
public class ClassesStatistiqueEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_classes_stat_id_seq", name = "yvs_base_classes_stat_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_classes_stat_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_ref")
    private String codeRef;
    @Column(name = "designation")
    private String designation;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "visible_synthese")
    private Boolean visibleSynthese;
    @Column(name = "visible_journal")
    private Boolean visibleJournal;
    
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private SocieteEntity societe;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private ClassesStatistiqueEntity parent;
}
