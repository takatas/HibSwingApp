/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp;

import com.vektorel.hibswingapp.entity.Kullanici;
import com.vektorel.hibswingapp.service.KullaniciService;
import com.vektorel.hibswingapp.ui.frmLogin;

/**
 *
 * @author soner
 */
public class App {

    public static void main(String[] args) {

        System.out.println("App is Started...");
//        try {
//            KullaniciService kullaniciService = new KullaniciService();
//            Kullanici kullanici = new Kullanici();
//            kullanici.setAdSoyad("Soner TAKATAŞ");
//            kullanici.setUsername("takatas");
//            kullanici.setPassword("1q");
//            kullaniciService.save(kullanici);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        frmLogin login = new frmLogin(null, true);
        login.setLocationRelativeTo(null);
        login.show();

        //System.out.println("Kullanıcı Kayıt Edildi.");
        
    }

}
