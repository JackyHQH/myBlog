package com.hqh.common.util;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description ${Description}
 * @Date: 2019/10/18 16:58
 */
public class SnowFlakeUtil {

    private static final SnowFlake s = new SnowFlake(1,1);

    public static Long nextId(){
        return s.nextId();
    }
}
