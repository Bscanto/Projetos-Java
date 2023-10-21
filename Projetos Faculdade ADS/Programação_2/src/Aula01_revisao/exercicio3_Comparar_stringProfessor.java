package Aula01_revisao;

import java.util.Arrays;

public class exercicio3_Comparar_stringProfessor {

    public static boolean compararStrings(String n1, String n2) {
        boolean igual = true;
        for (int cont = 0; cont < n1.length(); cont++) {
            if (n1.charAt(cont) != n2.charAt(cont)) {
                igual = false;
                break;
            }
        }
        return igual;
    }

    public static void main(String[] args) {
        String n1 = "GAbi";
        String n2 = "GAbi";
        System.out.println(compararStrings(n1, n2));

    }
}
