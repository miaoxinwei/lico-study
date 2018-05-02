package com.lico.study.design.pattern.factory.abstractF;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.abstractF
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class Bird extends Flyable {
    @Override
    public void fly(int height) {
        System.err.println("Bird: I am flying " + height);
    }
}
