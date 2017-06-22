package com.lico.study.mbean;

/**
 * 项目：lico-study
 * 包名：com.lico.study.mbean
 * 功能：
 * 时间：2017-06-22
 * 作者：呱牛
 */
public class Test {

    public static void main(String[] args) throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initMBeanServer();

        Thread thread = new Thread(() -> {
            System.out.println("run");
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }, "myThread");
//        thread.setDaemon(true);
        thread.start();

    }
}
