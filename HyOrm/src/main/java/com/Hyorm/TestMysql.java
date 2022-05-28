package com.Hyorm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysql {

    public static void main(String[] args) throws SQLException {
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8", "root", "123456");

    }
}
