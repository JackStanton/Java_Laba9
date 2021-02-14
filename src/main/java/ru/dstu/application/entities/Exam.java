package ru.dstu.application.entities;

import javax.persistence.*;

@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private double id;

    @Column(name = "subjectName")
    private String subjectName;

    @Column(name = "countOfHours")
    private int countOfHours;

    @Column(name = "mark")
    private String mark;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Exam(double id, String subjectName, int countOfHours, String mark, Student student) {
        this.id = id;
        this.subjectName = subjectName;
        this.countOfHours = countOfHours;
        this.mark = mark;
        this.student = student;
    }

    public Exam() {
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", countOfHours=" + countOfHours +
                ", mark='" + mark + '\'' +
                ", student=" + student +
                '}';
    }
}
