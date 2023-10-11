package template_method.variant.jdbc_template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SpringApplication {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

        // execute SQL without having to take care of obtaining a connection and handling exceptions
        jdbcTemplate.execute("DELETE * FROM table");

        // or query for data and provide some sort of "callback" for further processing
        List<Product> products = jdbcTemplate.query(
                "SELECT id, title FROM products",
                new ProductRowMapper()
        );
        System.out.println(products);
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
