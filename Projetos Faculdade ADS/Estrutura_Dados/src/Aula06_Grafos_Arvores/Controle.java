
package Aula06_Grafos_Arvores;

import java.util.ArrayList;
import java.util.List;

class Processo {
    int id;
    private final int tempoChegada;
    private final int tempoExecucao;

    public Processo(int id, int tempoChegada, int tempoExecucao) {
        this.id = id;
        this.tempoChegada = tempoChegada;
        this.tempoExecucao = tempoExecucao;
    }
}

class EscalonadorFIFO {
    List<Processo> processos;

    public EscalonadorFIFO() {
        processos = new ArrayList<>();
    }

    public void adicionarProcesso(Processo processo) {
        processos.add(processo);
    }

    public void executarProcessos() {
        for (Processo processo : processos) {
            System.out.println("Executando processo " + processo.id);
            
        }
    }
}
public class Controle {
      public static void main(String[] args) {
        EscalonadorFIFO escalonador = new EscalonadorFIFO();

        // Adicionar processos
        escalonador.adicionarProcesso(new Processo(1, 0, 1000));
        escalonador.adicionarProcesso(new Processo(2, 2, 5));
        escalonador.adicionarProcesso(new Processo(3, 40, 8));

        // Executar os processos
        escalonador.executarProcessos();
    }
}