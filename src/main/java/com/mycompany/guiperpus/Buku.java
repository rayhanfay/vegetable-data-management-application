/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiperpus;
public class Buku {
    
    private String judul;
    private String penerbit;
    private String pengarang;
    
    private int tahunTerbit;
    private boolean ada;
    public Buku(String judul, String penerbit, String pengarang, int tahunTerbit, boolean ada){
        this.judul =judul;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.ada = ada;
    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public String getPengarang(){
        return pengarang;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public boolean isAda(){
        return ada;
    }
    public void setAda(boolean ada){
        this.ada = ada;
    }
    
}
