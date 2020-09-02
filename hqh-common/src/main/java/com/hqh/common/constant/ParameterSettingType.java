package com.hqh.common.constant;

/**
 * @Author: lzz
 * @Version V1.0
 * @Description 参数设置类型
 * @Date: 2019/12/5 13：54
 *
2 短信管理  3  门店打印设置 4 语音设置
5 打印单模板 6小票设置  7 消息通知设置
8 审方设置  9 接单设置 10 自动接单设置
11 自动打单  12 自动呼叫骑手设置
 */
public enum ParameterSettingType {

    PLATFORM_ACCOUNT("platformAccount",1),
    SHORT_MESSAGE("shortMsg",2),
    STORE_PRINTING("storePrint",3),
    VOICE_SETTING("voiceSet",4),
    PRINTSHEET_TEMPLATE("printsheet",5),
    SMALLTICKET_SETTING("smallticketSet",6),
    MESSAGE_NOTIFICATION("message",7),
    TRIAL_SET_UP("trialSetp",8),
    ORDER_TAKE("orderTake",9),
    ORDER_TAKE_WAY("orderTakeway",10),
    PRINTIS_PRINT("orderTakePrint",11),
    AUTO_CALLRIDER("orderTakeAutoCallrider",12),
    AUTO_PICKING("orderTakeAutopicking",13);


    private  String typeDesc;
    private  Integer code;

    ParameterSettingType(String typeDesc, Integer code) {
        this.typeDesc = typeDesc;
        this.code = code;
    }


    public String getTypeDesc() {
        return typeDesc;
    }

    public Integer getCode() {
        return code;
    }

}
