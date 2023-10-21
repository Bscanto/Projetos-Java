package Aula11_JavaExceptions;

import java.util.Stack;

public class Desafio_ParentesesValido {

     static boolean validaSequencia(String s) {
        Stack<Character> pilha = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((topo == '(' && c != ')') || (topo == '{' && c != '}') || (topo == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
    
    public static void main(String[] args) {
        String s1 = "(){}[]";
        String s2 = "({[}]";
        String s3 = "((())";
        
        System.out.println("A sequência " + s1 + " é " + (validaSequencia(s1) ? "válida" : "inválida"));
        System.out.println("A sequência " + s2 + " é " + (validaSequencia(s2) ? "válida" : "inválida"));
        System.out.println("A sequência " + s3 + " é " + (validaSequencia(s3) ? "válida" : "inválida"));
    }
}