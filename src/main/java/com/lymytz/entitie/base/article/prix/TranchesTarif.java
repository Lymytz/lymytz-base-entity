/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.prix;

import com.lymytz.entitie.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GOUCHERE YVES
 */
@Entity
@Table(name = "yvs_tranches")
@Getter
@Setter
public class TranchesTarif extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", columnDefinition = "SERIAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yvs_tranches_id_seq")
    @SequenceGenerator(sequenceName = "yvs_tranches_id_seq", allocationSize = 1, name = "yvs_tranches_id_seq")
    private Integer id;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "model_tranche")
    private String modelTranche;
    @Column(name = "reference_tranche")
    private String referenceTranche;
    @OneToMany(mappedBy = "tranche")
    private List<BorneTranches> bornes;
}
