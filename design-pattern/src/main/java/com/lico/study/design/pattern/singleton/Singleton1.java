package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：懒汉, 线程不安全
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }
}
