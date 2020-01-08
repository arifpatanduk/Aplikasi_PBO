
package com.database.dao.service;

import com.database.dao.entity.Matkul;
import com.database.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatkulService {
    private Connection koneksi;
    public MatkulService(){
        koneksi = DatabaseUtil.getKoneksi();
    }
    public void insert(Matkul matkul){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into tabmatkul(kode, matkul, sks) values (?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, matkul.getKode());
            prepare.setString(2, matkul.getMatkul());
            prepare.setString(3, matkul.getSks());
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
    public void update(Matkul matkul){
           PreparedStatement prepare = null;
        try {
            String sql = "UPDATE tabmatkul SET matkul = ?, sks = ? WHERE kode = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, matkul.getMatkul());
            prepare.setString(2, matkul.getSks());
            prepare.setString(3, matkul.getKode());
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
    public void delete(String kode){
        PreparedStatement prepare = null;
        try {
            String sql = "delete from tabmatkul where kode = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, kode);
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
    public Matkul selectByKode(String kode){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        Matkul matkul = null;
        
        try {

            String sql = "SELECT * FROM tabmatkul WHERE kode = ?";

            prepare = koneksi.prepareStatement(sql);

            prepare.setString(1, kode);

            result = prepare.executeQuery();
            
            if(result.next()){
                matkul = new Matkul();
                matkul.setKode(result.getString("kode"));
                matkul.setMatkul(result.getString("matkul"));
                matkul.setSks(result.getString("sks"));
            }
            return matkul;
        } catch (SQLException ex) {
            return matkul;
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
   public List<Matkul> selectAll(){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        List<Matkul> list = new ArrayList<>();
        
        try {

            String sql = "SELECT * FROM tabmatkul";

            prepare = koneksi.prepareStatement(sql);

            result = prepare.executeQuery();
            
            while(result.next()){
                Matkul matkul = new Matkul();
                matkul.setKode(result.getString("kode"));
                matkul.setMatkul(result.getString("matkul"));
                matkul.setSks(result.getString("sks"));
                
                list.add(matkul);
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
