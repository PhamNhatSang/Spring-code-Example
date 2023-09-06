package nhatsang.spring_training.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nhatsang.spring_training.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    //@Transactional
    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.persist(customer);
        trans.commit();
    }

    @Override
    public Customer findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.find(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Customer", Customer.class).getResultList();
    }

    @Override
    @Transactional

    public void update(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(customer);
    }
}
