package com.lymytz.entitie;

import com.lymytz.entitie.base.Societe;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import java.time.LocalDateTime;

@MappedSuperclass
@FilterDef(name = "societeFilter", parameters = @ParamDef(name = "societeId", type = Long.class))
@Filter(name = "societeFilter", condition = "societe.id = :societeId")
@Getter
@Setter
public abstract class BaseEntityWithSociete {
    @Column(name = "date_save")
    private LocalDateTime dateSave;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
    @JoinColumn(name = "societe", referencedColumnName = "id")
    @ManyToOne
    private Societe societe;
}
