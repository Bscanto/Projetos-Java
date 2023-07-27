package Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}