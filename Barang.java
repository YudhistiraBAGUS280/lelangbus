/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompan.lelang_pbo;
import java.util.ArrayList;

public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaBarang = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
   
    private int index;

    public Barang() {
        add(0, "0", 0, false, 0);
        add(1, "Bus STJ voyager", 1000000, true, 2500000);
        add(2, "Bus STJ Gyula", 5000000, true, 0);
       
        addNew();
    }

    public void add(int id, String nama, int harga, boolean status, int max) {
        setHargaBarang(harga);
        setId(id);
        setNama(nama);
        setStatus(status);
      
    }

    public void addNew() {
        setTerbaru(this.namaBarang.size());
    }

    public String getNama(int id) {
        return this.namaBarang.get(id);
    }

    public void setNama(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public int getId(int id) {
        return this.idBarang.get(id);
    }

    public void setId(int id) {
        this.idBarang.add(id);
    }

    public int getHargaBarang(int id) {
        return this.hargaBarang.get(id);
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang.add(hargaBarang);
    }

    public boolean getStatus(int id) {
        return this.status.get(id);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }


    public void setTerbaru(int penambahan) {
        this.index = penambahan;
    }
    
    public int getTerbaru(){
        return this.index;
    }
}