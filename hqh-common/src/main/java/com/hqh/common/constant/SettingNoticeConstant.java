package com.hqh.common.constant;

import java.util.HashMap;
import java.util.Map;

public enum SettingNoticeConstant {
    notice("通知","1"),
    publicNotice("公告","2"),
    remind("催单","3");

    private String noticeTitle;

    private String noticeType;

    SettingNoticeConstant(String noticeTitle, String noticeType){
        this.noticeTitle = noticeTitle;
        this.noticeType = noticeType;
    }

    public static Map<String, String> typeMap = new HashMap<String, String>();

    static {
        SettingNoticeConstant[] settingNoticeConstants = SettingNoticeConstant.values();
        for (SettingNoticeConstant settingNoticeConstant : settingNoticeConstants) {
            typeMap.put(String.valueOf(settingNoticeConstant.getNoticeTitle()),settingNoticeConstant.getNoticeType());
        }
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }
}
