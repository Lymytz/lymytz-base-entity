/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.compta;

import com.lymytz.entitie.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author hp Elite 8300
 */
@Entity
@Table(name = "yvs_mut_periode_exercice")
@Getter
@Setter
public class PeriodeExercice extends BaseEntity implements Serializable, Comparable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_mut_periode_exercice_id_seq", name = "yvs_mut_periode_exercice_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_mut_periode_exercice_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "date_debut")
    private LocalDate dateDebut;
    @Column(name = "date_fin")
    private LocalDate dateFin;
    @Column(name = "cloture")
    private Boolean cloture;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "reference_periode")
    private String referencePeriode;
    @JoinColumn(name = "exercice", referencedColumnName = "id")
    @ManyToOne
    private Exercice exercice;

    @Override
    public int compareTo(Object o) {
        PeriodeExercice y = (PeriodeExercice) o;
        if (y.getDateFin().equals(dateFin)) {
            if (y.getDateDebut().equals(dateDebut)) {
                return y.getId().compareTo(id);
            }
            return y.getDateDebut().compareTo(dateDebut);
        }
        return y.getDateFin().compareTo(dateFin);
    }

}
