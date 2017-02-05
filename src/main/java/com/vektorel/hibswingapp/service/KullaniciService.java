/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.service;

import com.vektorel.hibswingapp.util.HibernateUtil;
import com.vektorel.hibswingapp.entity.Kullanici;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author soner
 */
public class KullaniciService implements IService<Kullanici>{

    @Override
    public boolean save(Kullanici entity) throws Exception {
        
        if(entity.getUsername() == null || entity.getUsername().trim().equals(""))
            throw new Exception("Kullanıcı Adı Boş Olamaz...");
        
        if(entity.getPassword() == null || entity.getPassword().trim().equals(""))
            throw new Exception("Şifre Boş Olamaz...");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        
        
        return true;
    }

    @Override
    public boolean update(Kullanici entity) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public boolean delete(Kullanici entity) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        
        return true;
    }

    @Override
    public List<Kullanici> getAll(String query) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        
        if(query != null){ // username veya adsoyada göre arama yapılıyor.
            
            criteria.add(Restrictions.or(Restrictions.ilike("username", query, MatchMode.ANYWHERE),
                Restrictions.ilike("adsoyad", query, MatchMode.ANYWHERE)));
        }
        
        return criteria.list();
    }

    @Override
    public Kullanici getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        
        return (Kullanici) criteria.uniqueResult();
        
    }
    
    public Kullanici getUsernameAndPassword(String username, String pass){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", pass));
        
       return (Kullanici)criteria.uniqueResult();
                
    }
    
}
