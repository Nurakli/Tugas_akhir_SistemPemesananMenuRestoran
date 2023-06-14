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
public class dataminuman {
    private ArrayList<String> id_minuman;
    private ArrayList<String> id_menu;
    private ArrayList<String> nama_minuman;
    private ArrayList<Integer> harga; 
    private ArrayList<Integer> jumlah_tersedia;
    
    public dataminuman (){
        id_minuman = new ArrayList <String>();
        id_menu = new ArrayList <String>();
        nama_minuman = new ArrayList <String>();
        harga = new ArrayList <Integer>();
        jumlah_tersedia = new ArrayList <Integer>();
    };
    
    
    public void insertid_minuman(String isi){
        this.id_minuman.add(isi);
    }
    
    public ArrayList <String> getRecordid_minuman(){
        return this.id_minuman;
    }
    
    public void insertid_menu(String isi){
    this.id_menu.add(isi);
    }
    
    public ArrayList <String> getRecordid_menu(){
        return this.id_menu;
    }
    
    public void insertnama_minuman(String isi){
    this.nama_minuman.add(isi);
    }
    
    public ArrayList <String> getRecordnama_minuman(){
        return this.nama_minuman;
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
