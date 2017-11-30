package com.lico.study.java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java8.lambda
 * 功能：
 * 时间：2017-11-16
 * 作者：miaoxw
 */
public class ListDemo {

    @Test
    public void foreach() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"));
        for (String str : list) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.length() > 3) {
                    System.out.println(s);
                }
            }
        });

        list.forEach(s -> {
            if (s.length() > 3) {
                System.out.println(s);
            }
        });
    }
}
