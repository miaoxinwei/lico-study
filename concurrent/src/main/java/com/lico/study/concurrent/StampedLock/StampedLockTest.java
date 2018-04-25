package com.lico.study.concurrent.StampedLock;

/**
 * 项目：lico-study
 * 包名：com.lico.study.concurrent.StampedLock
 * 功能：
 * 时间：2018-04-25
 * 作者：miaoxw
 */
public class StampedLockTest {

    public static void main(String[] args) {
        Point point = new Point();
        System.err.println(point.distanceFromOrigin());
        point.move(3, 4);
        System.err.println(point.distanceFromOrigin());
    }
}
