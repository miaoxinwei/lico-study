package com.lico.study.protostuff;

import com.lico.study.protostuff.bean.School;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;
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

    private static School source;
    private static School target;

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

    @BeforeTest
    public void init() {
        source = new School("lico", "hz");
        System.out.println("source >> " + source.toString());

    }

    @Test
    public void protostuff() {
        byte[] data = ProtostuffUtil.serialize(source);
        if (data == null) {
            return;
        }
        target = ProtostuffUtil.deserialize(data, School.class);
    }

    @Test
    public void java() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(os);
        out.writeObject(source);
        byte[] data = os.toByteArray();
        if (data == null) {
            return;
        }
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));
        target = (School) in.readObject();
    }

    @AfterTest
    public void check() {
        if (target == null) {
            System.err.println("序列化失败");
            return;
        }
        System.out.println("target >> " + target.toString());

        assertEquals(source.getName(), target.getName());
        assertEquals(source.getAddress(), target.getAddress());
    }
}
