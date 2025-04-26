/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

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
 *
 * @author GOUCHERE YVES
 */
@Entity
@Table(name = "yvs_base_radical_compte")
@Getter
@Setter
public class RadicalCompte extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yvs_base_radical_compte_id_seq")
    @SequenceGenerator(sequenceName = "yvs_base_radical_compte_id_seq", allocationSize = 1, name = "yvs_base_radical_compte_id_seq")
    @Column(name = "id", columnDefinition = "BIGSERIAL")
    private Long id;
    @Column(name = "radical")
    private String radical;
    @JoinColumn(name = "nature", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private NatureCompte natureCompte;
}
