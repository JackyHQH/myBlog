package com.hqh.blog.message.rpc.service.impl;

import com.hqh.blog.message.util.tools;
import com.hqh.mybatis.base.BaseServiceImpl;
import com.hqh.blog.message.dao.mapper.BlogMessageMapper;
import com.hqh.blog.message.dao.model.BlogMessage;
import com.hqh.blog.message.dao.model.BlogMessageExample;
import com.hqh.blog.message.rpc.api.BlogMessageService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* BlogMessageService实现
*/
@Service(
version = "1.0",
application = "${dubbo.application.id}",
protocol = "${dubbo.protocol.id}",
registry = "${dubbo.registry.id}")
public class BlogMessageServiceImpl extends BaseServiceImpl<BlogMessageMapper, BlogMessage, BlogMessageExample,Integer> implements BlogMessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogMessageServiceImpl.class);

    @Autowired
    BlogMessageMapper blogMessageMapper;


    @Override
    public List<BlogMessage> selectAllMessage() {
        BlogMessageExample blogMessageExample = new BlogMessageExample();
        blogMessageExample.createCriteria().andPidEqualTo(0);
        return blogMessageMapper.selectByExample(blogMessageExample);
    }
}