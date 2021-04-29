package com.joyin.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wd
 * @Classname Deal
 * @Description 模块信息实体类
 * @Date 2021-04-09 15:05
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Module implements Serializable {
    private Integer dbid;
    private String  moduleid ;
    private String  modulename;
    private String  dbsource;
}
