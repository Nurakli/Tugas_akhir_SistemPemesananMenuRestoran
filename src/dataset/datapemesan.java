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
public class datapemesan {
    private ArrayList<String> id_pemesan;
    private ArrayList<String> id_pelanggan;
    private ArrayList<Integer> total_harga;

public datapemesan (){
        id_pemesan = new ArrayList <String>();
        id_pelanggan = new ArrayList <String>();
        total_harga = new ArrayList <Integer>();
};
    
    public void insertid_pemesan(String isi){
        this.id_pemesan.add(isi);
    }
    
    public ArrayList <String> getRecordid_pemesan(){
        return this.id_pemesan;
    }
    public void insertid_pelanggan(String isi){
        this.id_pelanggan.add(isi);
    }
    
    public ArrayList <String> getRecordid_pelanggan(){
        return this.id_pelanggan;
    }
    
    public void inserttotal_harga(Integer isi){
        this.total_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordtotal_harga(){
        return this.total_harga;
}
}