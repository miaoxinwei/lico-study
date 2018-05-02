package com.lico.study.design.pattern.factory.abstractF;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.abstractF
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class Car extends Moveable {
    @Override
    public void run(double speed) {
        System.err.println("Car: My speed is " + speed);
    }
}
