package ru.dstu.application.dao.entitiesDao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.dstu.application.dao.Dao;
import ru.dstu.application.entities.Credit;
import ru.dstu.application.utils.HibernateConnector;

import javax.persistence.EntityManager;
import java.util.List;

public class CreditDao implements Dao<Credit> {

    private final EntityManager entityManager = HibernateConnector.entityManager;

    @Override
    public List<Credit> findAll() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM Credit", Credit.class).getResultList();
    }

    @Override
    public Credit findById(long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Credit.class, id);
    }

    @Override
    public void save(Credit obj) {
        Session session = entityManager.unwrap(Session.class);
        session.beginTransaction();
        Transaction transaction = session.getTransaction();
        session.saveOrUpdate(obj);
        transaction.commit();
    }

    @Override
    public void deleteById(long id) {
        Session session = entityManager.unwrap(Session.class);
        Credit obj = findById(id);
        session.delete(obj);
    }
}
