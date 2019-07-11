package com.jjc.mybatis.lancher;


import com.jjc.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest extends BaseTest {

    @Test
    public void testGetUser() {
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.selectById(1);
    }
}
