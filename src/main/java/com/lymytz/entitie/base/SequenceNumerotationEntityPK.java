package com.lymytz.entitie.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SequenceNumerotationEntityPK implements Serializable {
    private String prefixe;
    private Long societeId;
}
