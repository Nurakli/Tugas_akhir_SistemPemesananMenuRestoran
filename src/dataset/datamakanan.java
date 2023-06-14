/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datamakanan {
    private ArrayList<String> id_makanan;
    private ArrayList<String> id_menu;
    private ArrayList<String> nama_makanan;
    private ArrayList<Integer> harga; 
    private ArrayList<Integer> jumlah_tersedia;
    
    public datamakanan (){
        id_makanan = new ArrayList <String>();
        id_menu = new ArrayList <String>();
        nama_makanan = new ArrayList <String>();
        harga = new ArrayList <Integer>();
        jumlah_tersedia = new ArrayList <Integer>();
    };
    
    
    public void insertid_makanan(String isi){
        this.id_makanan.add(isi);
    }
    
    public ArrayList <String> getRecordid_maknan(){
        return this.id_makanan;
    }
    
    public void insertid_menu(String isi){
    this.id_menu.add(isi);
    }
    
    public ArrayList <String> getRecordid_menu(){
        return this.id_menu;
    }
    
    public void insertnama_makanan(String isi){
    this.nama_makanan.add(isi);
    }
    
    public ArrayList <String> getRecordnama_makanan(){
        return this.nama_makanan;
    }
    
    public void insertharga(Integer isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordharga(){
        return this.harga;
    }
    
    public void inserjumlah_tersedia(Integer isi){
    this.jumlah_tersedia.add(isi);
    }
    
    public ArrayList <Integer> getRecordjumlah_tersedia(){
        return this.jumlah_tersedia;
    }
}
