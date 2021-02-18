package ru.dstu.application;


import ru.dstu.application.entities.Exam;
import ru.dstu.application.entities.Student;
import ru.dstu.application.utils.HibernateUtil;


public class AppStarter {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        HibernateUtil<Student> studentHibernateUtil = new HibernateUtil<Student>(Student.class);
        HibernateUtil<Exam> examHibernateUtil = new HibernateUtil<Exam>(Exam.class);
        examHibernateUtil.displayList();
//        examHibernateUtil.displayItem(20);
//        Student student = studentHibernateUtil.getItem(30);
//        studentHibernateUtil.displayItem(30);
//        student.setStudentName("QQQQQQQQQ");
//        student.setStudentSurname("LLLLLLLLLL");
//        studentHibernateUtil.updateOrSaveItem(student);
//        studentHibernateUtil.displayItem(30);
//        Student newStudent = new Student("GGGGGGGGGG","JJJJJJJJJJ","555555555");
//        studentHibernateUtil.updateOrSaveItem(newStudent);
//        studentHibernateUtil.displayList();
    }
}
