/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.ui;

import com.vektorel.hibswingapp.entity.Bolum;
import com.vektorel.hibswingapp.entity.Ogrenci;
import com.vektorel.hibswingapp.enums.Cinsiyet;
import com.vektorel.hibswingapp.service.BolumService;
import com.vektorel.hibswingapp.service.OgrenciService;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javafx.scene.control.DatePicker;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author takatas
 */
public class frmOgrenciEkle extends javax.swing.JDialog {

    /**
     * Creates new form frmOgrenciEkle
     */
    public frmOgrenciEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        bolumComboDoldur();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOgrenciAdi = new javax.swing.JLabel();
        lblOgrenciSoyadi = new javax.swing.JLabel();
        txtOgrenciAdi = new javax.swing.JTextField();
        txtOgrenciSoyadi = new javax.swing.JTextField();
        lblCinsiyet = new javax.swing.JLabel();
        lblDogumTarihi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTCKimlikNo = new javax.swing.JTextField();
        lblBolum = new javax.swing.JLabel();
        cmbBolum = new javax.swing.JComboBox<>();
        txtOkulNo = new javax.swing.JTextField();
        lblOkulNo = new javax.swing.JLabel();
        lblBaslamaTarihi = new javax.swing.JLabel();
        chkAktif = new javax.swing.JCheckBox();
        txtBaslamaTarihi = new javax.swing.JFormattedTextField();
        btnOgrenciKaydet = new javax.swing.JButton();
        btnOgrenciIptal = new javax.swing.JButton();
        lblOgrenciId = new javax.swing.JLabel();
        txtOgrenciAdres = new javax.swing.JTextField();
        lblAdres = new javax.swing.JLabel();
        cmbCinsiyet = new javax.swing.JComboBox<>();
        dchDogumTarihi = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblOgrenciAdi.setText("Öğrenci Adı");

        lblOgrenciSoyadi.setText("Öğrenci Soyadı");

        lblCinsiyet.setText("Cinsiyet");

        lblDogumTarihi.setText("Doğum Tarihi");

        jLabel2.setText("TC Kimlik No");

        lblBolum.setText("Bölümü");

        lblOkulNo.setText("Okul No");

        lblBaslamaTarihi.setText("Başlama Tarihi");

        chkAktif.setText("Aktif");
        chkAktif.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnOgrenciKaydet.setText("Kaydet");
        btnOgrenciKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciKaydetActionPerformed(evt);
            }
        });

        btnOgrenciIptal.setText("İptal");
        btnOgrenciIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciIptalActionPerformed(evt);
            }
        });

        lblAdres.setText("Adres");

        cmbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));

        dchDogumTarihi.setDateFormatString("dd.MM.yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblOgrenciSoyadi)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblBolum, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblOkulNo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblOgrenciAdi, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblAdres, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOgrenciAdres)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOgrenciIptal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnOgrenciKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOgrenciId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTCKimlikNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOkulNo)
                            .addComponent(cmbBolum, 0, 167, Short.MAX_VALUE)
                            .addComponent(txtOgrenciSoyadi)
                            .addComponent(txtOgrenciAdi))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chkAktif)
                                    .addComponent(lblBaslamaTarihi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBaslamaTarihi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDogumTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCinsiyet, 0, 117, Short.MAX_VALUE)
                                    .addComponent(dchDogumTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblOgrenciId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOgrenciAdi)
                    .addComponent(txtOgrenciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCinsiyet)
                    .addComponent(cmbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOgrenciSoyadi)
                            .addComponent(txtOgrenciSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDogumTarihi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTCKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBolum)
                            .addComponent(lblBaslamaTarihi)
                            .addComponent(txtBaslamaTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAktif)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtOkulNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblOkulNo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOgrenciAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(lblAdres))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOgrenciIptal)
                            .addComponent(btnOgrenciKaydet))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dchDogumTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOgrenciIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciIptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOgrenciIptalActionPerformed

    private void btnOgrenciKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciKaydetActionPerformed


        
        try {

            OgrenciService ogrenciService = new OgrenciService();
//            BolumService bolumService = new BolumService();
//            Bolum bolum = bolumService.getById(cmbBolum.getSelectedItem().toString());
            //bolum.getId()
            
            int i = cmbCinsiyet.getSelectedIndex();
            //Date str = ((JTextField)dchDogumTarihi.getDateEditor().getUiComponent().get);
            

            if (lblOgrenciId.getText().trim().equals("")) {

                ogrenciService.save(new Ogrenci(null, txtOgrenciAdi.getText(), txtOgrenciSoyadi.getText(), new Long(txtTCKimlikNo.getText()), txtOkulNo.getText(), txtOgrenciAdres.getText(), cmbCinsiyet.getSelectedIndex()));
            } else {

                ogrenciService.update(new Ogrenci(new Long(lblOgrenciId.getText()), txtOgrenciAdi.getText(), txtOgrenciSoyadi.getText(), new Long(txtTCKimlikNo.getText()), txtOkulNo.getText(), txtOgrenciAdres.getText(), cmbCinsiyet.getSelectedIndex()));
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnOgrenciKaydetActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOgrenciIptal;
    private javax.swing.JButton btnOgrenciKaydet;
    private javax.swing.JCheckBox chkAktif;
    private javax.swing.JComboBox<String> cmbBolum;
    private javax.swing.JComboBox<String> cmbCinsiyet;
    private com.toedter.calendar.JDateChooser dchDogumTarihi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblBaslamaTarihi;
    private javax.swing.JLabel lblBolum;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblOgrenciAdi;
    private javax.swing.JLabel lblOgrenciId;
    private javax.swing.JLabel lblOgrenciSoyadi;
    private javax.swing.JLabel lblOkulNo;
    private javax.swing.JFormattedTextField txtBaslamaTarihi;
    private javax.swing.JTextField txtOgrenciAdi;
    private javax.swing.JTextField txtOgrenciAdres;
    private javax.swing.JTextField txtOgrenciSoyadi;
    private javax.swing.JTextField txtOkulNo;
    private javax.swing.JTextField txtTCKimlikNo;
    // End of variables declaration//GEN-END:variables

    private void bolumComboDoldur() {

        BolumService bolumService = new BolumService();
        List<Bolum> bolum = bolumService.getAll(null);
        String[] data = new String[bolum.size()];
        for (int i = 0; i < bolum.size(); i++) {
            data[i] = bolum.get(i).getBolumAdi();
            cmbBolum.addItem(bolum.get(i).getBolumAdi());
            
        }
    }
    

}