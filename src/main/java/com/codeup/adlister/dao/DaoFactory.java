package com.codeup.adlister.dao;
import com.codeup.adlister.config.Config;

public class DaoFactory {
    private static Users usersDao;
    private static Ads adsDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao();
        }
        return usersDao;
    }
}