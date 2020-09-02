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
public class EmailValidator extends ValidatorHandler<String> implements Validator<String> {

    /** 检测 email 的正则 */
    public static final String EMAIL_REGEX = "^\\w\\S*@([a-zA-Z0-9\\-]+\\.)+[a-zA-Z0-9]{2,4}$";

    private String fieldName;

    public EmailValidator(String fieldName){
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
        if(!Pattern.compile(EMAIL_REGEX).matcher(s).matches()){
            context.addError(ValidationError.create(String.format("%格式不正确！", fieldName))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }
        return true;
    }
}
