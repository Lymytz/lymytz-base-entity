package com.lymytz.entitie.base;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class SocieteFeatureId implements Serializable {
    private Long societeId;
    private Long featureId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SocieteFeatureId that)) return false;
        return Objects.equals(societeId, that.societeId) &&
                Objects.equals(featureId, that.featureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(societeId, featureId);
    }
}
