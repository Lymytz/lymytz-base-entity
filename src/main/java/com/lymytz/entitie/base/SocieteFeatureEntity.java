package com.lymytz.entitie.base;

import com.lymytz.entitie.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "societe_features")
@Getter
@Setter
public class SocieteFeatureEntity extends BaseEntity implements Serializable {
    @EmbeddedId
    private SocieteFeatureId id = new SocieteFeatureId();
    @ManyToOne
    @MapsId("societeId")
    @JoinColumn(name = "societe_id")
    private SocieteEntity societe;
    @ManyToOne
    @MapsId("featureId")
    @JoinColumn(name = "feature_id")
    private ApplicationFeatureEntity feature;
}
