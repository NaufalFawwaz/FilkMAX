/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewGUI.GUIIII;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Kursi {
    
    static int[] AllKursi = new int[7];
    static String[] KursiText = new String[7];
    static ArrayList<String> NewKursi = new ArrayList<>();
    static double harga = 35000;
    static int countHarga;
    
    public void Isi(int data){
        AllKursi[data--] = 1;
    }
    public void Reset(int data){
        AllKursi[data--] = 0;
    }
    public void Tulis(int N, String data){
        KursiText[N--]= data;
    }
    public void CekText(String[] data){
        for(int i = 0; i < data.length; i++){
            if(data[i]!=null){
                NewKursi.add(data[i]);
            }
        }
    }
    public void tambahHarga(){
        countHarga++;
    }
    public double totalHarga(){
        return countHarga*harga;
    }
    public int random(){
      int min = 111111;
      int max = 999999;
        
      //Generate random int value from 50 to 100 
      System.out.println("Random value in int from "+min+" to "+max+ ":");
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      return random_int;
    }
}
