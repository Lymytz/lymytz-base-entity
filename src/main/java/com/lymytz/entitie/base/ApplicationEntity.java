package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "application")
@Getter
@Setter
public class ApplicationEntity extends BaseEntity implements Serializable {
    @Id
    @SequenceGenerator(sequenceName = "application_id_seq", name = "application_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "application_id_seq_name", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String designation;
    private String description;

}
