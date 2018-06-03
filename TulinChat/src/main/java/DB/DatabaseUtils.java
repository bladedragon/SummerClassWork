package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {
    public void InsertSql(String context, String username,String date ){
        try {
            Connection connection = Database.getconnection();
            Statement statement = connection.createStatement();
            statement.execute("INSERT into robotchat (context,username,date) value('" + context + "','" + username + "','"+date+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void SelectSql(String context, String username, String date) throws SQLException {
        Connection connection = Database.getconnection();
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery("select * from robotchat by order id");
    }
}
