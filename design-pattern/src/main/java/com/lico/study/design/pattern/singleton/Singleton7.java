package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：枚举
 * 时间：2017-06-05
 * 作者：呱牛
 */
public enum Singleton7 {

    INSTANCE;

    public static Singleton7 getInstance() {
        return INSTANCE;
    }

    public void whateverMethod() {
    }
}
