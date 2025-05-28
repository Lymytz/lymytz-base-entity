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
@Table(name = "yvs_base_type_doc_divers")
@Getter
@Setter
public class TypeDocEntity  extends BaseEntityWithSociete implements Serializable {
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_type_doc_divers_id_seq", name = "yvs_base_type_doc_divers_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_type_doc_divers_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "description")
    private String description;
    @Column(name = "module")
    private String module;
    @Column(name = "actif")
    private Boolean actif;
    @Column(name = "can_reception")
    private Boolean canReception;
    @JoinColumn(name = "code_acces", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeAcces codeAcces;
}
