/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.service;


import com.vektorel.hibswingapp.entity.Bolum;
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
public class BolumService implements IService<Bolum> {

    @Override
    public boolean save(Bolum entity) throws Exception {
        
        if(entity.getBolumAdi() != null || entity.getBolumAdi().trim().equals(""))
            throw new Exception("Bölüm Adı Boş Olamaz.");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public boolean update(Bolum entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public boolean delete(Bolum entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public List<Bolum> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        return criteria.list();

    }

    @Override
    public Bolum getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        criteria.add(Restrictions.eq("id", id));
        
        return (Bolum) criteria.uniqueResult();
    }


    
}
