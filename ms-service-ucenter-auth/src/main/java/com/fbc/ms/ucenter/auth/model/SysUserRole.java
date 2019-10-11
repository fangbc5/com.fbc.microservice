package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysUserRole
 * @Author fangbc
 * @Date 2019/10/6 17:43
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysUserRole {

    @Id
    @Column(columnDefinition = "int not null comment '用户id'")
    private Integer userId;
    @Column(columnDefinition = "int not null comment '角色id'")
    private Integer roleId;
}
