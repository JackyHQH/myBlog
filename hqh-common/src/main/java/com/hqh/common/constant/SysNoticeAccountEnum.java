package com.hqh.common.constant;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description ${Description}
 * @Date: 2019/12/30 18:46
 */
public enum SysNoticeAccountEnum {
    oms_order_notice("oms订单通知账号"),
    ;

    private String accountName;

    SysNoticeAccountEnum(String accountName){
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
