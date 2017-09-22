package com.lico.study.java8.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.time
 * 功能：同 Date
 * 时间：2017-09-22
 * 作者：呱牛
 */
public class Instant {


    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        java.time.Instant instant = java.time.Instant.now();
        java.time.Instant instant2 = java.time.Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("EST", ZoneId.SHORT_IDS));

        System.err.println("默认时间: " + instant);
        System.err.println("时区时间: " + instant.atZone(ZoneId.systemDefault()));
        System.err.println("时区时间: " + zonedDateTime);
        System.err.println("时间戳: " + instant.toEpochMilli());
        System.err.println("时间戳 秒: " + instant2.getEpochSecond());
        System.err.println("时间戳 秒: " + zonedDateTime.toEpochSecond());
        System.err.println("系统时间戳: " + now);
        System.err.println("对比时间: " + instant.isBefore(instant2));
        System.err.println("与system时间对比: " + instant.isAfter(java.time.Instant.ofEpochMilli(now)));

        for (int i = 0; i < 2; i++) {
            System.err.println(instant.toEpochMilli());
            Thread.sleep(1000);
        }
    }


}
