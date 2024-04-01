/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi_jarak;
//Halaman ini akan berfungsi untuk menyambungkan projek ke database menggunakan bantuan import java.sql
import java.sql.*;
public class Koneksi {
    //menggunakan import/library Connect agar mudah menghubungkan ke db
    private Connection connect;
    
    //ketiga variable ini nantinya akan digabungkan ke dalam satu baris kode yang bergungsi untuk menghubungkan database 
    private String jdbcUrl = "jdbc:mysql://localhost:3306/konversi_jarak";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi(){
        //apabila isi connect null maka akan langsung otomatis menjalankan perintah untuk mengubungkan koneksi
          if(connect == null){
            try{
                //isi variable connect berisi url ke db langsung yang dimudahkan dengan DriverManager menggunakan fungsi getConnection
                connect = DriverManager.getConnection(jdbcUrl,username,password);
                //apabila berhasil terhubung maka jalankan perintah
                System.out.println("Koneksi db berhasil");
            }catch(SQLException e){
                //apabula gagal maka jalankan perintah ini
                System.out.println("Koneksi db gagal" + e);
                System.exit(0);
            }
        }
        return connect;
    }  
}
