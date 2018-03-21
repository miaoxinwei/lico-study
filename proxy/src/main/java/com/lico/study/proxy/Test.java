package com.lico.study.proxy;

/**
 * 项目：lico-study
 * 包名：com.lico.study.proxy
 * 功能：
 * 时间：2018-03-21
 * 作者：miaoxw
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Master();
        PersonHandler<Person> personHandler = new PersonHandler<>(person);
        person = personHandler.proxy();
        person.say();
    }
}
