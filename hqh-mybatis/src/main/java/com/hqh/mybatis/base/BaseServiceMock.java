package com.hqh.mybatis.base;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 降级实现BaseService抽象类
 */
public abstract class BaseServiceMock<Mapper, Record, Example,PK> implements BaseService<Record, Example,PK> {

	@Override
	public int countByExample(Example example) {
		return -1;
	}

	@Override
	public int deleteByExample(Example example) {
		return -1;
	}

	@Override
	public int deleteByPrimaryKey(PK id) {
		return -1;
	}

	@Override
	public int insert(Record record) {
		return -1;
	}

	@Override
	public int insertSelective(Record record) {
		return -1;
	}

	@Override
	public List<Record> selectByExampleWithBLOBs(Example example) {
		return null;
	}

	@Override
	public List<Record> selectByExample(Example example) {
		return null;
	}

	@Override
	public PageInfo<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize) {
		return null;
	}

	@Override
	public PageInfo<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize) {
		return null;
	}

	@Override
	public List<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit) {
		return null;
	}

	@Override
	public List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit) {
		return null;
	}

	@Override
	public Record selectFirstByExample(Example example) {
		return null;
	}

	@Override
	public Record selectFirstByExampleWithBLOBs(Example example) {
		return null;
	}

	@Override
	public Record selectByPrimaryKey(PK id) {
		return null;
	}

	@Override
	public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example) {
		return -1;
	}

	@Override
	public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example) {
		return -1;
	}

	@Override
	public int updateByExample(@Param("record") Record record, @Param("example") Example example) {
		return -1;
	}

	@Override
	public int updateByPrimaryKeySelective(Record record) {
		return -1;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(Record record) {
		return -1;
	}

	@Override
	public int updateByPrimaryKey(Record record) {
		return -1;
	}

	@Override
	public int deleteByPrimaryKeys(List<PK> ids) {
		return -1;
	}


}