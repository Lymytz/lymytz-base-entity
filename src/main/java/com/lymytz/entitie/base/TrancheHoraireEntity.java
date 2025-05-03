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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_grh_tranche_horaire")
@Getter
@Setter
public class TrancheHoraireEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long  serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_tranche_horaire_id_seq1", name = "yvs_tranche_horaire_id_seq1_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_tranche_horaire_id_seq1_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "titre")
    private String titre;
    @Column(name = "heure_debut")
    private LocalTime heureDebut;
    @Column(name = "heure_fin")
    private LocalTime heureFin;
    @Column(name = "type_journee")
    private String typeJournee;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "vente_online")
    private Boolean venteOnline;

    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SocieteEntity societe;

}
