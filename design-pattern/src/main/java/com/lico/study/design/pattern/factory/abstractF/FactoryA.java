package com.lico.study.design.pattern.factory.abstractF;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.abstractF
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class FactoryA extends AbstractFactory {

    @Override
    public Flyable createFlyable() {
        return new Bird();
    }

    @Override
    public Moveable createMoveable() {
        return new Car();
    }

    @Override
    public Writeable createWriteable() {
        return new Pen();
    }
}
