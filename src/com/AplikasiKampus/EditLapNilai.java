package com.AplikasiKampus;
import com.database.dao.entity.LapNilai;
import com.database.util.DatabaseUtil;
import com.database.dao.service.LapNilaiService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EditLapNilai extends javax.swing.JDialog {
private LapNilai nilai;
private DatabaseUtil db = new DatabaseUtil();

    public EditLapNilai(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampilmatkul();
        tampilnim();
       
    }
   
    
     public void tampilmatkul(){
        db.getKoneksi();
          try {
            String query = "SELECT * FROM tabmatkul";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                cmmatkul.addItem(rs.getString("matkul"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
     } 
    
     public void tampilnim(){
        db.getKoneksi();
          try {
            String query = "SELECT * FROM tabmahasiswa";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {                
                jComboNim.addItem(rs.getString("nim"));
            }
            
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        } catch (SQLException e) {
        }
     } 
     
    public void nmmhs()
    {
        db.getKoneksi();
        try {
        db.getKoneksi();
        Statement st = db.getKoneksi().createStatement();
        String sql = "select nama from tabmahasiswa where nim='"+jComboNim.getSelectedItem()+"'";  
        ResultSet res = st.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[1];
            ob[0]=  res.getString(1);
            
            jTextFieldNama.setText((String) ob[0]);
            
        }
        res.close(); st.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    
    
 public void editLapNilai(LapNilai nilai){
        this.nilai = nilai;
        jTextFieldNolap.setText(nilai.getNolap());
        jComboNim.setSelectedItem(nilai.getNim());
        jTextFieldNama.setText(nilai.getNama());
        cmmatkul.setSelectedItem(nilai.getMatkul());
        txtabsen.setText(nilai.getAbsen());
        txttugas.setText(nilai.getTugas());
        txtuts.setText(nilai.getUts());
        txtuas.setText(nilai.getUas());
        txthitung.setText(nilai.getTotal());
        txthuruf.setText(nilai.getMutu());
        txtket.setText(nilai.getKet());
        setLocationRelativeTo(getParent());
        setVisible(true);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNolap = new javax.swing.JTextField();
        jComboNim = new javax.swing.JComboBox<>();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmmatkul = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtabsen = new javax.swing.JTextField();
        txtuts = new javax.swing.JTextField();
        txtuas = new javax.swing.JTextField();
        txttugas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txthitung = new javax.swing.JTextField();
        txthuruf = new javax.swing.JTextField();
        txtket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Data");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit Data Nilai");

        jTextFieldNolap.setEditable(false);

        jComboNim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---" }));
        jComboNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNimActionPerformed(evt);
            }
        });

        jTextFieldNama.setEditable(false);

        jButtonSimpan.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonBatal.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBatal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jLabel8.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Mata Kuliah");

        cmmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmmatkulActionPerformed(evt);
            }
        });

        jLabel4.setText("Absen");

        txtabsen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtabsenKeyReleased(evt);
            }
        });

        txtuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtutsActionPerformed(evt);
            }
        });

        jLabel5.setText("Tugas");

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Keterangan");

        jLabel6.setText("UTS");

        jLabel7.setText("UAS");

        jLabel10.setText("Nolap");

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane2.setViewportView(ta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addComponent(jButton1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmmatkul, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtket)
                    .addComponent(jTextFieldNama)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboNim, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txttugas)
                                        .addComponent(txtabsen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txthitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtuas)
                                    .addComponent(txtuts)
                                    .addComponent(txthuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jTextFieldNolap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldNolap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtabsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        LapNilai nilai = new LapNilai();
        nilai.setNolap(jTextFieldNolap.getText());
        nilai.setNim((String)jComboNim.getSelectedItem());
        nilai.setNama(jTextFieldNama.getText());
        nilai.setMatkul((String)cmmatkul.getSelectedItem());
        nilai.setAbsen(txtabsen.getText());
        nilai.setTugas(txttugas.getText());
        nilai.setUts(txtuts.getText());
        nilai.setUas(txtuas.getText());
        nilai.setTotal(txthitung.getText());
        nilai.setMutu(txthuruf.getText());
        nilai.setKet(txtket.getText());
        
        LapNilaiService service = new LapNilaiService();
        service.update(nilai);
        dispose();
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jComboNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNimActionPerformed
        nmmhs();
    }//GEN-LAST:event_jComboNimActionPerformed

    private void cmmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmmatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmmatkulActionPerformed

    private void txtabsenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabsenKeyReleased
        double absen;
        absen=Integer.parseInt(txtabsen.getText());
        if((absen<12)){
            txtuas.setText("0");
        }
        else{
            txtuas.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtabsenKeyReleased

    private void txtutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtutsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtutsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double absen,tugas,uts,uas,nilai;
        String hasil;
        absen=Integer.parseInt(txtabsen.getText());
        tugas=Integer.parseInt(txttugas.getText());
        uts=Integer.parseInt(txtuts.getText());
        uas=Integer.parseInt(txtuas.getText());
        nilai= (absen/16*10)+(tugas*20/100)+(uts*30/100)+(uas*40/100);
        hasil=String.valueOf(nilai);
        txthitung.setText(hasil);

        if(nilai>=85){
            txthuruf.setText("A");
            txtket.setText("Lulus");
        }
        else if((nilai<85) && (nilai>=70)){
            txthuruf.setText("B");
            txtket.setText("Lulus");
        }
        else if((nilai<70) && (nilai>=55)){
            txthuruf.setText("C");
            txtket.setText("Lulus");
        }
        else if((nilai<55) && (nilai>=40)){
            txthuruf.setText("D");
            txtket.setText("Mengulang");
        }
        else if((nilai<40) && (nilai>=0)){
            txthuruf.setText("E");
            txtket.setText("Tidak Lulus");
        }
        ta.setText(
            "NIM          \t   : "+jComboNim.getSelectedItem()+"\n"+
            "Nama         \t   : "+jTextFieldNama.getText()+"\n"+
            "Mata Kuliah  \t   : "+cmmatkul.getSelectedItem()+"\n"+
            "Absen        \t   : "+txtabsen.getText()+"\n"+
            "Tugas        \t   : "+txttugas.getText()+"\n"+
            "UTS          \t   : "+txtuts.getText()+"\n"+
            "UAS          \t   : "+txtuas.getText()+"\n"+
            "Hasil Nilai  \t   : "+txthitung.getText()+"\n"+
            "Huruf Mutu   \t   : "+txthuruf.getText()+"\n"+
            "Keterangan   \t   : "+txtket.getText()+"\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmmatkul;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox<String> jComboNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNolap;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField txtabsen;
    private javax.swing.JTextField txthitung;
    private javax.swing.JTextField txthuruf;
    private javax.swing.JTextField txtket;
    private javax.swing.JTextField txttugas;
    private javax.swing.JTextField txtuas;
    private javax.swing.JTextField txtuts;
    // End of variables declaration//GEN-END:variables
}