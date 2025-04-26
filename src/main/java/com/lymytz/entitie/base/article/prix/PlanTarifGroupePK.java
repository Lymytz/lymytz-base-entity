/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lymytz.entitie.base.article.prix;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 *
 * @author lymytz
 */
@Embeddable
@Getter
@Setter
public class PlanTarifGroupePK implements Serializable {
    @NotNull
    @Column(name = "categorie")
    private long categorie;
    @NotNull
    @Column(name = "groupe")
    private long groupe;
    @NotNull
    @Column(name = "id_agence")
    private long idAgence;
    
}
