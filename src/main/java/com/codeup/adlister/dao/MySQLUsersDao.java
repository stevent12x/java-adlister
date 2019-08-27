package com.codeup.adlister.dao;

import com.codeup.adlister.config.Config;
import com.codeup.adlister.models.User;
import java.sql.Connection;

public class MySQLUsersDao implements Users{

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
