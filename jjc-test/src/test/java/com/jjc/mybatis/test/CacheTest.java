package com.jjc.mybatis.test;

import com.jjc.mybatis.domain.Employee;
import com.jjc.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CacheTest extends BaseTest {

    /**
     * 一级缓存
     */
    @Test
    public void testFirstCache(){
        SqlSession sqlSession = sessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee1 = mapper.selectByPrimaryKey(1);
        System.out.println("--------------------------11111111:" + employee1.getMobile());
        Employee employee2 = mapper.selectByPrimaryKey(1);
        System.out.println("--------------------------22222222:" + employee2.getMobile());
        System.out.println("--------------------------22222222:" + employee2.getTasks());
    }

    /**
     * 一级缓存，失败
     */
    @Test
    public void testFirstCacheFailure(){
        SqlSession sqlSession1 = sessionFactory.openSession();
        EmployeeMapper mapper1 = sqlSession1.getMapper(EmployeeMapper.class);
        Employee employee1 = mapper1.selectByPrimaryKey(1);
        System.out.println("--------------------------11111111:" + employee1.getMobile());


        SqlSession sqlSession2 = sessionFactory.openSession();
        EmployeeMapper mapper2 = sqlSession2.getMapper(EmployeeMapper.class);
        Employee employee2 = mapper2.selectByPrimaryKey(1);
        System.out.println("--------------------------22222222:" + employee2.getMobile());
    }


    @Test
    public void testSecondCache(){
        SqlSession sqlSession1 = sessionFactory.openSession();
        EmployeeMapper mapper1 = sqlSession1.getMapper(EmployeeMapper.class);
        Employee employee1 = mapper1.selectByPrimaryKey(1);
        System.out.println("--------------------------11111111:" + employee1.getMobile());
//        System.out.println("--------------------------11111111:" + employee1.getTasks());
        sqlSession1.close();

        SqlSession sqlSession2 = sessionFactory.openSession();
        EmployeeMapper mapper2 = sqlSession2.getMapper(EmployeeMapper.class);
        Employee employee2 = mapper2.selectByPrimaryKey(1);
        System.out.println("--------------------------22222222:" + employee2.getMobile());
        System.out.println("--------------------------22222222:" + employee2.getTasks());
        sqlSession2.close();
    }

}
