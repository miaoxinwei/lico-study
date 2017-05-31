package com.lico.study.orika.bean;

/**
 * 项目：lico-study
 * 包名：com.lico.study.orika.bean
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class PersonB {

    private String name;

    private Integer age;

    public PersonB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonB{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
