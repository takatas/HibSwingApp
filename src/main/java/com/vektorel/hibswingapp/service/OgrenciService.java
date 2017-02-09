/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.service;


import com.vektorel.hibswingapp.entity.Ogrenci;
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
public class OgrenciService implements IService<Ogrenci> {

    @Override
    public boolean save(Ogrenci entity) throws Exception {
        
        if(entity == null || entity.getBolum() != null)
            throw new Exception("Öğrencinin Bölümü Boş Olamaz.");
        
        if(entity.getTcKimlikNo() == null)
            throw new Exception("Tc Kimlik No Boş Olamaz.");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public boolean update(Ogrenci entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public boolean delete(Ogrenci entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public List<Ogrenci> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ogrenci.class);
        return criteria.list();

    }

    @Override
    public Ogrenci getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ogrenci.class);
        criteria.add(Restrictions.eq("id", id));
        
        return (Ogrenci) criteria.uniqueResult();
    }
    
}
