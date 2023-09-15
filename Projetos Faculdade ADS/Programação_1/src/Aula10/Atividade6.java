package Aula10;

import java.util.Arrays;

import java.util.Scanner;


public class Atividade6 {
 static void concatenar(String texto[]){
        String tex = "";
        for(int i=0 ; i<texto.length ; i++){
            tex = tex.concat(texto[i]);
        }
        System.out.println(tex);
    }

    public static void main(String[] args) {
      
        String texto[] = {"Java",","," linguagem "," Bem ", " Boa","."};
        concatenar(texto);
    }
    }