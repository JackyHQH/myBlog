package com.hqh.common.validator;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

import java.util.regex.Pattern;

/**
 * @author Jianghui
 * @version V1.0
 * @description ${DESCRIPTION}
 * @date 2018-05-13 16:21
 */
public class PhoneValidator  extends ValidatorHandler<String> implements Validator<String> {

    /** 检测 手机号 的正则 */
    public static final String PHONE_REGEX = "^[1][1-9][0-9]{9}$";

    private String fieldName;

    public PhoneValidator(String fieldName){
        this.fieldName=fieldName;
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
        if(!Pattern.compile(PHONE_REGEX).matcher(s).matches()){
            context.addError(ValidationError.create(String.format("%s格式不正确！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        return true;
    }

}
