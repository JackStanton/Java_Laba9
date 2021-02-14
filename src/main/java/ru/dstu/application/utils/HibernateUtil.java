package ru.dstu.application.utils;

import org.hibernate.Session;
import ru.dstu.application.entities.Student;

import java.util.List;


public class HibernateUtil {

    private Session session;

    public HibernateUtil() {
        HibernateConnector hibernateConnector = new HibernateConnector();
//        session = hibernateConnector.getSession();
    }


}
