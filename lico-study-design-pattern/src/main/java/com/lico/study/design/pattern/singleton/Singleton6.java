package com.lico.study.design.pattern.singleton;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：静态内部类
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class Singleton6 {

    private static class SingletonHolder {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6() {
    }

    public static final Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
