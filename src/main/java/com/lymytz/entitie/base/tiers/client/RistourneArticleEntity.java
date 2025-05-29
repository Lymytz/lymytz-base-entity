/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.client;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.article.ConditionnementArticleEntity;
import com.lymytz.entitie.base.article.FamilleArticleEntity;
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
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_com_ristourne")
@Getter
@Setter
public class RistourneArticleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_ristourne_id_seq", name = "yvs_com_ristourne_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_ristourne_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "date_debut")
    private LocalDate dateDebut;
    @Column(name = "date_fin")
    private LocalDate dateFin;
    @Column(name = "permanent")
    private Boolean permanent;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "famille", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private FamilleArticleEntity famille;
    @JoinColumn(name = "conditionnement", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConditionnementArticleEntity conditionnement;
    @JoinColumn(name = "plan", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanDeRistourneEntity planDeRistourne;
    @Column(name = "nature")
    private Character nature;
    @OneToMany(mappedBy = "ristourne")
    private List<GrilleRistourneArticleEntity> tranches;

}
