package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysRole
 * @Author fangbc
 * @Date 2019/10/6 17:41
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(128) not null comment '角色名'")
    private String roleName;
    @Column(columnDefinition = "varchar(255) not null comment '角色描述'")
    private String description;
}
