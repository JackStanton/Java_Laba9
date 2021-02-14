package ru.dstu.application.utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class HibernateConnector {

    private static final String PERSISTENT_UNIT_NAME = "item-manager";

    public HibernateConnector() {
    }

    public EntityManager getEntityManagerFactory(){
        return Persistence.createEntityManagerFactory(PERSISTENT_UNIT_NAME).createEntityManager();
    }
}
