package com.lico.study.orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * 项目：lico-study
 * 包名：com.lico.study.orika
 * 功能：
 * 时间：2017-05-31
 * 作者：呱牛
 */
public class OrikaUtil {

    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    /**
     * 同参数名copy
     *
     * @param source
     * @param target
     */
    public static void copyProperties(Object source, Object target) {
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        mapperFacade.map(source, target);
    }
}
