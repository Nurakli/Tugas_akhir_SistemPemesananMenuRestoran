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
public class datapembayaran {
    private ArrayList<String> id_pembayaran;
    private ArrayList<String> id_pesanan;
    private ArrayList<Integer> total_harga;
    private ArrayList<Integer> jumlah_harga; 
    private ArrayList<String> jumlah_bayar;
    private ArrayList<Integer> tanggal;
    
    public datapembayaran (){
        id_pembayaran = new ArrayList <String>();
        id_pesanan = new ArrayList <String>();
        total_harga = new ArrayList <Integer>();
        jumlah_harga = new ArrayList <Integer>();
        jumlah_bayar = new ArrayList <String>();
        tanggal = new ArrayList <Integer>();
    };
    
    
    public void insertid_pembayaran(String isi){
        this.id_pembayaran.add(isi);
    }
    
    public ArrayList <String> getRecordid_pembayaran(){
        return this.id_pembayaran;
    }
    
    public void insertid_pesanan(String isi){
    this.id_pesanan.add(isi);
    }
    
    public ArrayList <String> getRecordid_pesanan(){
        return this.id_pesanan;
    }
    
    public void inserttotal_harga(Integer isi){
    this.total_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordtotal_harga(){
        return this.total_harga;
    }
    
    public void insertjumlah_harga(Integer isi){
    this.jumlah_harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordjumlah_harga(){
        return this.jumlah_harga;
    }
    
    public void inserjumlah_bayar(String isi){
    this.jumlah_bayar.add(isi);
    }
    
    public ArrayList <String> getRecordjumlah_bayar(){
        return this.jumlah_bayar;
    }
    public void insertanggal(Integer isi){
    this.tanggal.add(isi);
    }
    
    public ArrayList <Integer> getRecordtanggal(){
        return this.tanggal;
    }
}
