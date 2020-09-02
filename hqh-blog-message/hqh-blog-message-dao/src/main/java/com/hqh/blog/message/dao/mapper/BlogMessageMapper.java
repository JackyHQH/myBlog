package com.hqh.blog.message.dao.mapper;

import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.message.dao.model.BlogMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMessageMapper {
    long countByExample(BlogMessageExample example);

    int deleteByExample(BlogMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlogMessage record);

    int insertSelective(BlogMessage record);

    List<BlogMessage> selectByExampleWithBLOBs(BlogMessageExample example);

    List<BlogMessage> selectByExample(BlogMessageExample example);

    BlogMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByExample(@Param("record") BlogMessage record, @Param("example") BlogMessageExample example);

    int updateByPrimaryKeySelective(BlogMessage record);

    int updateByPrimaryKeyWithBLOBs(BlogMessage record);

    int updateByPrimaryKey(BlogMessage record);
}