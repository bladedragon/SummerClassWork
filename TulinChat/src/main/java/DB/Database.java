package DB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Database {

    private static Connection connection;
    private static Properties properties;

    static {
        InputStream ins = Database.class.getResourceAsStream("/config.properties");
        properties = new Properties();
//        ComboPooledDataSource ds = new ComboPooledDataSource();

        try {
            properties.load(ins);
            String url = properties.getProperty("mysql.url");
            String user = properties.getProperty("mysql.user");
            String password = properties.getProperty("mysql.password");
            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = ds.getConnection();
            connection = DriverManager.getConnection(url,user,password);

            /*ds.setDriverClass("com.mysql.cj.jdbc.Driver");
            ds.setJdbcUrl(url);
            ds.setUser(user);
            ds.setPassword(password);
            ds.setMaxPoolSize(20);
            ds.setMinPoolSize(1);
            ds.setInitialPoolSize(5);
            ds.setMaxStatements(180);*/
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static Connection getconnection(){
        return connection;
    }

    public static void close(Connection conn,Statement pst,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
