package com.Hyorm.ConnPool;

import com.Hyorm.DbType;

import java.sql.Connection;

/**
 * 数据库的连接池
 */
public interface iConnPool {

    void Init(String Constr,String dervice) throws ClassNotFoundException, NoSuchMethodException;

    Connection getDbConn();

}
