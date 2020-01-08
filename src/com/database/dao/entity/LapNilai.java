package com.database.dao.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;

public class LapNilai {
    @TableColumn(number=1, name="Nolap",size=10)
    private String nolap;
    @TableColumn(number=2, name="NIM",size=10)
    private String nim;
    @TableColumn(number=3, name="Nama",size=20)
    private String nama;
    @TableColumn(number=4, name="Mata Kuliah",size=24)
    private String matkul;
    @TableColumn(number=5, name="Absen",size=10)
    private String absen;
    @TableColumn(number=6, name="Tugas",size=10)
    private String tugas;
    @TableColumn(number=7, name="UTS",size=10)
    private String uts;
    @TableColumn(number=8, name="UAS",size=10)
    private String uas;
    @TableColumn(number=9, name="Total",size=10)
    private String total;
    @TableColumn(number=10, name="Mutu",size=10)
    private String mutu;
    @TableColumn(number=11, name="Ket",size=10)
    private String ket;

    public String getNolap() {
        return nolap;
    }

    public void setNolap(String nolap) {
        this.nolap = nolap;
    }

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

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }
    
     public String getUts() {
        return uts;
    }

    public void setUts(String uts) {
        this.uts = uts;
    }
    
    public String getUas() {
        return uas;
    }

    public void setUas(String uas) {
        this.uas = uas;
    }
    
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getMutu() {
        return mutu;
    }

    public void setMutu(String mutu) {
        this.mutu = mutu;
    }
    
    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    
}
