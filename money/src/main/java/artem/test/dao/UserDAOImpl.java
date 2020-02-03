package artem.test.dao;

import artem.test.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDAOImpl implements UserDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    @SuppressWarnings("unchcked")
    public List<User> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void transfer(String from, String to, int value) {
        Session session = sessionFactory.getCurrentSession();
        User user1 = getByName(from);
        User user2 = getByName(to);
        user1.setMoney(user1.getMoney() - value);
        user2.setMoney(user2.getMoney() + value);
        session.update(user1);
        session.update(user2);
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    public User getByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, name);
    }
}
