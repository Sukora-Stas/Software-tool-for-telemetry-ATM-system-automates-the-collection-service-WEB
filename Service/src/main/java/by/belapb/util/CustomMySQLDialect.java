package by.belapb.util;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * Created by Sukora Stas.
 */
public class CustomMySQLDialect extends MySQL5InnoDBDialect {
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
