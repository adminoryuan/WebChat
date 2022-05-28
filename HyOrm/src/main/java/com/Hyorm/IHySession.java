package com.Hyorm;

import java.util.List;

public interface IHySession {

    public <T> T SelectOne();

    public <T> List<T> SelectAll();


    public <T> boolean Delete(int id);

    public <T> int Insert(T model);

    public <T> int UpDate(T delete);


}
