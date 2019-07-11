package com.jjc.mybatis.typehandler;

import com.jjc.mybatis.core.SexEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义TypeHandler，jdbcType和javaType转换工具类
 */
public class SexEnumTypeHandler extends BaseTypeHandler<SexEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getId());
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int sex = rs.getInt(columnName);
        return SexEnum.lookup(sex);
    }

    @Override
    public SexEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int sex = rs.getInt(columnIndex);
        return SexEnum.lookup(sex);    }

    @Override
    public SexEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int sex = cs.getInt(columnIndex);
        return SexEnum.lookup(sex);
    }
}
