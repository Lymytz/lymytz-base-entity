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

import java.io.Serializable;

@Entity
@Table(name = "yvs_dictionnaire")
@Getter
@Setter
public class DictionnaireEntity extends BaseEntityWithSociete implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yvs_dictionnaire_id_seq")
    @SequenceGenerator(sequenceName = "yvs_dictionnaire_id_seq", allocationSize = 1, name = "yvs_dictionnaire_id_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "libele")
    private String libele;  //Nom du pays ou de la ville
    @Column(name = "titre")
    private String titre;   //Ville ou pays
    @Column(name = "abreviation")
    private String abreviation;
    @Column(name = "actif")
    private Boolean actif;

    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DictionnaireEntity parent;
}
