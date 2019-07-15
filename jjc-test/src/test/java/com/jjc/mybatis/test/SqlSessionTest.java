package com.jjc.mybatis.test;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SqlSessionTest extends BaseTest {

    @Test
    public void testSendSql(){
        SqlSession sqlSession = sessionFactory.openSession();
        Object user = sqlSession.selectOne("selectById", 1);
        System.out.println(JSON.toJSONString(user));
        sqlSession.close();
    }

}
