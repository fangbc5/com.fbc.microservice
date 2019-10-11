package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysPermissionButton
 * @Author fangbc
 * @Date 2019/10/6 17:42
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysPermissionButton {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(columnDefinition = "varchar(32) not null comment '名称'")
    private String name;
    @Column(columnDefinition = "varchar(32) comment '图标'")
    private String icon;
    @Column(columnDefinition = "varchar(32) comment '权限标识'")
    private String perm;

    @OneToOne(targetEntity = SysPermission.class, cascade = CascadeType.ALL, mappedBy = "sysPermissionButton")
    private SysPermission sysPermission;
}
