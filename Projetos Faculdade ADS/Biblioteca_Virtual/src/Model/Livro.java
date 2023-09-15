package Model;

import java.util.List;

public class Livro {
    private String titulo;
    private List<String> autores;
    private int ano;
    private int codigo;
    private boolean disponivel;

    public Livro(String titulo, List<String> autores, int ano, int codigo) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }
    public List<String> getAutores() {
        return autores;
    }
    public int getAno() {
        return ano;
    }
    public int getCodigo() {
        return codigo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}