package com.lico.study.design.pattern.factory.abstractF;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.abstractF
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public abstract class AbstractFactory {

    public abstract Flyable createFlyable();

    public abstract Moveable createMoveable();

    public abstract Writeable createWriteable();
}
