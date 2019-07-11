package com.jjc.mybatis.lancher;

import com.jjc.mybatis.domain.SingleTableDomain;
import com.jjc.mybatis.mapper.SingleTableMapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SingleTableTest extends BaseTest {

    @Test
    public void initSingleTable() {
        SqlSession session = sessionFactory.openSession();
        SingleTableMapper mapper = session.getMapper(SingleTableMapper.class);
        for (int i = 0; i < 10000; i++) {
            SingleTableDomain domain = new SingleTableDomain();
            domain.setKey1(RandomStringUtils.randomAscii(1));
            domain.setKey2(RandomUtils.nextInt(0, 100000));
            domain.setKey3(RandomStringUtils.randomAscii(1));
            domain.setKey_part1(RandomStringUtils.randomAscii(1));
            domain.setKey_part2(RandomStringUtils.randomAscii(1));
            domain.setKey_part3(RandomStringUtils.randomAscii(1));
            domain.setCommon_field(RandomStringUtils.randomAscii(1));
            try {
                mapper.insertSingleTableDomain(domain);
            } catch (Exception e) {

            }
        }
        session.commit();
    }

}
