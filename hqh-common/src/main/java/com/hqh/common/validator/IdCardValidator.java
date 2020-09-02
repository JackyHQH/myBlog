package com.hqh.common.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

public class IdCardValidator extends ValidatorHandler<String> implements Validator<String> {

    private static int[] weight = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 }; // 十七位数字本体码权重

    private static char[] validates = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' }; // mod11,对应校验码字符值

    private String fieldName;

    public IdCardValidator(String fieldName){
        this.fieldName=fieldName;
    }

    // 得到校验码
    private char getCheckoutCode(String Idnumber17) {
        int sum = 0; // wi*Ai和
        int mod = 0; // 进行模11运算
        try {
            for (int i = 0; i < 17; i++) {
                sum += Integer.parseInt(String.valueOf(Idnumber17.charAt(i)))
                        * weight[i];
            }
        } catch (Exception e) {
            return 'a';
        }
        mod = sum % 11;// 进行模11运算
        return validates[mod];// 返回校验码
    }

    @Override
    public boolean validate(ValidatorContext context, String s) {
        if (null == s) {
            context.addError(ValidationError.create(String.format("%s不能为空！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        String id17 = s.substring(0,17);
        char id1 = s.charAt(17);
        if(getCheckoutCode(id17) != id1){
            context.addError(ValidationError.create(String.format("%s格式不正确！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        return true;
    }
}
