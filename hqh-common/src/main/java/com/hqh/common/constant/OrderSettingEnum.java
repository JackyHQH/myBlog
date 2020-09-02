package com.hqh.common.constant;

/**
 * @Author: lizhangzhou
 * @Version V1.0
 * @Description  接单设置枚举
 * @Date: 2020/1/6 14:30
 */
public enum OrderSettingEnum {
    storePrintisPrinter(1,"默认打印机"),
    voiceSetautoOrder(2,"自动接单"),
    voiceSetnewOrder(3,"新订单"),
    voiceSetbookingOrder(4,"预约单"),
    voiceSetrefundOrder(5,"退款单"),
    voiceSetcancelOrder(6,"取消单"),
    voiceSetreminder(7,"催单"),
    voiceSetdeliveryError(8,"配送异常"),
//    storePrintisPrint(9,"自动打单"),
    orderTakePrint(19,"自动打单"),
    orderTakeAutoCallrider(10," 自动呼叫骑手"),
    orderTakeAutopicking(11,"自动拣货");

    private Integer code;

    private String settingName;

    OrderSettingEnum(Integer code, String settingName) {
        this.code = code;
        this.settingName = settingName;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

}
