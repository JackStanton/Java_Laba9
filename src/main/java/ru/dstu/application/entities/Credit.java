package ru.dstu.application.entities;

import javax.persistence.*;

@Entity
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "subjectName")
    private String subjectName;

    @Column(name = "countOfHours")
    private int countOfHours;

    @Column(name = "mark")
    private String mark;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Credit(long id, String subjectName, int countOfHours, String mark, Student student) {
        this.id = id;
        this.subjectName = subjectName;
        this.countOfHours = countOfHours;
        this.mark = mark;
        this.student = student;
    }

    public Credit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        return "Credit{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", countOfHours=" + countOfHours +
                ", mark='" + mark + '\'' +
                ", student=" + student +
                '}';
    }
}
