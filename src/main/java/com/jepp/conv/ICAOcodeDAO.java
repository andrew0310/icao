package com.jepp.conv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;

public class ICAOcodeDAO {

    public String getRecordFromDatabase(String id) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Query<ICAOcode> query = session.createQuery("from ICAOcode where idLetter = : id", ICAOcode.class);
            query.setParameter("idLetter", id);

            return query.getSingleResult().toString();
        } catch (PersistenceException pe) {
            System.err.println("Cannot retrieve data from database!");
        }
        return null;
    }
}
