package com.eshare.uflo.example;

import org.hibernate.SessionFactory;
import org.springframework.transaction.PlatformTransactionManager;
import com.bstek.uflo.env.EnvironmentProvider;
public class TestEnvironmentProvider implements EnvironmentProvider {
    private SessionFactory sessionFactory;
    private PlatformTransactionManager platformTransactionManager;
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
 
    public PlatformTransactionManager getPlatformTransactionManager() {
        return platformTransactionManager;
    }
 
    public void setPlatformTransactionManager(
            PlatformTransactionManager platformTransactionManager) {
        this.platformTransactionManager = platformTransactionManager;
    }
    public String getCategoryId() {
        return null;
    }
    public String getLoginUser() {
        return "anonymous";
    }
}