package Aula05_Matriz;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int m[ ][ ] = new int[3][5];
       
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++) {
               m[i][j] = j;
            }
            System.out.println(Arrays.toString(m[i]));
        } 
    }
    
}
