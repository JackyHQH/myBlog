package com.hqh.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description 销售平台key
 * @Date: 2019/11/30 21:26
 */
public enum  SalePlatformKeyConstant {
    meituan("美团",0),
    ele("饿百",1),
    alijiankang("阿里健康",2),
    gdmall2("国大商城2.0",3),
    jingdongdaojia("京东到家",4),
    jingdongjiankang("京东健康",5);

    private String platformName;

    private Integer ppCode;

    SalePlatformKeyConstant(String platformName,Integer ppCode){
        this.platformName = platformName;
        this.ppCode = ppCode;
    }

    public static Map<String, String> typeMap = new HashMap<String, String>();

    static {
        SalePlatformKeyConstant[] salePlatformKeyConstants = SalePlatformKeyConstant.values();
        for (SalePlatformKeyConstant salePlatformKeyConstant : salePlatformKeyConstants) {
            typeMap.put(salePlatformKeyConstant.name(),salePlatformKeyConstant.getPlatformName());
        }
    }


    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Integer getPpCode() {
        return ppCode;
    }

    public void setPpCode(Integer ppCode) {
        this.ppCode = ppCode;
    }
}
