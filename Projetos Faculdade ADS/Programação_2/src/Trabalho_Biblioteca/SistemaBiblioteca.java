package Trabalho_Biblioteca;
import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.println("Emprestimo realizado com sucesso.");
        } else {
            System.out.println("O livro não esta disponível no momento.");
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

public class SistemaBiblioteca {
    private static Scanner scanner = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("===== MENU PRINCIPAL ====");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Consultar Livro por Titulo");
            System.out.println("3. Consultar Livro por Autor");
            System.out.println("4. Cadastrar Usuário");
            System.out.println("5. Consultar Usuario por Nome");
            System.out.println("6. Consultar Usuario por CPF");
            System.out.println("7. Cadastrar Emprestimo");
            System.out.println("8. Finalizar Emprestimo");
            System.out.println("9. Sair");
            System.out.print("Digite a opcao desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    consultarLivroPorTitulo();
                    break;
                case 3:
                    consultarLivroPorAutor();
                    break;
                case 4:
                    cadastrarUsuario();
                    break;
                case 5:
                    consultarUsuarioPorNome();
                    break;
                case 6:
                    consultarUsuarioPorCPF();
                    break;
                case 7:
                    cadastrarEmprestimo();
                    break;
                case 8:
                    finalizarEmprestimo();
                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 9);
    }

    private static void cadastrarLivro() {
        System.out.println("=== CADASTRAR LIVRO ===");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o(s) autor(es) do livro (separados por vírgula): ");
        String autoresInput = scanner.nextLine();
        String[] autoresArray = autoresInput.split(",");
        List<String> autores = Arrays.asList(autoresArray);
        System.out.print("Digite o ano do livro: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        biblioteca.cadastrarLivro(titulo, autores, ano, codigo);
        System.out.println("Livro cadastrado com sucesso.");
    }

    private static void consultarLivroPorTitulo() {
        System.out.println("=== CONSULTAR LIVRO POR TÍTULO ===");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        Livro livro = biblioteca.consultarLivroPorTitulo(titulo);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo());
            System.out.println("Autor(es): " + livro.getAutores());
            System.out.println("Ano: " + livro.getAno());
            System.out.println("Código: " + livro.getCodigo());
            System.out.println("Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void consultarLivroPorAutor() {
        System.out.println("=== CONSULTAR LIVRO POR AUTOR ===");
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        List<Livro> livrosDoAutor = biblioteca.consultarLivroPorAutor(autor);
        if (!livrosDoAutor.isEmpty()) {
            System.out.println("Livros encontrados para o autor: " + livrosDoAutor.size());
            for (Livro livro : livrosDoAutor) {
                System.out.println("Livro: " + livro.getTitulo());
            }
        } else {
            System.out.println("Nenhum livro encontrado para este autor.");
        }
    }

    private static void cadastrarUsuario() {
        System.out.println("=== CADASTRAR USUÁRIO ===");
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();

        biblioteca.cadastrarUsuario(nome, cpf);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    private static void consultarUsuarioPorNome() {
        System.out.println("=== CONSULTAR USUÁRIO POR NOME ===");
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        Usuario usuario = biblioteca.consultarUsuarioPorNome(nome);
        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
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
    }

    private static void consultarUsuarioPorCPF() {
        System.out.println("=== CONSULTAR USUÁRIO POR CPF ===");
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();

        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
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
    }

    private static void cadastrarEmprestimo() {
        System.out.println("=== CADASTRAR EMPRÉSTIMO ===");
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();
        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.consultarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        biblioteca.cadastrarEmprestimo(usuario, livro);
    }

    private static void finalizarEmprestimo() {
        System.out.println("=== FINALIZAR EMPRÉSTIMO ===");
        System.out.print("Digite o CPF do usuário: ");
        String cpf = scanner.nextLine();
        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.consultarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        biblioteca.finalizarEmprestimo(usuario, livro);
    }
}