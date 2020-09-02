package com.hqh.common.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: lizhangzhou
 * @Version V1.0
 * @Description 获取各平台门店信息封装
 * @Date: 2020/1/20  16:10
 */
@Data
public class PlatformStoreInfo implements Serializable {

    private Integer id;

    private String storeCode;

    private String platformStoreCode;

    private String storeName;

    private Integer status;

    private Integer syncStatus;

    private Integer isUseStandard;

    private Date createTime;

    private Integer sort;

    private Integer groupId;

    private Integer pGroupId;

    private Boolean isDelete;

    private Date lastSyncTime;

    private String platformKey;

    private Integer chainId;

    private String posKey;

    private String groupName;

    private String platformName;

    /**
     * 营业时间时间段（以英文分号隔开）
     *
     * @mbg.generated
     */
    private String shippingTime;

    /**
     * 配送费(美团)
     */
    private String shippingFee;

    /**
     * 门店的营业状态，取值范围：1-可配送；3-休息中。
     * 注意 :设置门店恢复营业状态的角色的权限需要与上一次设置门店置休的角色的权限一致。所以，
     * 即使当前门店是营业状态，但是这个门店上次置休的时候是总部（商家总账号）操作的，
     * 所以再次设置营业状态时仍需要总部设置才可以。如使用接口操作，会返回没有权限的提示。
     */
    private Integer openLevel;

    /**
     * 门店上下线状态，取值范围：1-上线；0-下线
     * 页面不显示 默认1
     */
    private Integer isOnline = 1;
    /**
     * 是否支持营业时间范围内预下单 1-支持；0-不支
     *
     * @mbg.generated
     */
    private Integer isSupportWithinbus;

    /**
     * 是否支持营业时间范围外预下单 1-支持；0-不支
     *
     * @mbg.generated
     */
    private Integer isSupportOutofbus;

    /**
     * 门店地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 门店经度(通用)
     *
     * @mbg.generated
     */
    private String longitude;

    /**
     * 门店维度(通用)
     *
     * @mbg.generated
     */
    private String latitude;

    /**
     * 是否支持开发票 1-支持，0-不支持
     *
     * @mbg.generated
     */
    private Integer invoiceSupport;

    /**
     * 餐盒费(ele 使用)
     *
     * @mbg.generated
     */
    private Long packagePrice;

    /**
     * 客服电话
     *
     * @mbg.generated
     */
    private String servicePhone;

    /**
     * oms配送方式
     *
     * @mbg.generated
     */
    private Integer deliveryTypeId;

    /**
     * 平台配送方式
     *
     * @mbg.generated
     */
    private String platformDeliveryType;

    /**
     * 是否使用平台配送
     *
     * @mbg.generated
     */
    private Boolean isUsePlatform;

    /**
     * 是否使用闪送
     *
     * @mbg.generated
     */
    private Boolean isUseThird;

    /**
     * 是否使用商家自配送
     *
     * @mbg.generated
     */
    private Boolean isUseOneself;

    /**
     * 使用的闪送平台账户
     *
     * @mbg.generated
     */
    private Integer shipAccountId;

    /**
     * 使用的闪送平台标识
     *
     * @mbg.generated
     */
    private String shipPlatformKey;

    /**
     * 使用的闪送平台名称
     *
     * @mbg.generated
     */
    private String shipPlatformName;
    /**
     * 目前最多支持上传两个门店品类
     * ，例如：火锅，特色菜(美团必填项更新)
     */
    private String thirdTagName;

//    /**
//     * 商户图片(ele 必填)
//     */
//    private  String shopLogo;
//    /**
//     * 商户电话,座机必须填写区号
//     */
//    private  String phone;
//
//    /**
//     * ivr_phone	String	是
//     * 订单提醒电话;带区号固话或者手机;3分钟未接单,会拨此电话提醒商户
//     */
//    private  String ivrPhone;
//    /**
//     * 客服电话;最多支持3个;推荐使用改字段;
//     */
//    private  String  service_phones[];
//
//    /**
//     * coord_type	String	是	坐标类型;bdll:百度经纬度;amap:高德经纬度
//     */
//    private String  coordType;

}
