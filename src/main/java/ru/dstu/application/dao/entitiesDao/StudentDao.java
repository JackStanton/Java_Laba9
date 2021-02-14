package ru.dstu.application.dao.entitiesDao;

import org.hibernate.Session;
import ru.dstu.application.dao.Dao;
import ru.dstu.application.entities.Student;
import ru.dstu.application.utils.HibernateConnector;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDao implements Dao<Student> {

    private final HibernateConnector hibernateConnector = new HibernateConnector();
    private final EntityManager entityManager = hibernateConnector.getEntityManagerFactory();

    @Override
    public List<Student> findAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    public Student findById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Student.class, id);
    }

    @Override
    public void save(Student obj) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(obj);
    }

    @Override
    public void deleteById(long id) {
        Session session = entityManager.unwrap(Session.class);
        Student obj = findById(id);
        session.delete(obj);
    }
}
