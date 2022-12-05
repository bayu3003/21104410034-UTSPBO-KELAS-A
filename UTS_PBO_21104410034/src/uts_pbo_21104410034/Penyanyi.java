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
public class Penyanyi extends Pop{
    public static void main(String[]args){
        Pop pop = new Pop ("Black Pink", "How You Like That");
        Dangdut dangdut = new dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
    }

    private static class dangdut extends Dangdut {

        public dangdut() {
        }
    }
}