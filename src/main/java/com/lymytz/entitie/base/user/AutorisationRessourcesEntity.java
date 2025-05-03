/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.user;

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
 * @author lymytz
 */
@Entity
@Table(name = "yvs_autorisation_ressources_page")
@Getter
@Setter
public class AutorisationRessourcesEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @SequenceGenerator(sequenceName = "yvs_autorisation_ressources_page_id_seq", name = "yvs_autorisation_ressources_page_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_autorisation_ressources_page_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "acces")
    private Boolean acces;
    @JoinColumn(name = "ressource_page", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private RessourcesEntity ressources;
    @JoinColumn(name = "niveau_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private NiveauAccesEntity niveauAcces;

}
