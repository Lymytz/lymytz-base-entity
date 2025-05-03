/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

import com.lymytz.entitie.base.AgencesEntity;
import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.CodeAccesEntity;
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
 * @author Lymytz
 */
@Entity
@Table(name = "yvs_compta_journaux")
@Getter
@Setter
public class JournauxEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_compta_journaux_id_seq", name = "yvs_compta_journaux_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_compta_journaux_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code_journal")
    private String codeJournal;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "default_for")
    private boolean defaultFor;
    @Column(name = "type_journal")
    private String typeJournal;
    @JoinColumn(name = "code_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeAccesEntity codeAcces;
    @JoinColumn(name = "agence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgencesEntity agence;
}
