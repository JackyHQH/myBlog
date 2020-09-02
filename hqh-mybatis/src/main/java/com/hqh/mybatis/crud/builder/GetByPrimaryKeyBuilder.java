/**
 * 
 */
package com.hqh.mybatis.crud.builder;

import com.hqh.mybatis.crud.GeneralSqlGenerator;
import com.hqh.mybatis.crud.helper.ColumnMapper;
import com.hqh.mybatis.crud.helper.EntityHelper;
import com.hqh.mybatis.crud.helper.EntityMapper;
import com.hqh.mybatis.crud.helper.TableMapper;
import com.hqh.mybatis.parser.EntityInfo;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2015年12月2日
 * @Copyright (c) 2015, jwww
 */
public class GetByPrimaryKeyBuilder {

	/**
	 * @param configuration
	 * @param entity
	 */
	public static void build(Configuration configuration, LanguageDriver languageDriver, EntityInfo entity) {
		String msId = entity.getMapperClass().getName() + "." + GeneralSqlGenerator.methodDefines.selectName();

		EntityMapper entityMapper = EntityHelper.getEntityMapper(entity.getEntityClass());

		String sql = buildGetByIdSql(entityMapper);

		SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, entity.getEntityClass());
		
		MappedStatement.Builder statementBuilder = new MappedStatement.Builder(configuration, msId, sqlSource,SqlCommandType.SELECT);

		// 将返回值修改为实体类型
		MappedStatement statement = statementBuilder.build();
		setResultType(configuration, statement, entity.getEntityClass());
		
		configuration.addMappedStatement(statement);
	}

	
	private static String buildGetByIdSql(EntityMapper entityMapper) {

		// 从表注解里获取表名等信息
		TableMapper tableMapper = entityMapper.getTableMapper();
		Set<ColumnMapper> columnsMapper = entityMapper.getColumnsMapper();
		return new SQL() {
            {
                SELECT("*");
                FROM(tableMapper.getName());
                for (ColumnMapper columnMapper : columnsMapper) {
        			if (columnMapper.isId()) {
        				WHERE(columnMapper.getColumn() + "=#{" + columnMapper.getProperty() + "}");
        			}
        		}
            }
        }.toString();
	}

	
	/**
	 * 设置返回值类型
	 *
	 * @param ms
	 * @param entityClass
	 */
	private static void setResultType(Configuration configuration, MappedStatement ms, Class<?> entityClass) {
        List<ResultMap> resultMaps = new ArrayList<ResultMap>();
        resultMaps.add(getResultMap(configuration,entityClass));
        MetaObject metaObject = SystemMetaObject.forObject(ms);
        metaObject.setValue("resultMaps", Collections.unmodifiableList(resultMaps));
	}
	
	/**
     * 生成当前实体的resultMap对象
     *
     * @param configuration
     * @return
     */
	public static ResultMap getResultMap(Configuration configuration,Class<?> entityClass) {
        List<ResultMapping> resultMappings = new ArrayList<ResultMapping>();
        
        Set<ColumnMapper> entityClassColumns = EntityHelper.getEntityMapper(entityClass).getColumnsMapper();
        for (ColumnMapper entityColumn : entityClassColumns) {
            ResultMapping.Builder builder = new ResultMapping.Builder(configuration, entityColumn.getProperty(), entityColumn.getColumn(), entityColumn.getJavaType());
            if (entityColumn.getJdbcType() != null) {
                builder.jdbcType(entityColumn.getJdbcType());
            }

            List<ResultFlag> flags = new ArrayList<ResultFlag>();
            if (entityColumn.isId()) {
                flags.add(ResultFlag.ID);
            }
            builder.flags(flags);
            builder.lazy(false);
            resultMappings.add(builder.build());
        }
        ResultMap.Builder builder = new ResultMap.Builder(configuration, "BaseResultMap", entityClass, resultMappings, true);
        return builder.build();
    }
}
