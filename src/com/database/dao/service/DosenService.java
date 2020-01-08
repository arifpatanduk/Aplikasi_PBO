
package com.database.dao.service;

import com.database.dao.entity.Dosen;
import com.database.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DosenService {
    private Connection koneksi;
    public DosenService(){
        koneksi = DatabaseUtil.getKoneksi();
    }
    public void insert(Dosen dosen){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into tabdosen(nid, nama_dsn, jk, alamat) values (?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, dosen.getNid());
            prepare.setString(2, dosen.getNama_dsn());
            prepare.setString(3, dosen.getJk());
            prepare.setString(4, dosen.getAlamat());
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
    public void update(Dosen dosen){
           PreparedStatement prepare = null;
        try {
            String sql = "UPDATE tabdosen SET nama_dsn = ?, jk = ?, alamat = ? WHERE nid = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, dosen.getNama_dsn());
            prepare.setString(2, dosen.getJk());
            prepare.setString(3, dosen.getAlamat());
            prepare.setString(4, dosen.getNid());
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
    public void delete(String nid){
        PreparedStatement prepare = null;
        try {
            String sql = "delete from tabdosen where nid = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, nid);
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
    public Dosen selectByNid(String nid){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        Dosen dosen = null;
        
        try {

            String sql = "SELECT * FROM tabdosen WHERE nid = ?";

            prepare = koneksi.prepareStatement(sql);

            prepare.setString(1, nid);

            result = prepare.executeQuery();
            
            if(result.next()){
                dosen = new Dosen();
                dosen.setAlamat(result.getString("alamat"));
                dosen.setJk(result.getString("jk"));
                dosen.setNid(result.getString("nid"));
                dosen.setNama_dsn(result.getString("nama_dsn"));
            }
            return dosen;
        } catch (SQLException ex) {
            return dosen;
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
   public List<Dosen> selectAll(){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        List<Dosen> list = new ArrayList<>();
        
        try {

            String sql = "SELECT * FROM tabdosen";

            prepare = koneksi.prepareStatement(sql);

            result = prepare.executeQuery();
            
            while(result.next()){
                Dosen dosen = new Dosen();
                dosen.setAlamat(result.getString("alamat"));
                dosen.setJk(result.getString("jk"));
                dosen.setNid(result.getString("nid"));
                dosen.setNama_dsn(result.getString("nama_dsn"));
                
                list.add(dosen);
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
