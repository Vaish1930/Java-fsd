package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();

            Metadata metaData = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Exception e) {
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }
}
