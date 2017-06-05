package com.lico.study.lombok.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok.bean
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Slf4j
public class Person {

    @NonNull
    private String name;

    @NonNull
    private Integer age;
}
