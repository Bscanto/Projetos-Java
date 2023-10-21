
package Aula05;

import java.util.ArrayList;
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
class Carro{
    String modelo;
    int vel_max;
    int ano;
    int valor;
    Carro(String modelo, int ano, int valor){
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        vel_max = 80;
        
    }
    Carro(String modelo, int ano,int valor, int vel_max){
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.vel_max = vel_max;
        
    }
   

}

class Pessoa{
    String nome;
    ArrayList<Carro> carros;
    Pessoa(String nome){
        this.nome = nome;
        carros = new ArrayList<Carro>();
    }
    void registrarCarro(Carro c){
        carros.add(c);
    }
    int getQuantCarros(){
        return carros.size();
    }
    Carro getCarroMaisRapido(){
        if (carros.size()==0)
            return null;
        Carro mais_rapido_no_momento = carros.get(0);
        int max_vel = 0;
        for (int i=0; i<carros.size(); i++){
            if (carros.get(i).vel_max > max_vel){
                max_vel = carros.get(i).vel_max;
                mais_rapido_no_momento=carros.get(i);
            }
        }
        return mais_rapido_no_momento;
    }
    
    int getValorTotal(){
         if (carros.size() == 0){
            return 0;
         }
        int soma = 0;
        for (int i=0; i<carros.size(); i++){
            
                soma += carros.get(i).valor;
               }
        return soma;
    }
     public String getModeloComMaiorNome() {
    if (carros.size() == 0) {
        return null;
    }
    String modeloComMaiorNome = carros.get(0).modelo;
    for (int i = 1; i < carros.size(); i++) {
        if (carros.get(i).modelo.length() > modeloComMaiorNome.length()) {
            modeloComMaiorNome = carros.get(i).modelo;
        }
    }
    return modeloComMaiorNome;
}
    
    void mostrarCarros(){
        for (int i=0; i< carros.size(); i++)
            System.out.println("Meu "+i+" carro � o "+carros.get(i).modelo);
    }
}

public class Aula4_Carro_Valor {
       public static void main(String[] args) {
        Pessoa p1 = new Pessoa("bernardo");
        p1.registrarCarro(new Carro("MercedesBensxxxxxxxxx",2021, 1000, 180));
        p1.registrarCarro(new Carro("Mercedes1",2021, 2000, 110));
        p1.registrarCarro(new Carro("Mercedes2",2021, 3000, 230));
        p1.registrarCarro(new Carro("Mercedes3",2021, 4000, 250));
        
        Carro c1 = new Carro("Lamborguini", 2020, 5000);
        p1.registrarCarro(c1);
        Carro rapidao = p1.getCarroMaisRapido();
        
        System.out.println(rapidao.modelo);
           System.out.println("Somatório dos valores dos carros é: " + p1.getValorTotal());
           System.out.println("O carro com o maior nome é:" + p1.getModeloComMaiorNome());
        //System.out.println("Quant carros: "+p1.getQuantCarros());
    }
}