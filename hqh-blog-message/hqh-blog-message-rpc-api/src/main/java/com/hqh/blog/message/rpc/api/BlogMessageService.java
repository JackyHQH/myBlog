package com.hqh.blog.message.rpc.api;

import com.hqh.mybatis.base.BaseService;
import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.message.dao.model.BlogMessageExample;

import java.util.List;

/**
* BlogMessageService接口
*/
public interface BlogMessageService extends BaseService<BlogMessage, BlogMessageExample,Integer> {

    List<BlogMessage> selectAllMessage();

}