package com.lymytz.entitie.base.user;

import com.lymytz.entitie.BaseEntity;
import com.lymytz.entitie.base.CodeAccesEntity;
import jakarta.persistence.*;
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
