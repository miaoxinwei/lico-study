package com.lico.study.lombok;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok.bean
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
@Builder
@ToString
public class BuilderExample {
    private String name;
    private int age;
    @Singular private Set<String> occupations;
}
