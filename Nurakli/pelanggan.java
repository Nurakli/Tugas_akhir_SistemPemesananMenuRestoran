/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class pelanggan {
      private String id_pelanggan;
    private int no_meja;
    
    public pelanggan (String id_pelanggan, int no_meja){
       this.id_pelanggan=id_pelanggan;
       this.no_meja=no_meja;
    }
    
    public String getid_pelanggan(){
        return id_pelanggan;
    }
    
    public void setid_menu(String id_pelanggan){
        this.id_pelanggan=id_pelanggan;
        
    }
    public int getno_meja(){
        return no_meja;
    }
    
    public void Setno_meja(int no_meja){
        this.no_meja=no_meja; 
    } 
}
