package com.lico.study.java8.lambda;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.lambda
 * 功能：
 * 时间：2017-11-16
 * 作者：miaoxw
 */
public class Hello {

    private Runnable r1 = () -> System.out.println(this);
    private Runnable r2 = () -> System.out.println(toString());

    public static void main(String[] args) {
        new Hello().r1.run();
        new Hello().r2.run();
    }

    @Override
    public String toString() {
        return "Hello Hoolee";
    }

}
