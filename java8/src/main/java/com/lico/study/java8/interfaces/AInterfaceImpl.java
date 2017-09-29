package com.lico.study.java8.interfaces;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.interfaces
 * 功能：
 * 时间：2017-09-29
 * 作者：呱牛
 */
public class AInterfaceImpl implements AInterface {

    @Override
    public void aCall() {
        aPrint(y);
    }

    @Override
    public void call() {
        print(x);
    }

    public static void main(String[] args) {
        AInterfaceImpl aInterface = new AInterfaceImpl();
        aInterface.call();
        aInterface.aCall();

        aInterface.print("1");
        aInterface.aPrint("2");

        System.err.println(AInterface.x);
        System.err.println(AInterface.y);
        AInterface.say();
    }
}
