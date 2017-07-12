package com.lico.study.lombok;

import org.testng.annotations.Test;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class ValueTest {

    @Test
    private void test() {
        ValueExample example = new ValueExample("1");
        System.out.println(example.getName());
    }
}
