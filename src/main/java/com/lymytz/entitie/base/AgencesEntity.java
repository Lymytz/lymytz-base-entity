/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntityWithSociete;
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


@Entity
@Table(name = "yvs_agences")
@Getter
@Setter
public class AgencesEntity extends BaseEntityWithSociete implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @SequenceGenerator(sequenceName = "yvs_agences_id_seq", name = "yvs_agences_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_agences_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "codeagence")
    private String codeagence;
    @Column(name = "designation")
    private String designation;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "actif")
    private Boolean actif;

    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SocieteEntity societe;
    @JoinColumn(name = "ville", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DictionnaireEntity ville;

    @Override
    public String toString() {
        return "YvsAgences{" + "id=" + id + '}';
    }
}
