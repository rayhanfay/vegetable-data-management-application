/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guiperpus;
import com.mycompany.guiperpus.Buku;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIPerpustakaan extends javax.swing.JFrame {

    private Buku bukuPinjam;
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    
    public GUIPerpustakaan() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tBuku = new javax.swing.JButton();
        pBuku = new javax.swing.JButton();
        hBuku = new javax.swing.JButton();
        cBuku = new javax.swing.JButton();
        iBuku = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jJudul = new javax.swing.JTextField();
        jPenerbit = new javax.swing.JTextField();
        jPengarang = new javax.swing.JTextField();
        jTahun = new javax.swing.JTextField();
        jCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        out = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        bukuList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Nexa Heavy", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("MANEJEMEN DATA SAYUR");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Proyek Kelompok 2");

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Coolvetica Rg", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Nama Sayur :");

        jLabel4.setFont(new java.awt.Font("Coolvetica Rg", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Harga Sayur :");

        jLabel5.setFont(new java.awt.Font("Coolvetica Rg", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Berat Sayur :");

        jLabel6.setFont(new java.awt.Font("Coolvetica Rg", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Tanggal Wrap :");

        jLabel7.setFont(new java.awt.Font("Coolvetica Rg", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Berlaku Hingga :");

        tBuku.setBackground(new java.awt.Color(0, 204, 153));
        tBuku.setText("Tambah Sayur");
        tBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBukuActionPerformed(evt);
            }
        });

        pBuku.setBackground(new java.awt.Color(0, 204, 153));
        pBuku.setText("Beli Sayur");
        pBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pBukuActionPerformed(evt);
            }
        });

        hBuku.setBackground(new java.awt.Color(0, 204, 153));
        hBuku.setText("Buang Sayur");
        hBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hBukuActionPerformed(evt);
            }
        });

        cBuku.setBackground(new java.awt.Color(0, 204, 153));
        cBuku.setText("Cari Sayur");
        cBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBukuActionPerformed(evt);
            }
        });

        iBuku.setBackground(new java.awt.Color(0, 204, 153));
        iBuku.setText("Info Sayur");
        iBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iBukuActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 102, 102));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        out.setColumns(20);
        out.setRows(5);
        jScrollPane1.setViewportView(out);

        jScrollPane3.setViewportView(bukuList);

        jLabel8.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N
        jLabel8.setText("Nama Sayur");

        jLabel9.setFont(new java.awt.Font("Nexa Heavy", 0, 12)); // NOI18N
        jLabel9.setText("Output");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jJudul)
                                    .addComponent(jPenerbit)
                                    .addComponent(jPengarang)
                                    .addComponent(jTahun)
                                    .addComponent(jCari)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tBuku)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pBuku)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hBuku)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cBuku)
                                        .addGap(12, 12, 12)
                                        .addComponent(iBuku))
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(161, 161, 161)))))
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBuku)
                    .addComponent(pBuku)
                    .addComponent(hBuku)
                    .addComponent(cBuku)
                    .addComponent(iBuku))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void iBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iBukuActionPerformed
        int selectedIndex = bukuList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < daftarBuku.size()){
           Buku buku = daftarBuku.get(selectedIndex);
           out.setText("");
           out.append("Judul:"+ buku.getJudul()+  "\n");
           out.append("Penerbit:"+ buku.getPenerbit()+"\n");
           out.append("Pengarang:"+ buku.getPengarang()+"\n");
           out.append("Tahun Terbitu:"+ buku.getTahunTerbit()+"\n");
           out.append("Status:"+ (buku.isAda()?"Tersedia" : "Dipinjam") +"\n");
        }else{
             out.append("Pilih buku untuk melihat informasi \n");
        }
    }//GEN-LAST:event_iBukuActionPerformed

    private void tBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBukuActionPerformed
        String judul = jJudul.getText();
        String penerbit = jPenerbit.getText();
        String pengarang = jPengarang.getText();
        int tahunTerbit = Integer.parseInt(jTahun.getText());
        boolean ada = true;
        Buku buku = new Buku(judul, penerbit, pengarang, tahunTerbit, ada);
        daftarBuku.add(buku);
        jJudul.setText("");
        jPenerbit.setText("");
        jPengarang.setText("");
        jTahun.setText("");
        refreshList();
        out.setText("");
        out.append("Buku ditambahkan : " + buku.getJudul() + "\n");
    }//GEN-LAST:event_tBukuActionPerformed

    private void pBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pBukuActionPerformed
       int selectedIndex = bukuList.getSelectedIndex();
       out.setText("");
       if (selectedIndex >= 0 && selectedIndex < daftarBuku.size()){
           Buku buku = daftarBuku.get(selectedIndex);
           if (buku.isAda()){
               buku.setAda(false);
               bukuPinjam = buku;
               refreshList();
               out.append("Buku dipinjam: "+ buku.getJudul()+"\n");
           }else{
               out.append("Buku sudah dipinjam.\n");
           }
       }else{
           out.append("Pilih buku.\n");
       }
    }//GEN-LAST:event_pBukuActionPerformed

    private void hBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hBukuActionPerformed
        int selectedIndex = bukuList.getSelectedIndex();
        out.setText("");
        if (selectedIndex >= 0 && selectedIndex < daftarBuku.size()){
            Buku buku = daftarBuku.get(selectedIndex);
            daftarBuku.remove(selectedIndex);
            refreshList();
            out.append("Buku dihapus:" +buku.getJudul() + "\n");
        }else{
            out.append("pilih buku yang ingin dihapus. \n");
        }  
    }//GEN-LAST:event_hBukuActionPerformed

    private void cBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBukuActionPerformed
       String keyword = jCari.getText().toLowerCase();
       ArrayList<Buku> hasilPencarian = new ArrayList<>();
       for (Buku buku : daftarBuku){
           if (buku.getJudul().toLowerCase().contains(keyword)){
               hasilPencarian.add(buku);
           }
       }
       out.setText("");
       out.append("Hasil cari: \n");
       for (Buku buku : hasilPencarian){
           out.append(buku.getJudul()+ "\n");
       }
    }//GEN-LAST:event_cBukuActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void showSearchResults(ArrayList<Buku> hasilPencarian){
        DefaultListModel<String> model = new DefaultListModel <> ();
        for (Buku buku : hasilPencarian){
            model.addElement(buku.getJudul());
        }
        bukuList.setModel(model);
    }
    
    private void refreshList(){
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Buku buku : daftarBuku){
            model.addElement(buku.getJudul());
        }
        bukuList.setModel(model);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIPerpustakaan frame = new GUIPerpustakaan();
                frame.pack();
                frame.setVisible(true);
                new GUIPerpustakaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> bukuList;
    private javax.swing.JButton cBuku;
    private javax.swing.JButton exit;
    private javax.swing.JButton hBuku;
    private javax.swing.JButton iBuku;
    private javax.swing.JTextField jCari;
    private javax.swing.JTextField jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPenerbit;
    private javax.swing.JTextField jPengarang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTahun;
    private javax.swing.JTextArea out;
    private javax.swing.JButton pBuku;
    private javax.swing.JButton tBuku;
    // End of variables declaration//GEN-END:variables
}
