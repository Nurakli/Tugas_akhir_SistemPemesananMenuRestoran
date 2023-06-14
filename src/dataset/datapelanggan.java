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
public class datapelanggan {
    private ArrayList<Integer> id_pelanggan;
    private ArrayList<String> no_pelanggan;

public datapelanggan (){
       id_pelanggan = new ArrayList <Integer>();
        no_pelanggan = new ArrayList <String>();
};

public void insertid_pelanggan(Integer isi){
        this.id_pelanggan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pelanggan(){
        return this.id_pelanggan;
    } 
    
public void insertno_pelanggan(String isi){
        this.no_pelanggan.add(isi);
    }
    
public ArrayList <String > getRecordno_pelanggan(){
        return this.no_pelanggan;
    }
}
