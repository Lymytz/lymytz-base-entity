/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

import com.lymytz.entitie.base.AgencesEntity;
import com.lymytz.entitie.BaseEntity;
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
@Table(name = "yvs_users")
@Getter
@Setter
public class UsersEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_users_id_seq", name = "yvs_users_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_users_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "code_users")
    private String codeUsers;
    @Column(name = "password_user")
    private String passwordUser;
    @Column(name = "photo")
    private String photo;
    @Column(name = "civilite")
    private String civilite;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "vente_online")
    private Boolean venteOnline = false;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "acces_multi_agence")
    private Boolean accesMultiAgence = true;
    @Column(name = "acces_multi_societe")
    private Boolean accesMultiSociete = false;
    @Column(name = "connect_online_planning")
    private Boolean connectOnlinePlanning = false;
    @Column(name = "alea_mdp")
    private String aleaMdp;
    @Column(name = "connecte")
    private Boolean connecte = false;
    @Column(name = "nom_users")
    private String nomUsers;
    private String keycloackId;
    @Column(name = "super_admin")
    private Boolean superAdmin = false;

    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgencesEntity agence;
    @JoinColumn(name = "author", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersAgence author;
    @OneToOne(mappedBy = "users", fetch = FetchType.LAZY)
    private UsersValiditeEntity validite;

    /*@JoinColumn(name = "plan_commission", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private YvsComPlanCommission planCommission;
    @OneToOne(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    private YvsComComerciale commercial;*/

}
