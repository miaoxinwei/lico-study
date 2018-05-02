package com.lico.study.design.pattern.factory.abstractF;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.method
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class Test {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createFlyable().fly(1234);
        factoryA.createMoveable().run(2.1);
        factoryA.createWriteable().write("hello");
    }
}
