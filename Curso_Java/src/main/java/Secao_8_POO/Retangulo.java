package Secao_8_POO;

import java.util.Scanner;

class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        double largura = scanner.nextDouble();

        System.out.print("Enter rectangle height: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.printf("AREA = %.2f%n", retangulo.calcularArea());
        System.out.printf("PERIMETER = %.2f%n", retangulo.calcularPerimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.calcularDiagonal());

        scanner.close();
    }


}

