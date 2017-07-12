package com.lico.study.mbean;

import org.softee.management.annotation.*;
import org.softee.management.helper.MBeanRegistration;

/**
 * 项目：lico-study
 * 包名：com.lico.study.mbean
 * 功能：
 * 时间：2017-06-22
 * 作者：呱牛
 */
@MBean(objectName= "pojo-agent-test:name=HelloWorld")
@Description("HelloWorld MBean")
public class HelloWorld {

    private String name;
    private int age;

    @ManagedOperation
    @Description("print the name and age")
    public void print() {
        System.out.println("name=" + name + ", age=" + age);
    }

    @ManagedOperation
    @Description("increment the age and then return the new age")
    public int incrementAge(@Parameter("age") int age) {
        this.age = this.age + age;
        return this.age;
    }

    @ManagedOperation
    public boolean setNameAndAge(String name, int age) {
        this.age = age;
        this.name = name;
        return true;
    }

    @ManagedAttribute
    public String getName() {
        return name;
    }

    @ManagedAttribute
    public void setName(String name) {
        this.name = name;
    }

    @ManagedAttribute
    public int getAge() {
        return age;
    }

    @ManagedAttribute
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 把MBean注册到MBeanServer中
     *
     * @throws Exception
     */
    public void initMBeanServer() throws Exception {
        new MBeanRegistration(this).register();
    }
}
