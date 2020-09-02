package com.hqh.common.util;


import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * 金额计算u'ti'ls
 */
public class MyUtils {

    /**
     * 实收运费计算公式：
     * 配送费-商户承担的配送费-平台承担的配送费=实收运费
     * <p>
     * 2020-3-7 改  配送费-商户承担的配送费=实收运费
     *
     * @param shippingFee
     * @param shopShipFee
     * @param platformShipFee
     * @return
     */
    public static String getActualAmount(Long shippingFee, Long shopShipFee, Long platformShipFee) {
        if (shippingFee == null) {
            shippingFee = Long.valueOf(0);
        }
        if (shopShipFee == null) {
            shopShipFee = Long.valueOf(0);
        }
        long actualAmount = shippingFee - shopShipFee;
        if (actualAmount != 0) {
            String value = String.valueOf(actualAmount);
            BigDecimal bigDecimal = new BigDecimal(value);
            BigDecimal decimal = bigDecimal.divide(new BigDecimal("100"));
            double num = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            return String.format("%.2f", num);
        }
        return "0.00";
    }

    /**
     * 分转化为元
     *
     * @param shippingFee
     * @return
     */
    public static String fromatMoney(Long shippingFee) {
        // 具体的金额（单位元）
        String formatNum = "0.00";
        if (shippingFee != null) {
            String value = String.valueOf(shippingFee);
            BigDecimal bigDecimal = new BigDecimal(value);
            BigDecimal decimal = bigDecimal.divide(new BigDecimal("100"));
            double num = decimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            formatNum = String.format("%.2f", num);

        }
        return formatNum;

    }

    /**
     * 将平台名字转换为中文
     *
     * @param platformKey
     * @return
     */
    public static String changeKeyToChinese(String platformKey) {
        String changeName = "";
        switch (platformKey) {
            case "meituan":
                changeName = "美团";
                break;
            case "ele":
                changeName = "饿了么";
                break;
            case "gdmall2":
                changeName = "微信商城";
                break;
            case "alijiankang":
                changeName = "阿里健康";
                break;
            case "jingdongjiankang":
                changeName = "京东健康";
                break;
            default:
                changeName = platformKey;
        }
        return changeName;
    }

    /**
     * 时间戳转字符窜格式时间
     *
     * @param timestamp
     * @param format
     * @return
     */
    public static String getDateTimeAsString(Long timestamp, String format) {
        if (timestamp == null) {
            return "--";
        }

        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return localDateTime.format(formatter);
    }

    public static long getZeroTime() {
        //当前时间的时间戳
        Long time = System.currentTimeMillis();
        long zero = time / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset() - 1000 * 3600 * 24;
        return zero;
    }


    public static long getTwoForTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH) - 1, 23, 59, 59);
        return calendar.getTime().getTime();

    }


}
