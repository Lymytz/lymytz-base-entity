package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "yvs_base_groupe_societe")
@Getter
@Setter
public class GroupeSociete extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_groupe_societe_id_seq", name = "yvs_base_groupe_societe_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_groupe_societe_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "libelle")
    private String libelle;
}
