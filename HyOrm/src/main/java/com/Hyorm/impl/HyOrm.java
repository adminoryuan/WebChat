package com.Hyorm.impl;

import com.Hyorm.ConnPool.DbConnPool;
import com.Hyorm.DbType;
import com.Hyorm.IHyOrm;
import com.Hyorm.IHySession;

public class HyOrm implements IHyOrm {

    DbConnPool pool=new DbConnPool();

    @Override
    public void NewConn(String conn, DbType type, String drive) throws ClassNotFoundException, NoSuchMethodException {
        pool.Init(conn,drive);
    }

    @Override
    public void Create(String conn, DbType type,String drive) {

    }

    /**
     * 返回一个操作对象
     * @return
     */
    public IHySession NewSession(){
        return new HyOrmSession(pool.getDbConn());
    }
}
