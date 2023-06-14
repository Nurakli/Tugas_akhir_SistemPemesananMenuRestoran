/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class pembayaran {
    private String id_pembayaran;
    private String id_pesanan;
    private int total_harga;
    private int jumlah_bayar;
    private String keterangan;
    private int tanggal;
    
    public pembayaran (String id_pembayaran, String id_pesanan, int total_harga, int jumlah_bayar, String keterangan,int tanggal){
       this.id_pembayaran=id_pembayaran;
       this.id_pesanan=id_pesanan;
       this.total_harga=total_harga;
       this.jumlah_bayar=jumlah_bayar;
       this.keterangan=keterangan;
       this.tanggal=tanggal;
    }
    
    public String getid_pembayaran(){
        return id_pembayaran;
    }
    
    public void setid_pesanan(String id_pesanan){
        this.id_pesanan=id_pesanan;
        
    }
    public int gettotal_harga(){
        return total_harga;
    }
    
    public void Settotal_harga(int total_harga){
        this.total_harga=total_harga; 
    }
    
    public int getJumlah_bayar(){
        return jumlah_bayar;
    }
    
    public void Setjumlah_bayar(int jumlah_bayar){
        this.jumlah_bayar=jumlah_bayar; 
    }
    public String getketerangan(){
        return keterangan;
    }
    
    public void keterangan(String keterangan){
        this.keterangan=keterangan; 
    }
        public int gettanggal(){
        return tanggal;
    }
    
    public void tanggal(int tanggal){
        this.tanggal=tanggal;
    }
}
