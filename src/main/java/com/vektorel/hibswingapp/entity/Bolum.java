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
@Table (name = "bolum")
public class Bolum implements Serializable {
    
    private Long id;
    private String kod;
    private String bolumAdi;

    @Id
    @SequenceGenerator (name = "seq_bolum",allocationSize = 1, sequenceName = "seq_bolum")
    @GeneratedValue (generator = "seq_bolum", strategy = GenerationType.SEQUENCE)
    @Column (name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "kod", length = 30, unique = true)
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Column (name = "bolum_adi")
    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }
    
    
    
}
