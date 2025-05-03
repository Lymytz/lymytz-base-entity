/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

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
import java.time.LocalDate;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_users_validite")
@Getter
@Setter
public class UsersValiditeEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @SequenceGenerator(sequenceName = "yvs_users_validite_id_seq", name = "yvs_users_validite_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_users_validite_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "date_expiration")
    private LocalDate dateExpiration;
    @JoinColumn(name = "users", referencedColumnName = "id")
    @OneToOne(fetch = FetchType.LAZY)
    private UsersEntity users;
    @JoinColumn(name = "author", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersAgence author;

}
