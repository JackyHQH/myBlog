package com.hqh.blog.web.constant;

/**
 * Ucenter系统接口结果常量枚举类
 */
public enum WebResultConstant {

    /**
     * 失败
     */
    FAILED(0, "failed"),

    /**
     * 成功
     */
    SUCCESS(1, "success"),
    /**
     * 无权限
     */
    ACCESS_FORBIDDEN(403,"Access forbidden"),

    /**
     *  页面找不到
     */
    PAGE_NOT_FOUND(404,"Page not found"),

    /**
     * 服务器程序出错
     */
    INTERNAL_SERVER_ERROR(500,"Internal server error"),


    /**
     * 无效长度
     */
    INVALID_LENGTH(40511, "Invalid length"),

    /**
     * 用户名不能为空
     */
    EMPTY_USERNAME(40512, "Username cannot be empty"),

    /**
     * 密码不能为空
     */
    EMPTY_PASSWORD(40513, "Password cannot be empty"),

    /**
     * 帐号不存在
     */
    INVALID_USERNAME(50511, "Account does not exist"),

    /**
     * 密码错误
     */
    INVALID_PASSWORD(50512, "Password error"),

    /**
     * 无效帐号
     */
    INVALID_ACCOUNT(50513, "Invalid account"),
    /**
     * 授权失败
     */
    OAUTH_FAIL(50521,"oauth fail"),
    /**
     * 授权账号初始化失败
     */
    OAUTH_INIT_FAIL(50522,"oauth account init fail"),
    /**
     * 账户未激活
     */
    NOT_ACTIVE_ACCOUNT(50523,"account not active"),
    /**
     * 未登录
     */
    NOT_LOGIN(50524,"not login" ),

    /**
     * 账户被锁定
     */

    LOCKED_ACCOUNT(50524,"account locked" ),

    /**
     * 参数不正确
     */
    PARAM_NOT_CORRECT(40531,"param not correct" ),

    /**
     * 手机号不可用
     */

    PHONE_DISABLE(50531,"phone disable"),
    /**
     * 手机号不存在
     */
    PHONE_NOT_EXIST(50532,"phone not exist" ),
    /**
     * 手机验证失败
     */
    PHONE_VERIFY_FAIL(50533,"phone verify fail" ),

    PHONE_CODE_FAIL(50534,"验证码发送失败"),

    /**
     * 验证码验证失败
     */
    CODE_VERIFY_FAIL(50535,"验证码验证失败"),

    PASSWORD_ERROR_MORE(50536,"密码错误太多"),

    PERMISSION_DENIED(50537, "权限不足");

    public int code;

    public String message;

    WebResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
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

}
