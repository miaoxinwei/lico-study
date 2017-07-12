package com.lico.study.jstack;

/**
 * 项目：lico-study
 * 包名：com.lico.study.jstack
 * 功能：
 * 时间：2017-06-22
 * 作者：呱牛
 */
public class FindJavaThreadInTaskManager {

    public static void main(String[] args) {
        Thread thread = new Thread(new Worker(), "licoThread");
        thread.start();
    }

    static class Worker implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("thread name is " + Thread.currentThread().getName());
            }
        }
    }
}
