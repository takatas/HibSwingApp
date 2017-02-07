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
@Table (name = "il")
public class Il implements Serializable {
    
    private Long id;
    private String kodu;
    private String adi;

    @Id
    @SequenceGenerator(name = "seq_il", allocationSize = 1, sequenceName = "seq_il")
    @GeneratedValue (generator = "seq_il", strategy = GenerationType.SEQUENCE)
    @Column (name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name= "kod", length = 10)
    public String getKodu() {
        return kodu;
    }

    public void setKodu(String kodu) {
        this.kodu = kodu;
    }

    @Column(name = "ad", length = 20)
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    
    
    
}
