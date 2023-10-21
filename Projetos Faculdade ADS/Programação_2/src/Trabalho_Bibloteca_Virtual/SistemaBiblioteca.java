
package Trabalho_Bibloteca_Virtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
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

class Usuario {
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

class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, List<String> autores, int ano, int codigo) {
        Livro livro = new Livro(titulo, autores, ano, codigo);
        livros.add(livro);
    }

    public Livro consultarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public List<Livro> consultarLivroPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            for (String nomeAutor : livro.getAutores()) {
                if (nomeAutor.equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(livro);
                    break;
                }
            }
        }
        return livrosEncontrados;
    }

    public void cadastrarUsuario(String nome, String cpf) {
        Usuario usuario = new Usuario(nome, cpf);
        usuarios.add(usuario);
    }

    public Usuario consultarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario consultarUsuarioPorCpf(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null;
    }

    public void cadastrarEmprestimo(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            usuario.getLivrosEmprestados().add(livro);
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("O livro não está disponível no momento.");
        }
    }

    public void finalizarEmprestimo(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            livro.setDisponivel(true);
            usuario.getLivrosEmprestados().remove(livro);
            System.out.println("Empréstimo finalizado com sucesso.");
        } else {
            System.out.println("Este usuário não possui este livro emprestado.");
        }
    }
}

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Cadastrar livros
        biblioteca.cadastrarLivro("O Senhor dos Anéis", List.of("J.R.R. Tolkien"), 1954, 12345);
        biblioteca.cadastrarLivro("Harry Potter e a Pedra Filosofal", List.of("J.K. Rowling"), 1997, 67890);

        // Cadastrar usuários
        biblioteca.cadastrarUsuario("João", "123456789");
        biblioteca.cadastrarUsuario("Maria", "987654321");

        // Consultar livros
        Livro livro1 = biblioteca.consultarLivroPorTitulo("O Senhor dos Anéis");
        if (livro1 != null) {
            System.out.println("Livro encontrado: " + livro1.getTitulo());
            System.out.println("Autor(es): " + livro1.getAutores());
            System.out.println("Ano: " + livro1.getAno());
            System.out.println("Código: " + livro1.getCodigo());
            System.out.println("Disponível: " + (livro1.isDisponivel() ? "Sim" : "Não"));
        } else {
            System.out.println("Livro não encontrado.");
        }

        List<Livro> livrosDoAutor = biblioteca.consultarLivroPorAutor("J.K. Rowling");
        if (!livrosDoAutor.isEmpty()) {
            System.out.println("Livros encontrados para o autor: " + livrosDoAutor.size());
            for (Livro livro : livrosDoAutor) {
                System.out.println("Livro: " + livro.getTitulo());
            }
        } else {
            System.out.println("Nenhum livro encontrado para este autor.");
        }

        // Consultar usuário
        Usuario usuario1 = biblioteca.consultarUsuarioPorNome("João");
        if (usuario1 != null) {
            System.out.println("Usuário encontrado: " + usuario1.getNome());
            System.out.println("CPF: " + usuario1.getCpf());
            List<Livro> livrosEmprestados = usuario1.getLivrosEmprestados();
            if (!livrosEmprestados.isEmpty()) {
                System.out.println("Livros emprestados: " + livrosEmprestados.size());
                for (Livro livro : livrosEmprestados) {
                    System.out.println("Livro: " + livro.getTitulo());
                }
            } else {
                System.out.println("Nenhum livro emprestado para este usuário.");
            }
        } else {
            System.out.println("Usuário não encontrado.");
        }

        // Cadastrar empréstimo
        Livro livro2 = biblioteca.consultarLivroPorTitulo("Harry Potter e a Pedra Filosofal");
        if (livro2 != null) {
            Usuario usuario2 = biblioteca.consultarUsuarioPorNome("Maria");
            if (usuario2 != null) {
                biblioteca.cadastrarEmprestimo(usuario2, livro2);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }

        // Finalizar empréstimo
        Usuario usuario3 = biblioteca.consultarUsuarioPorNome("Maria");
        if (usuario3 != null) {
            Livro livro3 = biblioteca.consultarLivroPorTitulo("Harry Potter e a Pedra Filosofal");
            if (livro3 != null) {
                biblioteca.finalizarEmprestimo(usuario3, livro3);
            } else {
                System.out.println("Livro não encontrado.");
            }
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
