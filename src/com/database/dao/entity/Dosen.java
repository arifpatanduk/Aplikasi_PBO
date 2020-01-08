package com.database.dao.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

public class Dosen {
    @TableColumn(number=1, name="NID",size=6)
    private String nid;
    @TableColumn(number=2, name="Nama",size=25)
    private String nama_dsn;
    @TableColumn(number=3, name="Jenis Kelamin",size=31)
    private String jk;
    @TableColumn(number=4, name="Alamat",size=35)
    private String alamat;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNama_dsn() {
        return nama_dsn;
    }

    public void setNama_dsn(String nama_dsn) {
        this.nama_dsn = nama_dsn;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   
}
