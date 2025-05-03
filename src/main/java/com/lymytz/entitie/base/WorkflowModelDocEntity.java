/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
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


@Entity
@Table(name = "yvs_workflow_model_doc")
@Getter
@Setter
public class WorkflowModelDocEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_workflow_model_doc_id_seq", name = "yvs_workflow_model_doc_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_workflow_model_doc_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "titre_doc")
    private String titreDoc;
    @Column(name = "name_table")
    private String nameTable;
    @Column(name = "nature")
    private String nature = "W";
    @Column(name = "defined_livraison")
    private Boolean definedLivraison;
    @Column(name = "defined_reglement")
    private Boolean definedReglement;
    @Column(name = "defined_update")
    private Boolean definedUpdate;
    @Column(name = "workflow")
    private Boolean workflow;
    @Column(name = "description")
    private String description;

}
