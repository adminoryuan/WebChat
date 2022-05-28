package com.Hyorm.ConnPool;

import com.Hyorm.DbType;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * 数据库连接池
 */

public class DbConnPool implements iConnPool{

    Connection conn;


    @Override
    public void Init(String Constr,String dervice) throws ClassNotFoundException, NoSuchMethodException {

        try {
         Class.forName(dervice).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            conn= DriverManager.getConnection(Constr, "", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Connection getDbConn() {
        return conn;
    }
}
