package com.omsu.patterns.generative.singleton;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static DataBase instance;
    private Map<String, String> loginsAndPasswords = new HashMap<>();

    private DataBase(){}

    public DataBase getInstance()
    {
        if(DataBase.instance==null)
        {
            DataBase.instance = new DataBase();
        }
        return DataBase.instance;
    }

    public void put(String login, String password) {
        loginsAndPasswords.put(login, password);
    }

}
