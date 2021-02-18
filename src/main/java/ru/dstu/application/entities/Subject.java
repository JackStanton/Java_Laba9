package ru.dstu.application.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Subject")
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "subjectName")
    private String subjectName;

    @Column(name = "countOfHours")
    private long countOfHours;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Exam> exam;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Credit> credit;

    public Subject() {
    }

    public Subject(String subjectName, long countOfHours) {
        this.subjectName = subjectName;
        this.countOfHours = countOfHours;
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

    public long getCountOfHours() {
        return countOfHours;
    }

    public void setCountOfHours(long countOfHours) {
        this.countOfHours = countOfHours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", countOfHours=" + countOfHours +
                '}';
    }
}
