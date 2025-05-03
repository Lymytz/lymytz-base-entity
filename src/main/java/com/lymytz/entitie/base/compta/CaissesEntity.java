/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.CodeAccesEntity;
import com.lymytz.entitie.base.user.UsersEntity;
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
@Table(name = "yvs_base_caisse")
@Getter
@Setter
public class CaissesEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_caisse_id_seq", name = "yvs_base_caisse_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_caisse_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "code")
    private String code;
    @Column(name = "type_caisse")
    private String typeCaisse;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "principal")
    private Boolean principal;
    @Column(name = "can_negative")
    private Boolean canNegative;
    @Column(name = "default_caisse")
    private Boolean defaultCaisse;
    @Column(name = "give_billetage")
    private Boolean giveBilletage;

    @JoinColumn(name = "journal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private JournauxEntity journal;
    @JoinColumn(name = "code_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeAccesEntity codeAcces;
    @JoinColumn(name = "caissier", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersEntity caissier;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CaissesEntity parent;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mode_reg_defaut", referencedColumnName = "id")
    private ModeDeReglementEntity modeRegDefaut; //indique le mode de règlement par défaut dans cette caisse
    @JoinColumn(name = "compte", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanComptableEntity compte;

    @OneToMany(mappedBy = "caisseSource", fetch = FetchType.LAZY)
    private List<LiaisonCaisseEntity> caisseLiees;
    @OneToMany(mappedBy = "caisse", fetch = FetchType.LAZY)
    private List<ComptesCaisseEntity> othersCompte;
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<CaissesEntity> subCaisses;
    @OneToMany(mappedBy = "caisse", fetch = FetchType.LAZY)
    private List<CaisseUserEntity> yvsBaseCaisseUserList;

}
