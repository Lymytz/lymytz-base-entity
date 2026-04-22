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
    @Column(name = "photo")
    private String photo;
    @Column(name = "civilite")
    private String civilite;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "connect_online_planning")
    private Boolean connectOnlinePlanning = false;
    @Column(name = "nom_users")
    private String nomUsers;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "keycloack_id")
    private String keycloackId;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "blocked")
    private Boolean blocked;
    @Column(name = "email_verified")
    private Boolean emailVerified;
    @Column(name = "phone_number_verified")
    private Boolean phoneNumberVerified;
    @Column(name = "only_connect_with_planing")
    private Boolean onlyConnectWithPlaning;
    @Column(name = "request_password_reset")
    private Boolean requestPasswordReset;

    //préférence de l'utilisateur
    @Column(name = "langue")
    private String langue;
    @Column(name = "theme_color")
    private String themeColor;
    @Column(name = "fuseau_horaire")
    private String fuseauHoraire;

    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgencesEntity agence;

    /*@JoinColumn(name = "plan_commission", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private YvsComPlanCommission planCommission;
    @OneToOne(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    private YvsComComerciale commercial;*/

}
