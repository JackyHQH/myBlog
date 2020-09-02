package com.hqh.blog.message.rpc.api;

import com.hqh.mybatis.base.BaseServiceMock;
import com.hqh.blog.message.dao.mapper.BlogMessageMapper;
import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.message.dao.model.BlogMessageExample;

import java.util.List;

/**
* 降级实现BlogMessageService接口
*/
public class BlogMessageServiceMock extends BaseServiceMock<BlogMessageMapper, BlogMessage, BlogMessageExample,Integer> implements BlogMessageService {

    @Override
    public List<BlogMessage> selectAllMessage() {
        return null;
    }
}
