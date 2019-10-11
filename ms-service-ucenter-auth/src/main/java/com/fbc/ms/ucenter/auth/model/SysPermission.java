package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysPermission
 * @Author fangbc
 * @Date 2019/10/6 17:41
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(32) not null comment '类型'")
    private String type;
    @OneToOne(targetEntity = SysPermissionApi.class, cascade = CascadeType.ALL)
    private SysPermissionApi sysPermissionApi;
    @OneToOne(targetEntity = SysPermissionMenu.class, cascade = CascadeType.ALL)
    private SysPermissionMenu sysPermissionMenu;
    @OneToOne(targetEntity = SysPermissionButton.class, cascade = CascadeType.ALL)
    private SysPermissionButton sysPermissionButton;

}
