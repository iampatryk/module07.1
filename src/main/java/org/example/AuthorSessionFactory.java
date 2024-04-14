package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AuthorSessionFactory {

    public static SessionFactory getUserSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");

        return configuration.buildSessionFactory();
    }

}
