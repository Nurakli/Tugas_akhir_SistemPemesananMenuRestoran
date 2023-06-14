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
public class datamenu {
    private ArrayList<Integer> id_menu;
    private ArrayList<String> jenis_menu;

public datamenu (){
       id_menu = new ArrayList <Integer>();
        jenis_menu = new ArrayList <String>();
};

public void insertid_menu(Integer isi){
        this.id_menu.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_menu(){
        return this.id_menu;
    }
    public void insertjenis_menu(String isi){
        this.jenis_menu.add(isi);
    }
    
    public ArrayList <String> getRecordjenis_menu(){
        return this.jenis_menu;
    }
}