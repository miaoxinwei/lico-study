package com.lico.study.java8.interfaces;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.interfaces
 * 功能：
 * 时间：2017-09-29
 * 作者：呱牛
 */
public interface AInterface extends BaseInterface {

    String y = "A";

    void aCall();

    default void aPrint(String x) {
        System.err.println("aPrint " + x);
    }


    static void say() {
        System.err.println(y + " static");
    }
}
