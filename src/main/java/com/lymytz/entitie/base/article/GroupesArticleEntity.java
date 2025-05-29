/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lymytz.entitie.base.article;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.SocieteEntity;
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
@Table(name = "yvs_base_groupes_article")
@Getter
@Setter
public class GroupesArticleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_groupesproduits_id_seq", name = "yvs_groupesproduits_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_groupesproduits_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "designation")
    private String designation;
    @Column(name = "photo")
    private String photo;
    @Column(name = "refgroupe")
    private String refgroupe;
    @Column(name = "code_appel")
    private String codeAppel;
    @Column(name = "actif")
    private Boolean actif;
    @JoinColumn(name = "groupe_parent", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private GroupesArticleEntity groupeParent;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SocieteEntity societe;
}
