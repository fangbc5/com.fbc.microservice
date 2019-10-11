package com.fbc.ms.ucenter.auth.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description
 * @ClassName SysDictionary
 * @Author fangbc
 * @Date 2019/10/6 18:22
 * @Version 1.0
 */
@Data
@Table
@Entity
public class SysDictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(128) not null comment ''")
    private String columnDesc;
    @Column(columnDefinition = "varchar(32) not null comment ''")
    private String columnValue;
    @Column(columnDefinition = "varchar(32) not null comment ''")
    private String tableName;
    @Column(columnDefinition = "varchar(32) not null comment ''")
    private String fieldName;
    @Column(columnDefinition = "varchar(32) not null comment '参数编码'")
    private String paramCode;
    @Column(columnDefinition = "int not null default 100 comment '排序'")
    private Integer sort;
    @Column(columnDefinition = "varchar(2) comment '状态'")
    private String state;
    @Column(columnDefinition = "varchar(2) comment '备注'")
    private String comment;

}
