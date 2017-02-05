/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.service;

import com.vektorel.hibswingapp.entity.Il;
import com.vektorel.hibswingapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author soner
 */
public class IlService implements IService<Il> {

    @Override
    public boolean save(Il entity) throws Exception {

        if (entity.getAdi()!= null || entity.getAdi().trim().equals("")) {
            throw new Exception("İl Adı Boş Olamaz.");
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public boolean update(Il entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public boolean delete(Il entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();

        return true;
    }

    @Override
    public List<Il> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Il.class);
        return criteria.list();

    }

    @Override
    public Il getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Il.class);
        criteria.add(Restrictions.eq("id", id));

        return (Il) criteria.uniqueResult();
    }

}
