/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.user.NiveauAccesEntity;
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

import java.io.Serializable;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_workflow_autorisation_valid_doc")
@Getter
@Setter
public class WorkflowAutorisationValidDocEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_workflow_autorisation_valid_doc_id_seq", name = "yvs_workflow_autorisation_valid_doc_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_workflow_autorisation_valid_doc_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "can_valide")
    private Boolean canValide;
    @Column(name = "can_notify")
    private Boolean canNotify;
    @JoinColumn(name = "etape_valide", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkflowEtapeValidationEntity etapeValide;
    @JoinColumn(name = "niveau_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private NiveauAccesEntity niveauAcces;
}
