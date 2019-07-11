package com.jjc.mybatis.lancher;

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
        String sqlConfigXML = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(sqlConfigXML);
        sessionFactory = new SqlSessionFactoryBuilder().build(in);
    }



}
