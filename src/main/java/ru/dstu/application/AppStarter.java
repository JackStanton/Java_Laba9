package ru.dstu.application;


import ru.dstu.application.dao.entitiesDao.ExamDao;


public class AppStarter {

    public static void main(String[] args) {
        ExamDao studentDao = new ExamDao();
        System.out.println(studentDao.findAll());
    }

}
