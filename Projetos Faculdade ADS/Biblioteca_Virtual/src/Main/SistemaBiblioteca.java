package Main;


import java.util.Scanner;
import Model.*; //Import de programas do pacote Model
import java.util.Arrays;
import java.util.List;

public class SistemaBiblioteca {
private static Scanner scanner = new Scanner(System.in);
    private static BancoDados biblioteca = new BancoDados();

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

            System.out.println("Obrigado Por visitar essa Biblioteca!!!");
        } while (opcao != 9);
    }

    private static void cadastrarLivro() {
        System.out.println("===== CADASTRAR LIVRO =====");
        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o(s) autor(es) do livro (separados por virgula): ");
        String autoresInput = scanner.nextLine();
        String[] autoresArray = autoresInput.split(",");
        List<String> autores = Arrays.asList(autoresArray);
        System.out.print("Digite o ano do livro: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o codigo do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        biblioteca.cadastrarLivro(titulo, autores, ano, codigo);
        System.out.println("Livro cadastrado com sucesso.");
    }

    private static void consultarLivroPorTitulo() {
        System.out.println("===== CONSULTAR LIVRO POR TITULO =====");
    System.out.print("Digite a palavra-chave: ");
    String palavraChave = scanner.nextLine();

    List<Livro> livrosEncontrados = biblioteca.consultarLivrosPorTitulo(palavraChave);
    if (!livrosEncontrados.isEmpty()) {
        System.out.println("Livros encontrados para a palavra-chave '" + palavraChave + "':");
        for (Livro livro : livrosEncontrados) {
            System.out.println("Livro: " + livro.getTitulo());
        }
    } else {
        System.out.println("Nenhum livro encontrado para esta palavra-chave.");
    }
}

    private static void consultarLivroPorAutor() {
        System.out.println("===== CONSULTAR LIVRO POR AUTOR =====");
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        List<Livro> livrosDoAutor = biblioteca.consultarLivrosPorPalavraChave(autor);
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
        System.out.println("===== CADASTRAR USUARIO =====");
        System.out.print("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do usuario: ");
        String cpf = scanner.nextLine();

        biblioteca.cadastrarUsuario(nome, cpf);
        System.out.println("Usuario cadastrado com sucesso.");
    }

    private static void consultarUsuarioPorNome() {
        System.out.println("===== CONSULTAR USUARIO POR NOME =====");
        System.out.print("Digite o nome do usuario: ");
        String nome = scanner.nextLine();

        Usuario usuario = biblioteca.consultarUsuarioPorNome(nome);
        if (usuario != null) {
            System.out.println("Usuario encontrado: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
            if (!livrosEmprestados.isEmpty()) {
                System.out.println("Livros emprestados: " + livrosEmprestados.size());
                for (Livro livro : livrosEmprestados) {
                    System.out.println("Livro: " + livro.getTitulo());
                }
            } else {
                System.out.println("Nenhum livro emprestado para este usuaio.");
            }
        } else {
            System.out.println("Usuario nao encontrado.");
        }
    }

    private static void consultarUsuarioPorCPF() {
        System.out.println("===== CONSULTAR USUARIO POR CPF =====");
        System.out.print("Digite o CPF do usuario: ");
        String cpf = scanner.nextLine();

        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario != null) {
            System.out.println("Usuario encontrado: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            List<Livro> livrosEmprestados = usuario.getLivrosEmprestados();
            if (!livrosEmprestados.isEmpty()) {
                System.out.println("Livros emprestados: " + livrosEmprestados.size());
                for (Livro livro : livrosEmprestados) {
                    System.out.println("Livro: " + livro.getTitulo());
                }
            } else {
                System.out.println("Nenhum livro emprestado para este usuario.");
            }
        } else {
            System.out.println("Usuario nao encontrado.");
        }
    }

private static void cadastrarEmprestimo() {
        System.out.println("===== CADASTRAR EMPRESTIMO =====");
        System.out.print("Digite o CPF do usuario: ");
        String cpf = scanner.nextLine();
        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario == null) {
            System.out.println("Usuário nao encontrado.");
            return;
        }

        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.consultarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }

        biblioteca.cadastrarEmprestimo(usuario, livro);
    }

    private static void finalizarEmprestimo() {
        System.out.println("===== FINALIZAR EMPRESTIMO =====");
        System.out.print("Digite o CPF do usuario: ");
        String cpf = scanner.nextLine();
        Usuario usuario = biblioteca.consultarUsuarioPorCpf(cpf);
        if (usuario == null) {
            System.out.println("Usuario nao encontrado.");
            return;
        }

        System.out.print("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        Livro livro = biblioteca.consultarLivroPorTitulo(titulo);
        if (livro == null) {
            System.out.println("Livro nao encontrado.");
            return;
        }

        biblioteca.finalizarEmprestimo(usuario, livro);
    }
}