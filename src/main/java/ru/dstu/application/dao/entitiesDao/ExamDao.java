package ru.dstu.application.dao.entitiesDao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.dstu.application.dao.Dao;
import ru.dstu.application.entities.Exam;
import ru.dstu.application.utils.HibernateConnector;

import javax.persistence.EntityManager;
import java.util.List;

public class ExamDao implements Dao<Exam> {

    private final EntityManager entityManager = HibernateConnector.entityManager;

    @Override
    public List<Exam> findAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Exam",Exam.class).getResultList();
    }

    @Override
    public Exam findById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Exam.class, id);
    }

    @Override
    public void save(Exam obj) {
        Session session = entityManager.unwrap(Session.class);
        session.beginTransaction();
        Transaction transaction = session.getTransaction();
        session.saveOrUpdate(obj);
        transaction.commit();
    }

    @Override
    public void deleteById(long id) {
        Session session = entityManager.unwrap(Session.class);
        Exam obj = findById(id);
        session.delete(obj);
    }
}
