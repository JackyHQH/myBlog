package com.hqh.blog.web.constant;


import com.google.gson.annotations.Expose;

/***
 * @Author: HQH
 * @Description 返回格式统一
 * @Date: 2019/7/11 15:11
 * @Param
 * @return
 */

public class WebResult {

    /**
     * 状态码：1成功，其他为失败
     */
    @Expose
    public int code;

    /**
     * 成功为success，其他为失败原因
     */
    @Expose
    public String message;

    /**
     * 数据结果集
     */
    @Expose
    public Object data;

    public Object count;

    public WebResult(WebResultConstant webResultConstant, Object data, Integer count) {
        this.code = webResultConstant.code;
        this.message = webResultConstant.message;
        this.data = data;
        this.count = count;
    }

    public WebResult(WebResultConstant webResultConstant, Object data) {
        this.code = webResultConstant.code;
        this.message = webResultConstant.message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getCount() {
        return count;
    }

    public void setCount(Object count) {
        this.count = count;
    }
}
