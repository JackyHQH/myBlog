/**
 * 
 */
package com.hqh.mybatis.crud.name;

import com.hqh.mybatis.crud.CrudMethodDefine;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2016年9月16日
 */
public class DefaultCrudMethodDefine implements CrudMethodDefine {

	@Override
	public String selectName() {
		return "selectByPrimaryKey";
	}

	@Override
	public String insertName() {
		return "insert,insertSelective";
	}

	@Override
	public String updateName() {
		return "updateByPrimaryKey,updateByExampleSelective,updateByExampleWithBLOBs,updateByExample,updateByPrimaryKeyWithBLOBs,updateByPrimaryKeySelective";
	}

	@Override
	public String deleteName() {
		return "deleteByPrimaryKey,deleteByExample,deleteByPrimaryKeys";
	}

	@Override
	public String selectAllName() {
		return "selectByExample,selectByExampleWithBLOBs,,selectByExampleWithBLOBsForStartPage,selectByExampleForStartPage,selectByExampleWithBLOBsForOffsetPage,selectByExampleForOffsetPage,selectFirstByExample,selectFirstByExampleWithBLOBs";
	}

}
