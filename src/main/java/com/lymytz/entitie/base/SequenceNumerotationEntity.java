package com.lymytz.entitie.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "sequence_numerotation")
@IdClass(SequenceNumerotationEntityPK.class)
public class SequenceNumerotationEntity implements Serializable {
    @Column
    @Id
    private String prefixe;
    @Column
    @Id
    private Long societeId;
    @Column
    private Long numero;
}
