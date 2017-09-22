package com.lico.study.java8.lambda;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lambda
 * 功能：
 * 时间：2017-06-15
 * 作者：呱牛
 */
// 通过 @FunctionalInterface 注解来显式指定一个接口是函数式接口, 我们把只拥有一个方法的接口称为 函数式接口
@FunctionalInterface
public interface MyRun extends Runnable {

    public abstract void run();
}
