/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.Societe;
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
 * @author GOUCHERE YVES
 */
@Entity
@Table(name = "yvs_base_nature_compte")
@Getter
@Setter
public class NatureCompte extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yvs_nature_compte_id_seq")
    @SequenceGenerator(sequenceName = "yvs_nature_compte_id_seq", allocationSize = 1, name = "yvs_nature_compte_id_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "designation")
    private String designation;
    @Column(name = "type_report")
    private String typeReport;
    @Column(name = "nature")
    private String nature;
    @Column(name = "saisie_anal")
    private Boolean saisieAnal;
    @Column(name = "saisie_echeance")
    private Boolean saisieEcheance;
    @Column(name = "saisie_compte_tier")
    private Boolean saisieCompteTier;
    @Column(name = "lettrable")
    private Boolean lettrable;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "sens_compte")
    private String sensCompte;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;
    @OneToMany(mappedBy = "natureCompte")
    private List<RadicalCompte> radicalsComptes;

    }
