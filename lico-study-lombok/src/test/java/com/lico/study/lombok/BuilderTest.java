package com.lico.study.lombok;

import org.testng.annotations.Test;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class BuilderTest {

    @Test
    private void test() {
        BuilderExample build = BuilderExample.builder().name("mxw").age(26).occupation("111").build();
        System.out.println(build.toString());
    }


    @Test
    private void test2() {
        BuilderExample2 build2 = BuilderExample2
                .builder()
                .name("mxw")
                .age(26)
                .occupation("111")
                .clearOccupations()
                .build();
        System.out.println(build2.toString());
    }
}
