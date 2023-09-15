package Model;

import java.util.ArrayList;
import java.util.List;


public class BancoDados {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public BancoDados() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, List<String> autores, int ano, int codigo) {
        Livro livro = new Livro(titulo, autores, ano, codigo);
        livros.add(livro);
    }

    public List<Livro> consultarLivrosPorTitulo(String palavraChave) {
    List<Livro> livrosEncontrados = new ArrayList<>();
    for (Livro livro : livros) {
        if (livro.getTitulo().toLowerCase().contains(palavraChave.toLowerCase())) {
            livrosEncontrados.add(livro);
        }
    }
    return livrosEncontrados;
}

    public List<Livro> consultarLivrosPorPalavraChave(String palavraChave) {
    List<Livro> livrosEncontrados = new ArrayList<>();
    for (Livro livro : livros) {
        List<String> autores = livro.getAutores();
        for (String autor : autores) {
            if (autor.toLowerCase().contains(palavraChave.toLowerCase())) {
                livrosEncontrados.add(livro);
                break;  // Interrompe o loop quando encontra um autor correspondente
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
    
    public Livro consultarLivroPorTitulo(String titulo) {
    for (Livro livro : livros) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
            return livro;
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
            System.out.println("Emprestimo realizado com sucesso.");
        } else {
            System.out.println("O livro nao esta disponivel no momento.");
        }
    }

    public void finalizarEmprestimo(Usuario usuario, Livro livro) {
        if (usuario.getLivrosEmprestados().contains(livro)) {
            livro.setDisponivel(true);
            usuario.getLivrosEmprestados().remove(livro);
            System.out.println("Emprestimo finalizado com sucesso.");
        } else {
            System.out.println("Este usuario nao possui este livro emprestado.");
        }
    }

   
}