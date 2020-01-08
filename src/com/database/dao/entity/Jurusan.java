package com.database.dao.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

public class Jurusan {
    @TableColumn(number=1, name="Kode Jurusan",size=16)
    private String kd_jur;
    @TableColumn(number=2, name="Nama Jurusan",size=46)
    private String nm_jur;
    @TableColumn(number=3, name="Jumlah Mahasiswa",size=25)
    private String jml_mhs;
    @TableColumn(number=4, name="Gelar",size=15)
    private String gelar;

    public String getKd_jur() {
        return kd_jur;
    }

    public void setKd_jur(String kd_jur) {
        this.kd_jur = kd_jur;
    }

    public String getNm_jur() {
        return nm_jur;
    }

    public void setNm_jur(String nm_jur) {
        this.nm_jur = nm_jur;
    }

    public String getJml_mhs() {
        return jml_mhs;
    }

    public void setJml_mhs(String jml_mhs) {
        this.jml_mhs = jml_mhs;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    
   
}
