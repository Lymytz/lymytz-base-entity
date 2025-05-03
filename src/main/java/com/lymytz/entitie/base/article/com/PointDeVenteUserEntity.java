/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.com;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.user.UsersEntity;
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

import java.io.Serial;
import java.io.Serializable;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_base_point_vente_user")
@Getter
@Setter
public class PointDeVenteUserEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_point_vente_user_id_seq", name = "yvs_base_point_vente_user_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_point_vente_user_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "users", referencedColumnName = "id")
    @ManyToOne
    private UsersEntity users;
    @JoinColumn(name = "point", referencedColumnName = "id")
    @ManyToOne
    private PointDeVenteEntity point;

}
