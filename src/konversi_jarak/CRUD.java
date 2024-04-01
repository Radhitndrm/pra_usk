/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi_jarak;

import java.sql.*;
public class CRUD {
    private String angka_input,parameter1,parameter2,hasil,pesan, CRUDquery;
    private Connection CRUDkoneksi;
    private ResultSet CRUDhasil;
    private Statement CRUDstat;
    private PreparedStatement CRUDpsmt;
    
    public CRUD(){
        Koneksi kon = new Koneksi();
        CRUDkoneksi = kon.getKoneksi();
    }
    
    
    public String getAngka_input() {
        return angka_input;
    }

    public void setAngka_input(String angka_input) {
        this.angka_input = angka_input;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }
  
    public String simpanData(String angka_input, String parameter1, String parameter2, String hasil){
        CRUDquery = "Insert into record (angka_input,parameter1,parameter2,hasil) values (?,?,?,?)";
        
        try{
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, angka_input);
            CRUDpsmt.setString(2, parameter1);
            CRUDpsmt.setString(3, parameter2);
            CRUDpsmt.setString(4, hasil);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            pesan = "Data berhasil disimpan";
        }catch(Exception e){
            System.out.println(e);
            pesan = "Data gagal disimoan";
        }
        return pesan;
    }
    
   
}
