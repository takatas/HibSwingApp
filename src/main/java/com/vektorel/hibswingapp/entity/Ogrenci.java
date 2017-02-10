/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author soner
 */
@Entity
@Table(name = "ogrenci")

public class Ogrenci implements Serializable {

    private Long id;
    private String ad;
    private String soyad;
    private String adres;
    private String okulNo;
    private Date dogumTarihi;
    private Date okulaBaslamaTarihi;
    private Integer cinsiyet;
    private Boolean aktif;
    private Long tcKimlikNo;
    private Bolum bolum;

    
    public Ogrenci(){
        
    }
    
    public Ogrenci(Long id, String ad, String soyad, Long tcKimlikNo, String okulNo, String adres, 
                    Integer cinsiyet, Date dogumTarihi, Bolum bolumId, Date okulaBaslamaTarihi, boolean aktifMi) {
        
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
        this.okulNo = okulNo;
        this.adres = adres;
        this.bolum = bolumId;
        this.cinsiyet = cinsiyet;
        this.dogumTarihi = dogumTarihi;
        this.okulaBaslamaTarihi = okulaBaslamaTarihi;
        this.aktif = aktifMi;
        
    }

    @Id
    @SequenceGenerator(name = "seq_ogrenci", allocationSize = 1, sequenceName = "seq_ogrenci")
    @GeneratedValue(generator = "seq_ogrenci", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "ad", length = 70)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "soyad", length = 70)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "adres", length = 400)
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Column(name = "okul_no", length = 30)
    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dogum_tarihi")
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "okula_baslama_tarihi")
    public Date getOkulaBaslamaTarihi() {
        return okulaBaslamaTarihi;
    }

    public void setOkulaBaslamaTarihi(Date okulaBaslamaTarihi) {
        this.okulaBaslamaTarihi = okulaBaslamaTarihi;
    }

    @Column(name = "cinsiyet")
    public Integer getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Integer cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Column(name = "aktif")
    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }

    @Column(name = "tc_no")
    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @JoinColumn (name = "bolum_id")
    @ManyToOne (fetch = FetchType.LAZY)
    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

}
