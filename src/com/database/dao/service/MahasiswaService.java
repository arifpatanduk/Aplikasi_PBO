package com.database.dao.service;

import com.database.dao.entity.Mahasiswa;
import com.database.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MahasiswaService {
    private Connection koneksi;
    public MahasiswaService(){
        koneksi = DatabaseUtil.getKoneksi();
    }
    public void insert(Mahasiswa mahasiswa){
        PreparedStatement prepare = null;
        try {
            String sql = "insert into tabmahasiswa(nim, nama, tanggal_lahir, jurusan, alamat) values (?,?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, mahasiswa.getNim());
            prepare.setString(2, mahasiswa.getNama());
            prepare.setDate(3, new java.sql.Date(mahasiswa.getTanggal_lahir().getTime()));
            prepare.setString(4, mahasiswa.getJurusan());
            prepare.setString(5, mahasiswa.getAlamat());
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
    public void update(Mahasiswa mahasiswa){
          PreparedStatement prepare = null;
        try {
            String sql = "update tabmahasiswa  set nama=?,tanggal_lahir=?,jurusan=?,alamat=? where nim = ?";
            prepare = koneksi.prepareStatement(sql);
        
            prepare.setString(1, mahasiswa.getNama());
            prepare.setDate(2, new java.sql.Date(mahasiswa.getTanggal_lahir().getTime()));
            prepare.setString(3, mahasiswa.getJurusan());
            prepare.setString(4, mahasiswa.getAlamat());
            prepare.setString(5, mahasiswa.getNim());
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
    public void delete(String nim){
            PreparedStatement prepare = null;
        try {
            String sql = "delete from tabmahasiswa where nim = ?";
            prepare = koneksi.prepareStatement(sql);
            
            prepare.setString(1, nim);
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
    public Mahasiswa selectByNim(String nim){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        Mahasiswa mahasiswa = null;
        
        try {

            String sql = "SELECT * FROM tabmahasiswa WHERE nim = ?";

            prepare = koneksi.prepareStatement(sql);

            prepare.setString(1, nim);

            result = prepare.executeQuery();
            
            if(result.next()){
                mahasiswa = new Mahasiswa();
                mahasiswa.setAlamat(result.getString("alamat"));
                mahasiswa.setJurusan(result.getString("jurusan"));
                mahasiswa.setNim(result.getString("nim"));
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setTanggal_lahir(result.getDate("tanggal_lahir"));
            }
            return mahasiswa;
        } catch (SQLException ex) {
            return mahasiswa;
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
    public List<Mahasiswa> selectAll(){
        PreparedStatement prepare = null;
        ResultSet result = null;
        
        List<Mahasiswa> list = new ArrayList<>();
        
        try {

            String sql = "SELECT * FROM tabmahasiswa";

            prepare = koneksi.prepareStatement(sql);

            result = prepare.executeQuery();
            
            while(result.next()){
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setAlamat(result.getString("alamat"));
                mahasiswa.setJurusan(result.getString("jurusan"));
                mahasiswa.setNim(result.getString("nim"));
                mahasiswa.setNama(result.getString("nama"));
                mahasiswa.setTanggal_lahir(result.getDate("tanggal_lahir"));
                
                list.add(mahasiswa);
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
