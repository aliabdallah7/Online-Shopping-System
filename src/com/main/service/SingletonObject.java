package com.main.service;

import java.sql.Connection;

import com.main.utility.DBUtil;

public class SingletonObject
{
    private static Connection con = null;

    // Private constructor to prevent direct instantiation
    private SingletonObject() {}

    public static Connection getInstance()
    {
        if (con == null)
        {
            // Synchronize the creation of the connection instance to ensure thread safety
            synchronized (SingletonObject.class) {
                if (con == null)
                    con = DBUtil.provideConnection();
            }
        }
        return con;
    }
}
