package com.lico.study.design.pattern.factory.simple;

import com.lico.study.design.pattern.factory.Base;
import com.lico.study.design.pattern.factory.One;
import com.lico.study.design.pattern.factory.Two;

import java.util.Optional;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.factory.simplefactory
 * 功能：
 * 时间：2018-04-27
 * 作者：miaoxw
 */
public class SimpleFactory {

    private static Base create(int num) {
        switch (num) {
            case 1:
                return new One();
            case 2:
                return new Two();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Optional<Base> base = Optional.ofNullable(SimpleFactory.create(1));
        base.ifPresent(Base::say);
    }
}
