/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_mode_reglement")
@Getter
@Setter
public class ModeDeReglement extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_model_de_reglement_id_seq", name = "yvs_model_de_reglement_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_model_de_reglement_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "designation")
    private String designation;
    @Column(name = "description")
    private String description;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "visible_on_print_vente")
    private Boolean visibleOnPrintVente;
    @Column(name = "default_mode")
    private Boolean defaultMode;
    @Column(name = "type_reglement")
    private String typeReglement;
    @Column(name = "numero_marchand")
    private String numeroMarchand;
    @Column(name = "code_paiement")
    private String codePaiement;

    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;

/*    @OneToOne(mappedBy = "mode", fetch = FetchType.LAZY)
    private YvsBaseModeReglementInformations infos;
    @OneToOne(mappedBy = "mode", fetch = FetchType.LAZY)
    private YvsBaseModeReglementBanque banque;*/

}
