package by.belapb.util;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Sukora Stas.
 */
public class MySQLConnect {
    public static void main(String[] args) {

        System.out.println("------- Проверка подключения к MySQL -------");

        Connection connection = null;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:2016/test",
                    "root","");
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

        if(null != connection) {
            System.out.println("------- Подключение установлено -------");
        } else {
            System.out.println("------- Подключение НЕ установлено -------");
        }
    }
}
