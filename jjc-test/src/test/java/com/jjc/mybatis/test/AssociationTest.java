package com.jjc.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.jjc.mybatis.domain.Employee;
import com.jjc.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AssociationTest extends BaseTest {

    @Test
    public void testAssociation(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectByPrimaryKey(1);
        System.out.println("第一次查询：" + JSON.toJSONString(employee.getId()));
        System.out.println("第二次查询：" + JSON.toJSONString(employee));
    }

}
