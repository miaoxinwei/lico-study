package com.lico.study.design.pattern.factory.method;

import com.lico.study.design.pattern.factory.Base;
import com.lico.study.design.pattern.factory.Two;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.method
 * 功能：
 * 时间：2018-05-02
 * 作者：miaoxw
 */
public class TwoFactory extends VehicleFactory {

    @Override
    public Base create() {
        return new Two();
    }
}
