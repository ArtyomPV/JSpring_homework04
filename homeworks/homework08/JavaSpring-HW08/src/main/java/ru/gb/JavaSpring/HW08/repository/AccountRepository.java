package ru.gb.JavaSpring.HW08.repository;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.gb.JavaSpring.HW08.aspects.LoggedExecution;
import ru.gb.JavaSpring.HW08.model.Account;
import ru.gb.JavaSpring.HW08.repository.mappers.AccounRowMapper;

import java.math.BigDecimal;
import java.util.List;

@Repository
@AllArgsConstructor
public class AccountRepository {
    private final JdbcTemplate jdbc;
    @LoggedExecution
    public Account findAccountById(long id){
        String sql = "SELECT * FROM account WHERE id = ?";
        return jdbc.queryForObject(sql, new AccounRowMapper(), id);
    }
    @LoggedExecution
    public List<Account> findAllAccounts(){
        String sql = "SELECT * FROM account";
        return jdbc.query(sql, new AccounRowMapper());
    }
    @LoggedExecution
    public void changeAmount(BigDecimal amount, long id){
        String sql = "UPDATE account SET amount = ? WHERE id = ?";
        jdbc.update(sql, amount, id);
    }
}
