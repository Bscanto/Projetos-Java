package Secao_8_POO;


import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35;
    }

    public String verificarAprovacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 60.0) {
            return "PASS";
        } else {
            double pontosFaltantes = 60.0 - notaFinal;
            return "FAILED\nMissing " + String.format("%.2f", pontosFaltantes) + " points";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String nome = scanner.nextLine();

        System.out.print("Enter grade for first quarter: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Enter grade for second quarter: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Enter grade for third quarter: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Final grade: " + String.format("%.2f", aluno.calcularNotaFinal()));
        System.out.println("Result: " + aluno.verificarAprovacao());

        scanner.close();
    }
}
