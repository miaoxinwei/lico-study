package com.lico.study.protostuff;

import java.io.Serializable;

/**
 * 项目：lico-study
 * 包名：com.lico.study.protostuff
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class School implements Serializable {

    private static final long serialVersionUID = -1527472841243866233L;

    private String name;
    private String address;

    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("School{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
