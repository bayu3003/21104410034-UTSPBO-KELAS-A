/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uts_pbo_21104410034;

/**
 *
 * @author Bayu Samudra
 * TI-A
 */
public class MainEnergic {
  public static void main(String[] args) {
        Kinetic massa = new Kinetic();
        Kinetic kecepatan = new Kinetic();
        
        System.out.println("Program Menghitung Energi Kinetik : ");
        
        System.out.print("Masukkan massa benda : ");
        Scanner masa = new Scanner(System.in);
        massa.setMassa(masa.nextDouble());
        
        System.out.print("Masukkan kecepatan benda : ");
        Scanner cepat = new Scanner(System.in);
        kecepatan.setKecepatan(cepat.nextDouble());
   
        System.out.println("Maka Energi Kinetic nya adalah : " + 0.5 * massa.getMassa() * Math.pow(kecepatan.getKecepatan(), 2));
    }
}

