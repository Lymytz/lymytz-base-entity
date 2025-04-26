package com.lymytz.entitie.base;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseEntity {
    @Column(name = "date_save")
    private LocalDateTime dateSave;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
}
