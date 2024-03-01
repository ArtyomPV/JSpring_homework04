package ru.gb.JavaSpring.HW08.repository.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.JavaSpring.HW08.model.Account;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccounRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account a = new Account();
        a.setId(rs.getInt("id"));
        a.setName(rs.getString("name"));
        a.setAmount(rs.getBigDecimal("amount"));
        return a;
    }
}
