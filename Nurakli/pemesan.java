/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class pemesan {
   private String id_pemesan;
   private String id_pelanggan; 
   private int total_harga;
  
   
  public pemesan (String id_pemesan, String id_pelanggan, int total_harga){
       this.id_pemesan=id_pemesan;
       this.id_pelanggan=id_pelanggan;
       this.total_harga=total_harga;
    }
    
    public String getid_pemesan(){
        return id_pemesan;
    }
    
    public void setid_pemesan(String id_pemesan){
        this.id_pemesan=id_pemesan;
    }
    
    public String getid_pelanggan(){
        return id_pelanggan;
    }
    
    public void setid_pelanggan(String id_pelanggan){
        this.id_pelanggan=id_pelanggan;
    }
    
        public int gettotal_harga(){
        return total_harga;
    }
    
    public void settotal_harga (int total_harga){
        this.total_harga=total_harga;
    }  
}
