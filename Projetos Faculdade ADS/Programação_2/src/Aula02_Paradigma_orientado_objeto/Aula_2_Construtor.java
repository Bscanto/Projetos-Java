package Aula02_Paradigma_orientado_objeto;

// classe/ escopo da classe

import java.util.Scanner;

class Car {
//atributos do objeto
    String modelo;
    int ano_carro;
    String modelo_carro;
    int v_maxima;
/*==================================================*/
    //construtor
       Car(String modelo,int ano, int vel_max){
        this.modelo_carro = modelo;
        this.ano_carro = ano;
        this.v_maxima = v_maxima;
        System.out.println("Carro Criado: \nModelo:" + modelo + "\nAno: " + ano + "\nVelocidade máxima: " + vel_max);
    }
// metodos
   
    void buzinar() {
        if (modelo.equals("Ferrari")) 
            System.out.println("BIBI");
         else 
            System.out.println("BOBO");
    }  
    // metodos
    void correr(int velocidade_desejada) {
        // velocidade_desejada = 10
        // vel_max = 100
        if (velocidade_desejada < v_maxima) 
            System.out.println("Correndo a " + velocidade_desejada);
         else
            System.out.println("Correndo a " + v_maxima);
    }
}

   class Person{
       String nome;
       int idade;
             
         void apresentar(){
           if(nome != null) {
               System.out.println("Ola! \nMeu nome é: " + nome + " e tenho " + idade + " anos.");
           } else {
               System.out.println("Não existe pessoa cadastrada!");
            }
         }
   }
 
public class Aula_2_Construtor {
// implementando uma função
    static void qual_mais_rapido(Car car1, Car car2) {
        if (car1.v_maxima > car2.v_maxima) {
            System.out.println("O primeiro é mais rapido");
        } else {
            System.out.println("O segundo é mais rápido");
        }
    }

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        //criando objetos de uma classe
       Car car1 = new Car("tesla",2020,180);
        car1.modelo = "Ferrari";
        car1.ano_carro = 2014;
        car1.v_maxima = 260;
        System.out.println("CARRO C1");
        car1.correr(120);

        //criando objeto de uma classe
       Car car2 = new Car("Corvette",2022,299);
      
        car2.modelo = "Fusca";
        car2.v_maxima = 150;
        System.out.println("CARRO C2");

        car2.correr(180);
        qual_mais_rapido(car1, car2);
        car1.buzinar();
        car2.buzinar();
        
  //==========================================================
  // Criando e apresentando pessoa
        
        Person p1 = new Person();
        p1.nome ="Bruno";
        p1.idade = 35;
        p1.apresentar();
    }

}
