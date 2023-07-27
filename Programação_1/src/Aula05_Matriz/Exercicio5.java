package Aula05_Matriz;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int m[ ][ ] = new int[4][5];
       
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++) {
               m[i][j] = i+ j*2;
            }
            System.out.println(Arrays.toString(m[i]));
        } 
    }
    
}
