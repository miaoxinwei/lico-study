package com.lico.study.java8.time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.time
 * 功能：
 * 时间：2017-09-22
 * 作者：呱牛
 */
public class LocalDateTime {

    private static final Clock CLOCK = Clock.systemDefaultZone();
    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter FORMATTER3 = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static void main(String[] args) {
        long now = CLOCK.millis();
        long now1 = System.currentTimeMillis();
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
        java.time.LocalDateTime localDateTime1 = java.time.LocalDateTime.now(ZoneId.systemDefault());
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.now(CLOCK);
        java.time.LocalDateTime localDateTime3 = java.time.LocalDateTime.parse("2017-09-22 12:12:12", FORMATTER2);
        java.time.LocalDateTime localDateTime4 = java.time.LocalDateTime.of(2017, 9, 22, 12, 12, 12, 555000000);

        System.err.println("localDateTime---------------------------");
        System.err.println(localDateTime);
        System.err.println(localDateTime1);
        System.err.println(localDateTime2);
        System.err.println(localDateTime3);
        System.err.println(localDateTime4);
        System.err.println("formatter---------------------------");
        System.err.println(localDateTime2.format(FORMATTER1));
        System.err.println(localDateTime2.format(FORMATTER3));
        System.err.println(localDateTime2.withYear(2111).withMonth(1).withDayOfMonth(1).withHour(1).withMinute(1).withSecond(0).format(FORMATTER2));
        System.err.println("timestamp---------------------------");
        System.err.println(localDateTime2.toEpochSecond(ZoneOffset.of("+8")));
        System.err.println(now / 1000);
        System.err.println(now1 / 1000);
        System.err.println(now);
        System.err.println(localDateTime2.toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.err.println("DayOfWeek---------------------------");
        System.err.println(localDateTime2.getDayOfWeek());
        System.err.println(localDateTime2.getDayOfWeek().getValue());
        System.err.println(localDateTime2.getDayOfWeek().plus(-1).getValue());
        System.err.println(localDateTime2.getDayOfWeek().minus(-1).getValue());
    }
}
