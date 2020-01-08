package com.AplikasiKampus;

import com.database.util.DatabaseUtil;
import java.io.File;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;



public class CetakLaporan {
    private Connection koneksi;
    public CetakLaporan(String laporan){
        try{
            koneksi = DatabaseUtil.getKoneksi();
            
            File laporan_file = new File(laporan);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(laporan_file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,koneksi);
            
            JasperViewer.viewReport(jasperPrint,false);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
