/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article.com;

import com.lymytz.entitie.base.BaseEntity;
import com.lymytz.entitie.base.TrancheHoraire;
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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lymytz
 */
@Entity
@Table(name = "yvs_com_creneau_point")
@Getter
@Setter
public class CreneauPointDeVente extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_creneau_point_id_seq", name = "yvs_com_creneau_point_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_creneau_point_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "actif")
    private Boolean actif = true;
    @Column(name = "permanent")
    private Boolean permanent = true;
 /*   @JoinColumn(name = "jour", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private YvsJoursOuvres jour;*/
    @JoinColumn(name = "tranche", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrancheHoraire tranche;
    @JoinColumn(name = "point", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PointDeVente point;

    public static String getTimeToString(Date time) {
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
        return formater.format(time != null ? time : new Date());
    }

}
