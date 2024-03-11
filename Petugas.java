/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.lelang_pbo;

import java.util.ArrayList;
import java.util.ArrayList; 

public class Petugas implements User{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("AGUS");
        this.alamat.add("Nganjuk");
        this.telepon.add("081175946933");
    }

    
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

      public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

   
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }


    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }
}
          
           


