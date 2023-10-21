package Aula10_Exercicio3;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

/**
 * Utilize a classe Consultor previamente implementada Cria uma ArrayList com 3
 * Consultores Devem possuir diferentes valorHora A cada 1 segundo, todos os
 * Consultores da Lista devem registrar 2h de trabalho O programa deve parar de
 * registrar horas após 15 segundos Quando parar de registrar, deve mostrar na
 * tela o salário de cada Consultor
 */
public class Consultor extends TimerTask {

    String nome;
    int valorHora;
    int horasTrabalhadas = 0;
    int segundos = 0;
    ArrayList<Consultor> consultores;

    Consultor(String nome, int valor_hora, ArrayList<Consultor> consultores) {
        this.nome = nome;
        this.valorHora = valor_hora;
        this.consultores = consultores;
        consultores.add(this);
    }

    void registrarHoras() {
        horasTrabalhadas += 2;
    }

    int calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    @Override
    public void run() {
        if (segundos <= 14) {
            for (int i = 0; i < consultores.size(); i++) {
                Consultor consultor = consultores.get(i);
                consultor.registrarHoras();
                System.out.println("Consultor: " + consultor.getNome() + " - Horas trabalhadas: " + consultor.getHorasTrabalhadas());
                }
            segundos++;
        } else {
            for (int i = 0; i < consultores.size(); i++) {
                Consultor consultor = consultores.get(i);
                System.out.println("Consultor: " + consultor.getNome() + " - Salário: " + consultor.calcularSalario());
                cancel();
            }
            
        }
    }

    public static void main(String[] args) {
        ArrayList<Consultor> consultores = new ArrayList<>();
        Consultor consultor1 = new Consultor("Bernardo", 70, consultores);
        Consultor consultor2 = new Consultor("Daniele", 80, consultores);
        Consultor consultor3 = new Consultor("Marcelo", 100, consultores);

        Timer timer = new Timer();
        timer.schedule(consultor3, 0, 1000);
        
    }

}
