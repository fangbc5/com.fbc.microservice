package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysUser
 * @Author fangbc
 * @Date 2019/10/6 17:40
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(255) not null comment '用户名'")
    private String username;
    @Column(columnDefinition = "varchar(255) not null comment '密码'")
    private String password;
    @Column(columnDefinition = "varchar(255) not null comment '姓名'")
    private String name;
    @Column(columnDefinition = "varchar(255) not null comment '用户头像'")
    private String userpic;
    @Column(columnDefinition = "varchar(255) not null comment '用户类型'")
    private String utype;
    @Column(columnDefinition = "varchar(255) not null comment '用户公司'")
    private String companyId;

}
