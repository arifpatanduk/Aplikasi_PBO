package com.database.dao.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.Date;

public class Mahasiswa {
    @TableColumn(number=1, name="NIM",size=6)
    private String nim;
    @TableColumn(number=2, name="Nama",size=20)
    private String nama;
    @TableColumn(number=3, name="Tanggal Lahir",size=21)
    private Date tanggal_lahir;
    @TableColumn(number=4, name="Jurusan",size=25)
    private String jurusan;
    @TableColumn(number=5, name="Alamat",size=25)
    private String alamat;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
