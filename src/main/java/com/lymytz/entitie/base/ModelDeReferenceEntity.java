package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "yvs_base_modele_reference")
public class ModelDeReferenceEntity extends BaseEntity {
    @Id
    private Long id;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "jour")
    private Boolean jour;
    @Column(name = "mois")
    private Boolean mois;
    @Column(name = "annee")
    private Boolean annee;
    @Column(name = "taille")
    private Integer taille;
    @Column(name = "separateur")
    private Character separateur;
    @Column(name = "element_code")
    private String elementCode;
    @Column(name = "code_point")
    private Boolean codePoint;
    @Column(name = "longueur_code_point")
    private Integer longueurCodePoint;
    @JoinColumn(name = "element", referencedColumnName = "id")
    @ManyToOne
    private ElementDeReferenceEntity typeDeDocument;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne
    private SocieteEntity societe;
}
