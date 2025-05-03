/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers.client;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
import java.time.LocalDate;

/**
 *
 * @author Lymytz Dowes
 */
@Entity
@Table(name = "yvs_com_contrats_client")
@Getter
@Setter
public class ContratsClient extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_contrats_client_id_seq", name = "yvs_com_contrats_client_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_contrats_client_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "reference")
    private String reference;
    @Column(name = "reference_externe")
    private String referenceExterne;
    @Column(name = "type")
    private Character type;
    @Column(name = "date_expiration")
    private LocalDate dateExpiration;
    @Column(name = "date_debut_facturation")
    private LocalDate dateDebutFacturation;
    @Column(name = "interval_facturation")
    private Integer intervalFacturation;
    @Column(name = "periode_facturation")
    private Character periodeFacturation;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne
    private Clients client;
   /* @OneToMany(mappedBy = "contrat", fetch = FetchType.LAZY)
    private List<YvsComElementContratsClient> elements;
    @OneToMany(mappedBy = "contrat", fetch = FetchType.LAZY)
    private List<YvsComElementAddContratsClient> additionnels;
    @Transient
    private boolean new_;*/

}
