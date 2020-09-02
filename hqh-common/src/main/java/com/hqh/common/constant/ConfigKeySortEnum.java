package com.hqh.common.constant;

/**
 * @Author: lizhangzhou
 * @Version V1.0
 * @Description   参数设置key值分类（config_key）
 * @Date: 2020/1/10 14:41
 */
public enum ConfigKeySortEnum {

    shortMsg(1,"短信服务"),
    voice(2,"语音播报"),
    storePrint(3,"打印"),
    orderTake(4,"接单设置"),
    msgNotice(5,"消息通知"),
    posOrder(6,"销账"),
    smallTicket(7,"小票设置");

    private Integer code;
    private String sortName;

    ConfigKeySortEnum(Integer code, String sortName) {
        this.code = code;
        this.sortName = sortName;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
