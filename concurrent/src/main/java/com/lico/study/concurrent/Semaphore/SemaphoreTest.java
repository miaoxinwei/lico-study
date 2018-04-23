package com.lico.study.concurrent.Semaphore;

import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 项目：lico-study
 * 包名：com.lico.study.concurrent.Semaphore
 * 功能：
 * 时间：2018-04-23
 * 作者：miaoxw
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    System.err.println(Thread.currentThread().getName() + "抢到锁");
                    Thread.sleep(2000);
                    System.err.println(Thread.currentThread().getName() + "释放资源");
                    semaphore.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
