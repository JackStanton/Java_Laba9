package ru.dstu.application;


import ru.dstu.application.dao.entitiesDao.StudentDao;
import ru.dstu.application.entities.Student;
import ru.dstu.application.utils.HibernateConnector;
import ru.dstu.application.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;


public class AppStarter {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        System.out.println(studentDao.findAll());
    }

}
