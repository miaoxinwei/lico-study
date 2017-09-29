package com.lico.study.java8.interfaces;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.interfaces
 * 功能：
 * 时间：2017-09-29
 * 作者：呱牛
 */
public interface BaseInterface {

    String x = "base";

    void call();

    default void print(String x) {
        System.err.println("print " + x);
    }
}
