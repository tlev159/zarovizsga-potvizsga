package hu.nive.ujratervezes.zarovizsga.peoplesql;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

public class PeopleDao {

  private JdbcTemplate jdbcTemplate;

  public PeopleDao(DataSource dataSource) {
    jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public String findIpByName(String first_name, String last_name) {
    return jdbcTemplate.queryForObject("SELECT ip_address FROM people WHERE first_name = ? AND last_name = ?",
            new Object[] {first_name, last_name}, (resultSet, i) -> resultSet.getString("ip_address"));
  }
}
