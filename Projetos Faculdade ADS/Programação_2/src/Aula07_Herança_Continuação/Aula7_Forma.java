package Aula07_Herança_Continuação;

import java.util.Scanner;
class Forma {
    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }


    double calcularArea() {
        return 0.0;
    }

    double calcularPerimetro() {
        return 0.0;
    }
}

class Retangulo extends Forma {
    private double lado1;
    private double lado2;

    public Retangulo(String nome, double lado1, double lado2) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}

class Triangulo extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String nome, double lado1, double lado2, double lado3, double lado2Triangulo) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    } 
}

class Circulo extends Forma {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
      return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
public class Aula7_Forma {
          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o valor do primeiro lado do retangulo:");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo lado do retangulo:");
        double lado2 = scanner.nextDouble();
        
        Retangulo retangulo = new Retangulo("Retangulo", lado1, lado2);
        System.out.println(retangulo.nome);
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());
        
        
         System.out.println("====================");
        System.out.println("Digite o valor da base do triangulo:");
        double base = scanner.nextDouble();
        
        System.out.println("Digite o valor da altura do triangulo:");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite o valor do primeiro lado do triangulo:");
        double lado1Triangulo = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo lado do triagulo:");
        double lado2Triangulo = scanner.nextDouble();
        
        Triangulo triangulo = new Triangulo("Triangulo", base, altura, lado1Triangulo, lado2Triangulo);
        System.out.println(triangulo.nome);
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        
        
        System.out.println("====================");
        System.out.println("Digite o valor do raio do círculo:");
        double raio = scanner.nextDouble();
        
        Circulo circulo = new Circulo("Círculo", raio);
        System.out.println(circulo.nome);
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        
    }
}