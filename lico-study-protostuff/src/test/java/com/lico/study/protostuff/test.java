package com.lico.study.protostuff;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;


/**
 * 项目：lico-study
 * 包名：com.lico.study.protostuff
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class test {

    /**
     * 产生一个随机的字符串
     */
    public static String randomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int strlen = str.length();
        Random random = new Random();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int num = random.nextInt(strlen);
            buf.append(str.charAt(num));
        }
        return buf.toString();
    }

    @Test
    public void run() {
        School source = new School("lico", "hz");
        System.out.println("source >> " + source.toString());
        byte[] data = ProtostuffUtil.serialize(source);
        if (data == null) {
            System.err.println("序列化失败");
            return;
        }
        School target = ProtostuffUtil.deserialize(data, School.class);
        if (target == null) {
            System.err.println("反序列化失败");
            return;
        }
        System.out.println("target >> " + target.toString());

        assertEquals(source.getName(), target.getName());
        assertEquals(source.getAddress(), target.getAddress());
    }
}
