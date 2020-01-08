package com.database.dao.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

public class Matkul {
    @TableColumn(number=1, name="Kode",size=20)
    private String kode;
    @TableColumn(number=2, name="Mata Kuliah",size=70)
    private String matkul;
    @TableColumn(number=3, name="SKS",size=12)
    private String sks;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
    

  
}
