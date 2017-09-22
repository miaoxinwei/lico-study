package com.lico.study.java8.time;

import java.time.ZoneId;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.time
 * 功能：时钟
 * 时间：2017-09-22
 * 作者：呱牛
 */
public class Clock {

    public static final java.time.Clock CLOCK = java.time.Clock.systemDefaultZone();

    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        java.time.Clock clock = java.time.Clock.systemUTC();
        java.time.Clock clock1 = java.time.Clock.systemDefaultZone();
        java.time.Clock clock2 = java.time.Clock.system(ZoneId.systemDefault());
        java.time.Clock clock3 = java.time.Clock.tickMillis(ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));

        System.err.println(clock);
        System.err.println(clock1);
        System.err.println(clock2);
        System.err.println(clock3);
        System.err.println("---------------------------");
        System.err.println(clock.instant());
        System.err.println(clock1.instant());
        System.err.println(clock2.instant());
        System.err.println(clock3.instant());
        System.err.println("---------------------------");
        System.err.println(clock.getZone());
        System.err.println(clock1.getZone());
        System.err.println(clock2.getZone());
        System.err.println(clock3.getZone());
        System.err.println("---------------------------");
        System.err.println(now);
        System.err.println(clock.millis());
        System.err.println(clock1.millis());
        System.err.println(clock2.millis());
        System.err.println(clock3.millis());
        System.err.println("---------------------------");

        for (int i = 0; i < 5; i++) {
            System.err.println(CLOCK.millis());
            Thread.sleep(1000);
        }
    }
}
