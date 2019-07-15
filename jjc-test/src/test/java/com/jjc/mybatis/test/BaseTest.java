package com.jjc.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.InputStream;

public abstract class BaseTest {

    protected SqlSessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        // 根据配置文件信息创建与数据库的连接，并返回数据库操作对象
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

}
