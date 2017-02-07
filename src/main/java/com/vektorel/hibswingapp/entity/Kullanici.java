/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author soner
 */

@Entity
@Table(name = "kullanici")

public class Kullanici implements Serializable {

    private Long id;
    private String username;
    private String password;
    private String adSoyad;

    public Kullanici() {
    }

    public Kullanici(Long id, String username, String password, String adSoyad) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.adSoyad = adSoyad;
    }

    @Id
    @SequenceGenerator(name = "seq_kullanici", allocationSize = 1, sequenceName = "seq_kullanici")
    @GeneratedValue(generator = "seq_kullanici", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username", length = 50, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "adsoyad", length = 150)
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Override
    public String toString() {
        return "Kullanici{" + "id=" + id + ", username=" + username + ", password=" + password + ", adSoyad=" + adSoyad + '}';
    }

}
