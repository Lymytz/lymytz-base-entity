/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.prix;

import com.lymytz.entitie.BaseEntity;
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
import java.util.Comparator;

/**
 *
 * @author GOUCHERE YVES
 */
@Entity
@Table(name = "yvs_borne_tranches")
@Getter
@Setter
public class BorneTranchesEntity extends BaseEntity implements Serializable, Comparator<BorneTranchesEntity> {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yvs_borne_tranches_id_seq")
    @SequenceGenerator(sequenceName = "yvs_borne_tranches_id_seq", allocationSize = 1, name = "yvs_borne_tranches_id_seq")
    private Long id;
    @Column(name = "borne")
    private Double borne;
    @Column(name = "remise")
    private Double remise;
    @Column(name = "prix")
    private Double prix;
    @JoinColumn(name = "tranche", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TranchesTarifEntity tranche;

    @Override
    public int compare(BorneTranchesEntity o1, BorneTranchesEntity o2) {
        return o1.getBorne().compareTo(o2.getBorne());
    }
}
