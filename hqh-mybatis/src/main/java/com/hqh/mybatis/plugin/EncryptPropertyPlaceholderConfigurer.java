package com.hqh.mybatis.plugin;

import com.hqh.common.util.AESUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 支持加密配置文件插件
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	private String[] propertyNames = {
			"master.jdbc.password", "slave*.jdbc.password",
			"master.redis.password","slave*.redis.password",
			"generator.jdbc.password",
	};

	/**
	 * 解密指定propertyName的加密属性值
	 * @param propertyName
	 * @param propertyValue
	 * @return
	 */
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		for (String p : propertyNames) {
			if(p.contains("*")){
				String regex=p.replace("*", "[0-9]{0,}");
				Matcher m=Pattern.compile(regex).matcher(propertyName);
				if (m.matches()) {
					return AESUtil.aesDecode(propertyValue);
				}
			}else if (p.equalsIgnoreCase(propertyName)) {
				return AESUtil.aesDecode(propertyValue);

			}

		}
		return super.convertProperty(propertyName, propertyValue);
	}

}
