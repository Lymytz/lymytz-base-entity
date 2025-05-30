package com.lymytz.entitie.base.user;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.CodeAccesEntity;
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
@Table(name = "yvs_base_users_acces")
@Getter
@Setter
public class UsersCodeAccesEntity extends BaseEntity implements Serializable {
    @Id
    @SequenceGenerator(sequenceName = "yvs_base_users_acces_id_seq", name = "yvs_base_users_acces_id_seq_name", allocationSize = 1)
    @GeneratedValue(generator = "yvs_base_users_acces_id_seq_name", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "users", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UsersEntity users;
    @JoinColumn(name = "code", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeAccesEntity code;
}
