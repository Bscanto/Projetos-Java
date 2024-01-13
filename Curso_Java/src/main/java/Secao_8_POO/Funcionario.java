package Secao_8_POO;


import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double percentualAumento) {
        salarioBruto += salarioBruto * (percentualAumento / 100.0);
    }

    public String toString() {
        return "Employee: " + nome + ", $ " + String.format("%.2f", calcularSalarioLiquido());
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String nome = scanner.nextLine();

        System.out.print("Gross salary: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Tax: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println(funcionario);

        System.out.print("Which percentage to increase salary? ");
        double percentualAumento = scanner.nextDouble();

        funcionario.aumentarSalario(percentualAumento);

        System.out.println("Updated data: " + funcionario);

        scanner.close();
    }
}