package Aula01_revisao;

import static Aula01_revisao.exercicio3_Comparar_stringProfessor.compararStrings;
import java.util.Arrays;

public class exercicio3_Comparar_string {

    public static void main(String[] args) {

        String n1 = "Fabi";
        String n2 = "fabi";

//        boolean igual = true;
//        // compara os tamanhos dos vetores se são de tamanhos iguais
//        if (str1.length() == str2.length()) {
//            for (int i = 0; i < str1.length(); i++) {
//                if (str1.charAt(i) != str2.charAt(i)) { //charat é a função que vai comparar o vetor da string
//                    igual = false;
//                    break;
//                }
//            }
//        } else {
//            igual = false;
//        }
//
//        if (igual) {
//            System.out.println("As strings são iguais.");
//        } else {
//            System.out.println("As strings não são iguais");
//
//        }
        System.out.println(compararStrings(n1, n2));
    }
}
