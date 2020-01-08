
package com.database.util;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

private static Connection koneksi;

public static Connection getKoneksi(){
    if (koneksi == null){
        try{
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        
        String url = "jdbc:mysql://localhost:3306/dbkampus";
        String user = "root";
        String password = "";
        
        koneksi = DriverManager.getConnection(url, user, password);
        System.out.println("Koneksi sukses");
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal");
        }
    }
    return koneksi;
}
}
