package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：懒汉, 线程安全 效率很低, 99%情况下不需要同步
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }


    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}
