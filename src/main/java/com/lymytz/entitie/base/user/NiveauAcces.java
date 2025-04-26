/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

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
@Table(name = "yvs_niveau_acces")
@Getter
@Setter
public class NiveauAcces extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_groupes_id_seq", name = "yvs_groupes_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_groupes_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "designation")
    private String designation;
    @Column(name = "description")
    private String description;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "super_admin")
    private Boolean superAdmin;

    @JoinColumn(name = "grade", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersGrade grade;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Societe societe;

}
