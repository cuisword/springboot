package org.example.lianjie;


import com.sun.jdi.connect.spi.Connection;

public class LianJie {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
