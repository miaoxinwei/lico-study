package com.lico.study.design.pattern.singleton;

import org.testng.annotations.Test;

/**
 * 项目：lico-study
 * 包名：com.lico.study.design.pattern.singleton
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class test {

    @Test
    public void testSingleton1() {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
    }

    @Test
    public void testSingleton2() {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton1 == singleton2);
    }

    @Test
    public void testSingleton3() {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();

        System.out.println(singleton1 == singleton2);
    }

    @Test
    public void testSingleton7() {
        Singleton7 singleton1 = Singleton7.INSTANCE;
        Singleton7 singleton2 = Singleton7.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
