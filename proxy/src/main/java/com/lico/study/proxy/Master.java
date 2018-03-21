package com.lico.study.proxy;

/**
 * 项目：lico-study
 * 包名：com.lico.study.proxy
 * 功能：
 * 时间：2018-03-21
 * 作者：miaoxw
 */
public class Master implements Person {

    @Override
    public void say() {
        System.err.println("hello");
    }
}
