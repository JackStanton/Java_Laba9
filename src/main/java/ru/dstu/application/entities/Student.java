package ru.dstu.application.entities;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "studentSurname")
    private String studentSurname;

    @Column(name = "numberOfRecordBook")
    private String numberOfRecordBook;

    public Student( String studentName, String studentSurname, String numberOfRecordBook) {
//        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.numberOfRecordBook = numberOfRecordBook;
    }

    public Student() {
    }

    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public void setNumberOfRecordBook(String numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", numberOfRecordBook='" + numberOfRecordBook + '\'' +
                '}';
    }
}
