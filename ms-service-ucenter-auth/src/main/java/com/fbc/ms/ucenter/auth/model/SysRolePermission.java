package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysRolePermission
 * @Author fangbc
 * @Date 2019/10/6 17:43
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysRolePermission {

    @Id
    @Column(columnDefinition = "int not null comment '角色id'")
    private Integer roleId;

    @Column(columnDefinition = "int not null comment '权限id'")
    private Integer permissionId;
}
