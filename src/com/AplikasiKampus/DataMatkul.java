package com.AplikasiKampus;

import java.io.File;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import com.database.dao.entity.Matkul;
import com.database.dao.service.MatkulService;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.util.List;
import javax.swing.JOptionPane;



public class DataMatkul extends javax.swing.JFrame {

    private DynamicTableModel<Matkul> tablemodel;
   private JDynamicTable jDynamicTable;
    
    public DataMatkul() {
        initComponents();
        tablemodel = new DynamicTableModel<>(Matkul.class);
        jDynamicTable = new JDynamicTable(tablemodel);
        jScrollPane1.setViewportView(jDynamicTable);
        
        reload();
        
    }
    private MatkulService service = new MatkulService();
    private void reload()    {
        tablemodel.clear();
        List<Matkul> list = service.selectAll();
        for(Matkul dosen : list){
            tablemodel.add(dosen);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonTambah1 = new javax.swing.JButton();
        jButtonEdit1 = new javax.swing.JButton();
        jButtonHapus1 = new javax.swing.JButton();
        jButtonKeluar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Mata Kuliah");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonTambah1.setBackground(new java.awt.Color(51, 51, 51));
        jButtonTambah1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTambah1.setText("Tambah");
        jButtonTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambah1ActionPerformed(evt);
            }
        });

        jButtonEdit1.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEdit1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit1.setText("Edit");
        jButtonEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdit1ActionPerformed(evt);
            }
        });

        jButtonHapus1.setBackground(new java.awt.Color(51, 51, 51));
        jButtonHapus1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHapus1.setText("Hapus");
        jButtonHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapus1ActionPerformed(evt);
            }
        });

        jButtonKeluar1.setBackground(new java.awt.Color(51, 51, 51));
        jButtonKeluar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKeluar1.setText("Keluar");
        jButtonKeluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluar1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cetak Laporan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButtonTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonKeluar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKeluar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambah1ActionPerformed
        TambahMatkul tambah = new TambahMatkul(this, true);
        tambah.tambahMatkul();
        reload();
    }//GEN-LAST:event_jButtonTambah1ActionPerformed

    private void jButtonKeluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluar1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonKeluar1ActionPerformed

    private void jButtonEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdit1ActionPerformed
         if(jDynamicTable.getSelectedRow() != -1){
            int index  = jDynamicTable.convertRowIndexToModel(jDynamicTable.getSelectedRow());
            Matkul matkul = tablemodel.get(index);
            EditMatkul editmatkul = new EditMatkul(this, true);
            editmatkul.editMatkul(matkul);
            reload();
        }else{
            JOptionPane.showMessageDialog(this, "Pilih data");
        }
    }//GEN-LAST:event_jButtonEdit1ActionPerformed

    private void jButtonHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapus1ActionPerformed
        if(jDynamicTable.getSelectedRow() != -1){
           if(JOptionPane.showConfirmDialog(this, "Anda yakin akan menghapus data ?", "Hapus Data",
                   JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
               int index  = jDynamicTable.convertRowIndexToModel(jDynamicTable.getSelectedRow());
               Matkul matkul = tablemodel.get(index);
               service.delete(matkul.getKode());
               reload();
           }
            }else{
           JOptionPane.showMessageDialog(this, "Pilih satu data");
    }//GEN-LAST:event_jButtonHapus1ActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new CetakLaporan("./src/report/laporan/reportmatkul.jasper");
    }//GEN-LAST:event_jButton1ActionPerformed
    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEdit1;
    private javax.swing.JButton jButtonHapus1;
    private javax.swing.JButton jButtonKeluar1;
    private javax.swing.JButton jButtonTambah1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
