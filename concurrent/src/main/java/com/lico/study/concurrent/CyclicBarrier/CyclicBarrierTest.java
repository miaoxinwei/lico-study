package com.lico.study.concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 项目：lico-study
 * 包名：com.lico.study.concurrent.CyclicBarrier
 * 功能：
 * 时间：2018-04-20
 * 作者：miaoxw
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.err.println(Thread.currentThread().getName() + "处理通知"));
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        executor.execute(() -> {
            System.err.println(Thread.currentThread().getName() + "处理完毕, 等待其他线程写入完毕");
            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.println("所有线程处理完成, 处理下个任务");
        });
        executor.execute(() -> {
            System.err.println(Thread.currentThread().getName() + "处理完毕, 等待其他线程写入完毕");
            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.println("所有线程处理完成, 处理下个任务");
        });
        executor.execute(() -> {
            System.err.println(Thread.currentThread().getName() + "处理完毕, 等待其他线程写入完毕");
            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.println("所有线程处理完成, 处理下个任务");
        });
    }
}
