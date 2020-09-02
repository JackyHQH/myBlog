package com.hqh.common.constant;

/**
 * @Author: yantop
 * @Version V1.0
 * @Description ${Description}
 * @Date: 2019/10/21 13:50
 */
public class KafkaTopicCommonConst {

    public static final String GG_PULL_STOCK_TOPIC = "gdpull";

    public static final String ALI_PUSH_STOCK_TOPIC = "alipush";

    public static final String MEITUAN_PUSH_STOCK_TOPIC = "meituanpush";

    public static final String GDMALL_PUSH_STOCK_TOPIC = "gdmall";

    public static final String ELE_PUSH_STOCK_TOPIC = "elepush";

    public static final String JINGDONG_PUSH_STOCK_TOPIC = "jingdongpush";

    public static final String JDDJ_PUSH_STOCK_TOPIC = "jddjpush";

    public static final String SYNC_UPDATE_ORDER_TOPIC = "syncOrder";

    public static final String SYNC_UPDATE_ORDER_BEFORE_TOPIC = "syncOrderBefore";

    /**
     * 全平台库存推送
     */
    public static final String PLATFORM_STOCK_PUSH_TOPIC = "platformstockpush";

    /**
     * 热销品库存推送
     */
    public static final String PLATFORM_HOT_STOCK_PUSH_TOPIC = "hotstockpush";

    /**
     * 库存推送添加日志
     */
    public static final String PUSH_STOCK_LOG_TOPIC = "stocklog";

    /**
     * oms订单消息
     */
    public static final String ORDER_TOPIC = "omsorder";

    /**
     * 预约订单
     */
    public static final String APPOINTMENT_ORDER_TOPIC = "order_appoint";

    /**
     * 订单预销账数据生成
     */
    public static final String POS_PREVIEW_CREATE_TOPIC = "pos_preview_create";

    /**
     * 生成配送单信息
     */
    public static final String ORDER_SHIP_CREATE_TOPIC = "order_ship_create";

    /**
     * 配送对账表数据定时插入
     */
    public static final String SYNC_ORDER_DELIVERY_TOPIC = "syncOrderDelivery";
    /**
     * 京东健康所有商品拉取同步
     */

    public static final String JDHEALTH_SYNC_ALL_PRODUCT = "jdhealthSyncAllProduct";

    /**
     * 更改商品推送状态
     */
    public static final String CHANGE_STOCK_STATUS_TOPIC = "changeStockStatus";


}
