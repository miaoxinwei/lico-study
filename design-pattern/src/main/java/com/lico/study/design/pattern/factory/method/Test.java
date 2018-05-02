package com.lico.study.design.pattern.factory.method;

import com.lico.study.design.pattern.factory.Base;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.method
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class Test {

    public static void main(String[] args) {
        VehicleFactory factory = new OneFactory();
        Base base = factory.create();
        base.say();
    }
}
