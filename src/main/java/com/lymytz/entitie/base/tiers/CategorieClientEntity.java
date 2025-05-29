/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.tiers;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.SocieteEntity;
import com.lymytz.entitie.base.compta.ModelDeReglementEntity;
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
 * @author lymytz
 */
@Entity
@Table(name = "yvs_base_categorie_client")
@Getter
@Setter
public class CategorieClientEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_com_categorie_client_id_seq", name = "yvs_com_categorie_client_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_com_categorie_client_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "lier_client")
    private Boolean lierClient;
    @Column(name = "defaut")
    private Boolean defaut;
    @Column(name = "description")
    private String description;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SocieteEntity societe;
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieClientEntity parent;
    @JoinColumn(name = "model", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModelDeReglementEntity modelDeReglement;
/*    @OneToMany(mappedBy = "categorie")
    private List<PlanReglementCategorie> plans;
    @OneToMany(mappedBy = "categorie")
    private List<YvsBasePlanTarifaire> tarifs;
    @OneToMany(mappedBy = "categorie")
    private List<YvsComCategorieTarifaire> tarifaires;
    @OneToMany(mappedBy = "parent")
    private List<YvsBaseCategorieClient> fils;*/

}
