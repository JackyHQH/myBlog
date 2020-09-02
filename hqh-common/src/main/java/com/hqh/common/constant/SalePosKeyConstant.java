package com.hqh.common.constant;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description pos类型
 * @Date: 2019/12/1 3:49
 */
public enum SalePosKeyConstant {
    gdpos("国大pos");

    private String posName;

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    SalePosKeyConstant(String posName){
        this.posName = posName;
    }
}
