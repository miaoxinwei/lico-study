package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：饿汉 这种方式基于classloder机制避免了多线程的同步问题, 不过, instance在类装载时就实例化
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton4 {

    private static Singleton4 instance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
