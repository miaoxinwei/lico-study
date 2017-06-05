package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：饿汉, 变种
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    static {
        instance = new Singleton5();
    }

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        return instance;
    }

}
