package com.Hyorm;

public interface IHyOrm {

    //链接数据库
    void NewConn(String conn,DbType type,String drive) throws ClassNotFoundException, NoSuchMethodException;

    //创建数据库
    void Create(String conn,DbType type,String drive);

}
