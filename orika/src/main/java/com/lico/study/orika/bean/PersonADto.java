package com.lico.study.orika.bean;

/**
 * 项目：lico-study
 * 包名：com.lico.study.orika.bean
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class PersonADto {

    private String fullName;

    private Integer age;

    public PersonADto() {
    }

    public PersonADto(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonADto{");
        sb.append("fullName='").append(fullName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
