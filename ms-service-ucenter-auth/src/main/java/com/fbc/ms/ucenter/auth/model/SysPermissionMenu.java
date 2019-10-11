package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysPermissionMenu
 * @Author fangbc
 * @Date 2019/10/6 17:42
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysPermissionMenu {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(columnDefinition = "varchar(32) not null comment '名称'")
    private String name;
    @Column(columnDefinition = "varchar(3000) not null comment '路径'")
    private String url;
    @Column(columnDefinition = "int not null default 100 comment '排序'")
    private Integer sort;
    @Column(columnDefinition = "varchar(32) comment '图标'")
    private String icon;
    @Column(columnDefinition = "varchar(32) comment '权限标识'")
    private String perm;

    @OneToOne(targetEntity = SysPermission.class, cascade = CascadeType.ALL, mappedBy = "sysPermissionMenu")
    private SysPermission sysPermission;
}
