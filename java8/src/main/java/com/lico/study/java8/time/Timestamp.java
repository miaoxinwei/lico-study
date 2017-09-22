package com.lico.study.java8.time;

import org.joda.time.DateTime;

import java.time.Clock;
import java.time.Instant;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.time
 * 功能：
 * 时间：2017-09-22
 * 作者：呱牛
 */
public class Timestamp {

    private static final java.time.Clock CLOCK = Clock.systemDefaultZone();

    public static void main(String[] args) {
        system();
        clock();
        instant();
        jodatime();

//        SecureRandom.getInstanceStrong().getAlgorithm();
    }

    private static void system() {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 20000000; i++) {
            System.currentTimeMillis();
        }
        System.err.println("system: " + (System.currentTimeMillis() - s));
    }

    private static void clock() {
        long s = CLOCK.millis();
        for (int i = 0; i < 20000000; i++) {
            CLOCK.millis();
        }
        System.err.println("clock: " + (CLOCK.millis() - s));
    }

    private static void instant() {
        long s = Instant.now().toEpochMilli();
        for (int i = 0; i < 20000000; i++) {
            Instant.now().toEpochMilli();
        }
        System.err.println("instant: " + (Instant.now().toEpochMilli() - s));
    }

    private static void jodatime() {
        long s = DateTime.now().getMillis();
        for (int i = 0; i < 20000000; i++) {
            DateTime.now().getMillis();
        }
        System.err.println("jodatime: " + (DateTime.now().getMillis() - s));
    }
}
