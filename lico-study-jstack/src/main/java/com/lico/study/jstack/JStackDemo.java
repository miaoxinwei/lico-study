package com.lico.study.jstack;

/**
 * 项目：lico-study
 * 包名：com.lico.study.jstack
 * 功能：
 * 时间：2017-06-22
 * 作者：呱牛
 */
public class JStackDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new DeadLockclass(true), "thread1");
        Thread thread2 = new Thread(new DeadLockclass(false), "thread2");

        thread1.start();
        thread2.start();
    }

    static class DeadLockclass implements Runnable {

        private boolean flag;// 控制线程

        DeadLockclass(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            if (flag) {
                while (true) {
                    synchronized (Do.o1) {
                        System.out.println("o1 is block, " + Thread.currentThread().getName());
                        synchronized (Do.o2) {
                            System.out.println("o2 is block, " + Thread.currentThread().getName());
                        }
                    }
                }
            } else {
                while (true) {
                    synchronized (Do.o2) {
                        System.out.println("o2 is block, " + Thread.currentThread().getName());
                        synchronized (Do.o1) {
                            System.out.println("o1 is block, " + Thread.currentThread().getName());
                        }
                    }
                }
            }
        }
    }

    static class Do {
        private static final Object o1 = new Object();
        private static final Object o2 = new Object();
    }

}


