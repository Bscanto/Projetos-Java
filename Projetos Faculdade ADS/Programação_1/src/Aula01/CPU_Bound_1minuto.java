/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

/**
 *
 * @author bruno
 */
public class CPU_Bound_1minuto {
    public static void main(String[] args) {
        long f=1;
        long c = 400000;
        String s = "";
        while ( c > 1){
            f *= c;
            s += c + "x";
            c--;
        }
        s += c ;
        //System.out.println(s + " = " + f + "\n");
        
        long start = System.currentTimeMillis();
        
    }
   
}
