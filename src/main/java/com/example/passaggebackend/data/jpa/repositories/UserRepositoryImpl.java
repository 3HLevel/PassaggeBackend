package com.example.passaggebackend.data.jpa.repositories;

import com.example.passaggebackend.core.domain.utils.HibernateSessionFactoryUtil;
import com.example.passaggebackend.core.usecases.user.UserRepository;
import com.example.passaggebackend.data.jpa.entities.UserData;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public UserData findByNickname(String nickname) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(UserData.class, nickname);
    }

    @Override
    public UserData findByEmail(String email) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(UserData.class, email);
    }

    @Override
    public List<UserData> findAll() {
        return (List<UserData>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("From UserData")
                .list();
    }

    @Override
    public UserData findById(Long id) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(UserData.class, id);
    }

    @Override
    public void create(UserData userData) {
        Session session = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(userData);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(UserData userData) {
        Session session = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(userData);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(UserData userData) {
        Session session = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(userData);
        tx1.commit();
        session.close();
    }
}
