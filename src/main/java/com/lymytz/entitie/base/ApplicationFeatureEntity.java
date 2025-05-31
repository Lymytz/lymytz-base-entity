package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "application_features")
@Getter
@Setter
public class ApplicationFeatureEntity extends BaseEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "application_features_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "feature_name")
    private String featureName;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application_id", nullable = false)
    private ApplicationEntity application;
}
