package fila_escalonamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa{
	private int id;
	private int numDeContas;
	
	public Pessoa() {
		
	}
	public Pessoa(int id, int numDeContas) {
		this.id = id;
		this.numDeContas = numDeContas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumDeContas() {
		return numDeContas;
	}
	public void setNumDeContas(int numDeContas) {
		this.numDeContas = numDeContas;
	}
	
}

public class Fila_Escalonamento {   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
		int numMaximoDeContas;
		int numPessoasNaFila;
		List<Pessoa> fila = new ArrayList<Pessoa>();

		System.out.println("**Bem vindo ao banco 'ESCALONAMENTO CIRCULAR'**\n");

		System.out.print("Informe o numero maximo de contas a serem pagas no caixa: ");
		numMaximoDeContas = sc.nextInt();
		System.out.print("Informe o numero de pessoas na fila: ");
		numPessoasNaFila = sc.nextInt();
		
		for(int i = 0; i < numPessoasNaFila; i++) {
			System.out.printf("Informe o numero de contas a serem pagas pela pessoa %d: ", i+1);
			Pessoa pessoa = new Pessoa();
			pessoa.setId(i+1);
			pessoa.setNumDeContas(sc.nextInt());
			fila.add(pessoa);
		}
		
		System.out.println();
		
		while(!fila.isEmpty()) {
			System.out.println("Pessoa " + fila.get(0).getId() + " vai ao caixa com " + fila.get(0).getNumDeContas() + " contas");
			fila.get(0).setNumDeContas(fila.get(0).getNumDeContas() - numMaximoDeContas);
			if(fila.get(0).getNumDeContas() <= 0) {
				System.out.println("Pessoa " + fila.get(0).getId() + " sai da fila");
				fila.remove(0);
			}else {
				System.out.println("Pessoa " + fila.get(0).getId() + " retorna para a fila com " + fila.get(0).getNumDeContas() + " contas");
				Pessoa pessoaTemp = fila.get(0);
				fila.remove(0);
				fila.add(pessoaTemp);
			}
		}
		System.out.println("\n**Volte sempre**");
		
	}

}