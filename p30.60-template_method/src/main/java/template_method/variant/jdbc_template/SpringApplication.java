package template_method.variant.jdbc_template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpringApplication {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

        jdbcTemplate.execute("DELETE * FROM table");

        jdbcTemplate.query(
                "SELECT * FROM products",
                new ProductRowMapper()
        );
    }

    static class ProductRowMapper implements RowMapper<Product> {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Product(
                    rs.getLong(0),
                    rs.getString(1)
            );
        }
    }
}
