package com.hqh.common.constant;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description 退款
 * @Date: 2019/11/30 21:26
 */
public enum OrderRefundStatusConstant {
    wait("待退款",0),
    complete("已退款",1),
    part("部分退款",0),
    all("全部退款",1),
    cus("客户",0),
    ser("客服",1),
    shop("商家",2);

    private String name;

    private Integer code;

    OrderRefundStatusConstant(String name, Integer code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
