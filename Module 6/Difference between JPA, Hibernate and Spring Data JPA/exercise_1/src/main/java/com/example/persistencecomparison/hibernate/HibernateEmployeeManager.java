package com.example.persistencecomparison.hibernate;

import com.example.persistencecomparison.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class HibernateEmployeeManager {

    private SessionFactory factory;

    @Autowired
    public HibernateEmployeeManager(EntityManagerFactory entityManagerFactory) {
        this.factory = entityManagerFactory.unwrap(SessionFactory.class);
    }

    public Integer addEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
