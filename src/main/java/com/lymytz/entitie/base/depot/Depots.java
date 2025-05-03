/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.depot;

import com.lymytz.entitie.base.AgencesEntity;
import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.CodeAcces;
import com.lymytz.entitie.base.article.com.PointDeVenteDepot;
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
 * @author LYMYTZ-PC
 */
@Entity
@Table(name = "yvs_base_depots")
@Getter
@Setter
public class Depots extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_depots_id_seq", name = "yvs_base_depots_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_depots_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "description")
    private String description;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "code")
    private String code;
    @Column(name = "designation")
    private String designation;
    @Column(name = "op_achat")
    private Boolean opAchat = false;
    @Column(name = "op_vente")
    private Boolean opVente = false;
    @Column(name = "op_production")
    private Boolean opProduction = false;
    @Column(name = "op_transit")
    private Boolean opTransit = false;
    @Column(name = "op_retour")
    private Boolean opRetour = false;
    @Column(name = "op_reserv")
    private Boolean opReserv = false;
    @Column(name = "crenau")
    private Boolean crenau = false;
    @Column(name = "control_stock")
    private Boolean controlStock = false;
    @Column(name = "op_technique")
    private Boolean opTechnique;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "principal")
    private Boolean principal = false;
    @Column(name = "verify_appro")
    private Boolean verifyAppro = false;
    @Column(name = "verify_all_valid_inventaire")
    private Boolean verifyAllValidInventaire = false;
    @Column(name = "requiere_lot")
    private Boolean requiereLot = false;

    @Column(name = "type_pf")
    private Boolean typePf = false;
    @Column(name = "type_mp")
    private Boolean typeMp = false;
    @Column(name = "type_ne")
    private Boolean typeNe = false;
    @Column(name = "type_psf")
    private Boolean typePsf = false;

    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgencesEntity agence;
    @JoinColumn(name = "code_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeAcces codeAcces;

    @OneToMany(mappedBy = "depot",fetch = FetchType.LAZY)
    private List<OperationDepot> operations;
    @OneToMany(mappedBy = "depot", fetch = FetchType.LAZY)
    private List<PointDeVenteDepot> points;

}
