package com.Hyorm.impl;

import com.Hyorm.IHySession;

import java.sql.Connection;
import java.util.List;

public class HyOrmSession implements IHySession {

    private Connection _Con;
    public HyOrmSession(Connection conn){
        _Con=conn;
    }


    @Override
    public <T> T SelectOne() {
        return null;
    }

    @Override
    public <T> List<T> SelectAll() {
        return null;
    }

    @Override
    public <T> boolean Delete(int id) {
        return false;
    }

    @Override
    public <T> int Insert(T model) {
        return 0;
    }

    @Override
    public <T> int UpDate(T delete) {
        return 0;
    }
}
