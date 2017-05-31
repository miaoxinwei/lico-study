package com.lico.study.orika;

import com.alibaba.fastjson.JSON;
import com.lico.study.orika.bean.PersonA;
import com.lico.study.orika.bean.PersonADto;
import com.lico.study.orika.bean.PersonB;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 项目：lico-study
 * 包名：com.lico.study.orika
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class test {

    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static PersonA personA;
    private static PersonADto personADto;
    private static PersonB personB;


    @BeforeTest
    private void beforeTest() {
        personA = new PersonA("lico", 26);
        personADto = new PersonADto();
        personB = new PersonB();

        System.out.println("beforeTest >> personA >> " + JSON.toJSONString(personA, true));
        System.out.println("beforeTest >> personADto >> " + JSON.toJSONString(personADto, true));
        System.out.println("beforeTest >> personB >> " + JSON.toJSONString(personB, true));
        System.out.println("=========================");
    }

    /**
     * byDefault: 默认
     * register: 注册
     */
    @Test
    private void classMapBuilderTest1() {
        mapperFactory.classMap(PersonA.class, PersonADto.class)
                .byDefault()
                .register();

        mapperFactory.getMapperFacade().map(personA, personADto);
    }

    /**
     * field: 双向 不同名参数匹配
     */
    @Test
    private void classMapBuilderTest2() {
        mapperFactory.classMap(PersonA.class, PersonADto.class)
                .field("name", "fullName")
                .byDefault()
                .register();

        mapperFactory.getMapperFacade().map(personA, personADto);
    }

    /**
     * fieldAToB: 单向 不同名参数匹配
     */
    @Test
    private void classMapBuilderTest3() {
        personADto = new PersonADto("lico", 26);
        personA = new PersonA();

        mapperFactory.classMap(PersonA.class, PersonADto.class)
                .fieldAToB("name", "fullName")
                .byDefault()
                .register();

        mapperFactory.getMapperFacade().map(personADto, personA);
    }

    /**
     * exclude: 排除
     */
    @Test
    private void classMapBuilderTest4() {
        mapperFactory.classMap(PersonA.class, PersonADto.class)
                .field("name", "fullName")
                .exclude("age")
                .byDefault()
                .register();

        mapperFactory.getMapperFacade().map(personA, personADto);
    }

    @AfterTest
    private void afterTest() {
        System.out.println("afterTest >> personA >> " + JSON.toJSONString(personA, true));
        System.out.println("afterTest >> personADto >> " + JSON.toJSONString(personADto, true));
        System.out.println("afterTest >> personB >> " + JSON.toJSONString(personB, true));
    }
}
