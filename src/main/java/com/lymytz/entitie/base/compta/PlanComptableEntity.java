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
@Table(name = "yvs_base_plan_comptable")
@Getter
@Setter
public class PlanComptableEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_compta_plan_de_compte_id_seq", name = "yvs_compta_plan_de_compte_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_compta_plan_de_compte_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "num_compte")
    private String numCompte;
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "saisie_analytique")
    private Boolean saisieAnalytique;
    @Column(name = "saisie_echeance")
    private Boolean saisieEcheance;
    @Column(name = "saisie_compte_tiers")
    private Boolean saisieCompteTiers;
    @Column(name = "lettrable")
    private Boolean lettrable;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "type_compte")
    private String typeCompte;
    @Column(name = "type_report")
    private String typeReport;
    @Column(name = "sens_compte")
    private String sensCompte;
    @Column(name = "vente_online")
    private Boolean venteOnline;

    @JoinColumn(name = "nature_compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private NatureCompteEntity natureCompte;
    @JoinColumn(name = "compte_general", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptableEntity compteGeneral;

}
