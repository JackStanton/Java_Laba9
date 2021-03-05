package ru.dstu.application.dao.entitiesDao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.dstu.application.dao.Dao;
import ru.dstu.application.entities.Subject;
import ru.dstu.application.utils.HibernateConnector;

import javax.persistence.EntityManager;
import java.util.List;

public class SubjectDao implements Dao<Subject> {

    private final EntityManager entityManager = HibernateConnector.entityManager;

    @Override
    public List<Subject> findAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Subject", Subject.class).getResultList();
    }

    @Override
    public Subject findById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Subject.class, id);
    }

    @Override
    public void save(Subject obj) {
        Session session = entityManager.unwrap(Session.class);
        session.beginTransaction();
        Transaction transaction = session.getTransaction();
        session.saveOrUpdate(obj);
        transaction.commit();
    }

    @Override
    public void deleteById(long id) {
        Session session = entityManager.unwrap(Session.class);
        Subject obj = findById(id);
        session.delete(obj);
    }
}
