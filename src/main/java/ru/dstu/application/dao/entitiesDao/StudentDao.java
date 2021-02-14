package ru.dstu.application.dao.entitiesDao;

import org.hibernate.Session;
import ru.dstu.application.entities.Student;
import ru.dstu.application.utils.HibernateConnector;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDao implements ru.dstu.application.dao.impl.StudentDao {

    private final HibernateConnector hibernateConnector = new HibernateConnector();

    private final EntityManager entityManager = hibernateConnector.getEntityManagerFactory();


    @Override
    public List<Student> findAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Student",Student.class).getResultList();
    }

    @Override
    public Student findById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Student.class, id);
    }

    @Override
    public void update(Student obj) {
        Session session = entityManager.unwrap(Session.class);
        session.update(obj);
    }

    @Override
    public void deleteById(long id) {
        Session session = entityManager.unwrap(Session.class);
        Student student = findById(id);
        session.delete(student);
    }
}
