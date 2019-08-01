package com;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionStoreBuilder {

    private static SessionFactory INSTANCE;

    public static SessionFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = build();
        }
        return INSTANCE;
    }

    private static SessionFactory build(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try{
            return new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return null;
    }


}
