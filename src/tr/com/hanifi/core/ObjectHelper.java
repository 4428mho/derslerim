package tr.com.hanifi.core;

import tr.com.hanifi.interfaces.CoreInrefaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObjectHelper extends CoreFiels implements CoreInrefaces {

static {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}
    @Override
    public Connection getConnection() {

    Connection connection=null;
        try {
            connection= DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
