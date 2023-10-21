package Aula04_Lista_Objetos;
import java.util.ArrayList;

class Pessoas {
    private String nome;
    private ArrayList<Carros> carros;
    Carros carroMaisRapido;

    Pessoas(String nome) {
        this.nome = nome;
        carros = new ArrayList<Carros>();
    }
    Carros getCarroMaisRapido(){
        return carroMaisRapido;
    }
    

    void registrarCarro(Carros c) {
        carros.add(c);
         if (carroMaisRapido == null || c.getVelocidade() > carroMaisRapido.getVelocidade()) {
            carroMaisRapido = c;
         }
    }

    void removerCarro(Carros c) {
        carros.remove(c);
         if (c == carroMaisRapido) {
            carroMaisRapido = null;
            for (Carros carro : carros) {
                if (carroMaisRapido == null || carro.getVelocidade() > carroMaisRapido.getVelocidade()) {
                    carroMaisRapido = carro;
                }
            }
         }
    }   
     
    public String toString() {
        String str = nome + " tem os seguintes carros:\n";
        for (Carros c : carros) {
            str += c + "\n";
        }
        return str;
    }
}

class Carros {
    private String marca;
    private String modelo;
    private int velocidade;

    Carros(String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
          this.velocidade = velocidade;
    }
    
    int getVelocidade() {
        return velocidade;
    }
    
    public String toString() {
        return marca + " " + modelo;
    }
     
}
      
public class Trabalho_Pessoa_varios_Carros {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("Bernardo");
        Pessoas pessoa2 = new Pessoas("Gabriele");

        Carros carro1 = new Carros("Fiat", "Uno",180);
        Carros carro2 = new Carros("Chevrolet", "Corsa",170);
        Carros carro3 = new Carros("Ford", "Fiesta",90);
        
        Carros carro4 = new Carros("Chevrolet","Prisma",109);
        Carros carro5 = new Carros("Chevrolet", "Onix",110);
        Carros carro6 = new Carros("Volkswagen", "Gol",120);
        Carros carro7 = new Carros("ferrari", "F200",130);
        Carros carro8 = new Carros("Ford", "Ka",140);
        Carros carro9 = new Carros("Tesla", "T1000",150);

        pessoa1.registrarCarro(carro1);
        pessoa1.registrarCarro(carro2);
        pessoa1.registrarCarro(carro3);
        
        
        pessoa2.registrarCarro(carro4);
        pessoa2.registrarCarro(carro5);
        pessoa2.registrarCarro(carro6);
        pessoa2.registrarCarro(carro7);
        pessoa2.registrarCarro(carro8);
        pessoa2.registrarCarro(carro9);
        System.out.print(pessoa1);
        System.out.println("Carro mais rápido " + pessoa1.getCarroMaisRapido());
        System.out.println("");
        
        
        System.out.print(pessoa2);
        System.out.println("Carro mais rápido " + pessoa2.getCarroMaisRapido());
        System.out.println("");

        pessoa1.removerCarro(carro1);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}