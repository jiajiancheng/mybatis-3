package com.jjc.mybatis.lancher;


import com.jjc.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 根据配置文件信息创建与数据库的连接，并返回数据库操作对象
        String sqlConfigXML = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(sqlConfigXML);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testGetUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.selectById(1);
    }
}
