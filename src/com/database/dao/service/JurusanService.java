
package com.database.dao.service;

import com.database.dao.entity.Jurusan;
import com.database.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurusanService {
    private Connection koneksi;
    public JurusanService(){
        koneksi = DatabaseUtil.getKoneksi();
    }
    public void insert(Jurusan jrs){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into tabjurusan(kd_jur, nm_jur, jml_mhs, gelar) values (?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, jrs.getKd_jur());
            prepare.setString(2, jrs.getNm_jur());
            prepare.setString(3, jrs.getJml_mhs());
            prepare.setString(4, jrs.getGelar());
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
    public void update(Jurusan jrs){
           PreparedStatement prepare = null;
        try {
            String sql = "UPDATE tabjurusan SET nm_jur = ?, jml_mhs = ?, gelar = ? WHERE kd_jur = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, jrs.getNm_jur());
            prepare.setString(2, jrs.getJml_mhs());
            prepare.setString(3, jrs.getGelar());
            prepare.setString(4, jrs.getKd_jur());
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
    public void delete(String kd_jur){
        PreparedStatement prepare = null;
        try {
            String sql = "delete from tabjurusan where kd_jur = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, kd_jur);
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
    public Jurusan selectByKd_jur(String kd_jur){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        Jurusan jrs = null;
        
        try {

            String sql = "SELECT * FROM tabdosen WHERE kd_jur = ?";

            prepare = koneksi.prepareStatement(sql);

            prepare.setString(1, kd_jur);

            result = prepare.executeQuery();
            
            if(result.next()){
                jrs = new Jurusan();
                jrs.setGelar(result.getString("gelar"));
                jrs.setJml_mhs(result.getString("jml_mhs"));
                jrs.setKd_jur(result.getString("kd_jur"));
                jrs.setNm_jur(result.getString("nm_jur"));
            }
            return jrs;
        } catch (SQLException ex) {
            return jrs;
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
   public List<Jurusan> selectAll(){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        List<Jurusan> list = new ArrayList<>();
        
        try {

            String sql = "SELECT * FROM tabjurusan";

            prepare = koneksi.prepareStatement(sql);

            result = prepare.executeQuery();
            
            while(result.next()){
                Jurusan jrs = new Jurusan();
                jrs.setGelar(result.getString("gelar"));
                jrs.setJml_mhs(result.getString("jml_mhs"));
                jrs.setKd_jur(result.getString("kd_jur"));
                jrs.setNm_jur(result.getString("nm_jur"));
                
                list.add(jrs);
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
