package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ElementDeReferenceEntity extends BaseEntity {
    @Id
    private Long id;
    @Column(name = "designation")
    private String designation;
    @Column(name = "default_prefix")
    private String defaultPrefix;
}
