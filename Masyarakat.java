/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.lelang_pbo;
import java.util.ArrayList;
public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat(){
        addMasyarakat("Rian Mahendra","KUDUS","0812828");
        addMasyarakat("Yudhistira","Nganjuk","086473858398");
       
    } 

    public void addMasyarakat(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

 
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

  
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

 
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

  
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
