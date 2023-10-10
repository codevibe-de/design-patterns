package chain.variant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Application {

    public static void main(String[] args) throws Exception {
        Class.forName("simple.SimpleDriver");
        final Connection con = DriverManager.getConnection("jdbc:simple//xyz");
        System.out.println(con.getClass().getName());
    }

}
