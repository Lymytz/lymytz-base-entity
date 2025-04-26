/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

import com.lymytz.entitie.base.BaseEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author lymytz
 */
@Entity
@Table(name = "yvs_ressources_page")
@Getter
@Setter
public class Ressources extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_ressources_page_id_seq", name = "yvs_ressources_page_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_ressources_page_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "reference_ressource")
    private String referenceRessource;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "description")
    private String description;

}
