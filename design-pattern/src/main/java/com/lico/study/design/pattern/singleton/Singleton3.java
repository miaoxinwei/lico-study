package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：懒汉, 线程安全, 双重检查锁定, 在JDK1.5之后, 双重检查锁定才能够正常达到单例效果
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton3 {

    private volatile static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }

}
