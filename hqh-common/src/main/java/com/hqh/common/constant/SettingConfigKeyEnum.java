package com.hqh.common.constant;

/**
 * @Author: lizhangzhou
 * @Version V1.0
 * @Description   参数设置key值（config_key）
 * @Date: 2020/1/9 14:30
 */
public enum SettingConfigKeyEnum {
    shortMsgservice(1,"国大短信服务:"),
    shortMsgUser(2,"国大短信服账号:"),
    shortMsgPwd(3,"国大短信服务密码:"),
    shortMsgSign(4,"国大短信服服务子账户标识:"),
//   以下为声音提示
    voiceSetautoOrder(5,"自动接单"),
    voiceSetotherEquipment(6,"其他设备接单"),
    voiceSetnewOrder(7,"新订单"),
    voiceSetbookingOrder(8,"预约单"),
    voiceSetrefundOrder(9,"退款单"),
    voiceSetcancelOrder(10,"取消单"),
    voiceSetreminder(11,"催单"),
    voiceSetdeliveryError(12,"配送异常"),
    voiceSetprinterBreak(13,"打印机断开"),
    voiceSetnetworkBreak(14,"网络断开"),
    voiceShipCreate(15,"配送单创建"),
    voiceShipReceive(16,"配送员已接单"),
    voiceShipGetGoods(17,"配送员已取货"),
    voiceShipOver(18,"配送单员送达"),
    voiceShipCancel(19,"配送已取消"),
    voiceOrderError(20,"订单异常"),
//    以上为声音提示

    //接单方式 1 手动接单 2 自动接单
//    storePrintisOrder(15,"是否自动确认订单:"),
    storePrintWidth(16,"打印宽度(mm)"),
    storePrintisPrinter(17,"默认打印机:"),
    storePrintisPage(18,"联单显示:"),
    //对应 configValue  on 开启
//    storePrintisPrint(19,"是否开启自动打单:"),
    storePrintSize(20,"打印字体大小"),

//   接单方式 1 手动接单 2 自动接单
    orderTakeway(21,"接单方式"),
    orderTakePrint(19,"自动打单"),
    orderTakeAutoCallrider(22," 自动呼叫骑手"),
    orderTakeAutopicking(23,"自动拣货"),
    posOrderTimeType(24,"选择批次号时间"),
    autoChoosePosLno(25,"是否自动选择批次号"),
    smallTicket(26,"小票设置");



    private Integer code;

    private String settingName;

    SettingConfigKeyEnum(Integer code, String settingName) {
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
