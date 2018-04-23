package com.lico.study.concurrent.CountDownLatch;

import java.util.concurrent.*;

/**
 * 项目：lico-study
 * 包名：com.lico.study.concurrent.CountDownLatch
 * 功能：
 * 时间：2018-04-18
 * 作者：miaoxw
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,
                3,
                1L,
                TimeUnit.DAYS,
                new LinkedBlockingQueue<>(1000),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()
        );
        executor.execute(() -> {
            System.err.println("线程1执行");
            countDownLatch.countDown();
        });
        executor.execute(() -> {
            System.err.println("线程2执行");
            countDownLatch.countDown();
        });
        executor.execute(() -> {
            System.err.println("线程3执行");
            countDownLatch.countDown();
        });
        executor.shutdown();
        System.err.println("等待线程结束");
        countDownLatch.await();
        System.err.println("运行结束");
    }
}
