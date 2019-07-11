package com.jjc.mybatis.test;


import com.alibaba.fastjson.JSON;
import com.jjc.mybatis.domain.User;
import com.jjc.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest extends BaseTest {

    @Test
    public void testGetUser() {
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectById(1);
        System.out.println(JSON.toJSONString(user));
    }
}
