package com.lico.study.lombok;

import com.lico.study.lombok.bean.Person;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lombok
 * 功能：
 * 时间：2017-06-05
 * 作者：呱牛
 */
public class test {

    private static Person person = null;
    private static Person person2 = null;

    @BeforeTest
    public void before() {
        person = new Person("", 1);
        person2 = new Person();
    }

    @Test
    public void testNameNull() {
        person2.setName(null);
    }

    @AfterTest
    public void after() {
        System.out.println(person.toString());
        System.out.println(person2.toString());
    }
}
