/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_workflow_etape_validation")
@Getter
@Setter
public class WorkflowEtapeValidationEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_workflow_etape_validation_id_seq", name = "yvs_workflow_etape_validation_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_workflow_etape_validation_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "label_statut")
    private String labelStatut;
    @Column(name = "titre_etape")
    private String titreEtape;
    @Column(name = "nature")
    private String nature;
    @Column(name = "first_etape")
    private Boolean firstEtape;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "print_here")
    private Boolean printHere;
    @Column(name = "reglement_here")
    private Boolean reglementHere;
    @Column(name = "livraison_here")
    private Boolean livraisonHere;
    @Column(name = "can_update_here")
    private Boolean canUpdateHere;
    @Column(name = "can_edit_bp_here")
    private Boolean canEditBpHere;      //Utile pour les mission, et précise les étapes où il est permi de générer le bon provisoire
    @Column(name = "ordre_etape")
    private Integer ordreEtape;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SocieteEntity societe;
    /*
    todo: A traiter au moment de configurer les workflow de validation
    @JoinColumn(name = "type_doc_divers", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private YvsBaseTypeDocDivers typeDocDivers;*/

    @JoinColumn(name = "document_model", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkflowModelDocEntity documentModel;
    @JoinColumn(name = "etape_suivante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkflowEtapeValidationEntity etapeSuivante;

    @OneToMany(mappedBy = "etapeValide")
    private List<WorkflowAutorisationValidDocEntity> autorisations;
}
