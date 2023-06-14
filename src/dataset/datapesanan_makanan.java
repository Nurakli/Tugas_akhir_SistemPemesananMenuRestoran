/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class datapesanan_makanan {
    private ArrayList<String> id_makanan;
    private ArrayList<String> id_pesanan;
    private ArrayList<Integer> jumlah_pesanan;

public datapesanan_makanan (){
        id_makanan = new ArrayList <String>();
       id_pesanan = new ArrayList <String>();
        jumlah_pesanan = new ArrayList <Integer>();
};
    
    public void insertid_makanan(String isi){
        this.id_makanan.add(isi);
    }
    
    public ArrayList <String> getRecordid_makanan(){
        return this.id_makanan;
    }
    public void insertid_pesanan(String isi){
        this.id_pesanan.add(isi);
    }
    
    public ArrayList <String> getRecordid_pesanan(){
        return this.id_pesanan;
    }
    
    public void insertjumlah_pesanan(Integer isi){
        this.jumlah_pesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordjumlah_pesanan(){
        return this.jumlah_pesanan;
}
}