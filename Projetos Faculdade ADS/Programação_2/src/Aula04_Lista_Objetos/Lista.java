package Aula04_Lista_Objetos;

import java.util.ArrayList;
import java.util.Scanner;

// Classe
class Pessoas {
    String nome;
    int idade;

    // construtor
    Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String toString() {
        return "Nome: " + nome + "- idade: " + idade;
    }
}

public class Lista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoas> minha_lista = new ArrayList();

        Pessoas p1 = new Pessoas("Bernardo", 25);
        Pessoas p2 = new Pessoas("Gabriela", 20);

        minha_lista.add(p1);
        minha_lista.add(p2);
        System.out.println(minha_lista.size());
        System.out.println(minha_lista.toString());

        System.out.print("Quantas pessoas você quer adicionar à lista? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; numPessoas < 1; i++) {
            System.out.print("Nome da pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();

            Pessoas pessoa = new Pessoas(nome, idade);
            minha_lista.add(pessoa);
        }

        System.out.println("Lista de pessoas:");
        for (int i = 0; i < minha_lista.size(); i++) {
            Pessoas pessoa = minha_lista.get(i);
            System.out.println(minha_lista.toString());
        }
    }
}
