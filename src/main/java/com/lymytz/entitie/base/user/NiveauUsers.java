/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

import com.lymytz.entitie.base.BaseEntity;
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

/**
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_niveau_users")
@Getter
@Setter
public class NiveauUsers extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_niveau_users_id_seq", name = "yvs_niveau_users_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_niveau_users_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "id_niveau", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private NiveauAcces niveauAcces;
}
