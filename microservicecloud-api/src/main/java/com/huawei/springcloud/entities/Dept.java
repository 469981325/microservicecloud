package com.huawei.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("Serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{

    /**
     * 主键
     */
    private Long deptno;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 来之那个数据库
     */
    private String db_source;



}
