
package com.database.dao.service;

import com.database.dao.entity.LapNilai;
import com.database.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LapNilaiService {
    private Connection koneksi;
    public LapNilaiService(){
        koneksi = DatabaseUtil.getKoneksi();
    }
    public void insert(LapNilai nilai){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into lapnilai(nolap,nim,nama,matkul,absen,tugas,uts,uas,total,mutu,ket) values (?,?,?,?,?,?,?,?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            prepare.setString(1, nilai.getNolap());
            prepare.setString(2, nilai.getNim());
            prepare.setString(3, nilai.getNama());
            prepare.setString(4, nilai.getMatkul());
            prepare.setString(5, nilai.getAbsen());
            prepare.setString(6, nilai.getTugas());
            prepare.setString(7, nilai.getUts());
            prepare.setString(8, nilai.getUas());
            prepare.setString(9, nilai.getTotal());
            prepare.setString(10, nilai.getMutu());
            prepare.setString(11, nilai.getKet());
            prepare.executeUpdate();
            
            }catch (SQLException ex){
        }finally{
            if(prepare != null){
                try{
                    prepare.close();
                }catch (SQLException ex){
                }
}
}
    }
    public void update(LapNilai nilai){
           PreparedStatement prepare = null;
        try {
            String sql = "UPDATE lapnilai SET nim = ?, nama = ?, matkul = ?, absen = ?, tugas = ?, uts = ?, uas = ?, total = ?, mutu = ?, ket = ? WHERE nolap = ?";
            prepare = koneksi.prepareStatement(sql);
            prepare.setString(1, nilai.getNim());
            prepare.setString(2, nilai.getNama());
            prepare.setString(3, nilai.getMatkul());
            prepare.setString(4, nilai.getAbsen());
            prepare.setString(5, nilai.getTugas());
            prepare.setString(6, nilai.getUts());
            prepare.setString(7, nilai.getUas());
            prepare.setString(8, nilai.getTotal());
            prepare.setString(9, nilai.getMutu());
            prepare.setString(10, nilai.getKet());
            prepare.setString(11, nilai.getNolap());
            prepare.executeUpdate();
            
            }catch (SQLException ex){
        }finally{
            if(prepare != null){
                try{
                    prepare.close();
                }catch (SQLException ex){
                }
}
}
    }
    public void delete(String nolap){
        PreparedStatement prepare = null;
        try {
            String sql = "delete from lapnilai where nolap = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, nolap);
            prepare.executeUpdate();
            
        }catch (SQLException ex){
        }finally{
            if(prepare != null){
                try{
                    prepare.close();
                }catch (SQLException ex){
                }
}
}
    }
    public LapNilai selectByNolap(String nolap){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        LapNilai nilai = null;
        
        try {

            String sql = "SELECT * FROM lapnilai WHERE nolap = ?";

            prepare = koneksi.prepareStatement(sql);

            prepare.setString(1, nolap);

            result = prepare.executeQuery();
            
            if(result.next()){
                nilai = new LapNilai();
                nilai.setNolap(result.getString("nolap"));
                nilai.setNim(result.getString("nim"));
                nilai.setNama(result.getString("nama"));
                nilai.setMatkul(result.getString("matkul"));
                nilai.setAbsen(result.getString("absen"));
                nilai.setTugas(result.getString("tugas"));
                nilai.setUts(result.getString("uts"));
                nilai.setUas(result.getString("uas"));
                nilai.setTotal(result.getString("total"));
                nilai.setMutu(result.getString("mutu"));
                nilai.setKet(result.getString("ket"));
            }
            return nilai;
        } catch (SQLException ex) {
            return nilai;
        } finally {
            if (prepare != null) {
                try {
                    prepare.close();
                } catch (SQLException ex) {
                }
            }
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){
                }
            }
        }

    }
   public List<LapNilai> selectAll(){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        List<LapNilai> list = new ArrayList<>();
        
        try {

            String sql = "SELECT * FROM lapnilai";

            prepare = koneksi.prepareStatement(sql);

            result = prepare.executeQuery();
            
            while(result.next()){
                LapNilai nilai = new LapNilai();
                nilai.setNolap(result.getString("nolap"));
                nilai.setNim(result.getString("nim"));
                nilai.setNama(result.getString("nama"));
                nilai.setMatkul(result.getString("matkul"));
                nilai.setAbsen(result.getString("absen"));
                nilai.setTugas(result.getString("tugas"));
                nilai.setUts(result.getString("uts"));
                nilai.setUas(result.getString("uas"));
                nilai.setTotal(result.getString("total"));
                nilai.setMutu(result.getString("mutu"));
                nilai.setKet(result.getString("ket"));
                
                list.add(nilai);
            }

            return list;
        } catch (SQLException ex) {
            return list;
        } finally {
            if (prepare != null) {
                try {
prepare.close();
                } catch (SQLException ex) {
                }
            }
            if(result != null){
                try{
                    result.close();
                }catch(SQLException ex){
                }
            }
        }
    } 
}
