package com.lico.study.concurrent.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 项目：lico-study
 * 包名：com.lico.study.concurrent.ReentrantLock
 * 功能：
 * 时间：2018-04-24
 * 作者：miaoxw
 */
public class ReentrantLockTest {

    public static void main(String[] args) {
        Work work = new Work();
        new Thread(work, "thread-1").start();
        new Thread(work, "thread-2").start();
        new Thread(work, "thread-3").start();

    }

    static class Work implements Runnable {
        private ReentrantLock lock = new ReentrantLock(true);

        @Override
        public void run() {
            try {
                lock.lock();
                System.err.println(Thread.currentThread().getName() + "run");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
