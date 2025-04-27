package com.lymytz.entitie.base;

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


@Entity
@Table(name = "yvs_societes")
@Getter
@Setter
public class Societe extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @SequenceGenerator(sequenceName = "yvs_societes_id_seq", name = "yvs_societes_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_societes_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "devise")
    private String devise;
    @Column(name = "email")
    private String email;
    @Column(name = "forme_juridique")
    private String formeJuridique;
    @Column(name = "description")
    private String description;
    @Column(name = "a_propos")
    private String aPropos;
    @Column(name = "site_web")
    private String siteWeb;
    @Column(name = "tel")
    private String tel;
    @Column(name = "umonaie")
    private String umonaie;
    @Column(name = "adress_siege")
    private String adressSiege;
    @Column(name = "logo")
    private String logo;
    @Column(name = "name")
    private String name;
    @Column(name = "siege")
    private String siege;
    @Column(name = "numero_registre_comerce")
    private String numeroRegistreComerce;
    @Column(name = "numero_contribuable")
    private String numeroContribuable;
    @Column(name = "regime_cnps")
    private String regimeCnps;
    @Column(name = "code_abreviation")
    private String codeAbreviation;
    @Column(name = "adresse_ip")
    private String adresseIp;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "capital")
    private Double capital;
    @Column(name = "ecart_document")
    private Integer ecartDocument;
    @Column(name = "gestva")
    private Boolean gestva;
    @Column(name = "cachet")
    private String cachet;
    private String realmName;
    @JoinColumn(name = "ville", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Dictionnaire ville;
    @JoinColumn(name = "groupe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupeSociete groupe;



}
