import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("---------- Menu ----------\n1. Adicionar Livro\n2. Listar Livros" +
                    "\n3. Realizar Emprestimo\n4. Sair\n--------------------------\n\nDigite uma opção: ");
            int entrada = sc.nextInt();
            sc.nextLine();

            try {
                switch (entrada) {
                    case 1:
                        System.out.println("Digite o nome do livro: ");
                        String tituloLivro = sc.nextLine();
                        System.out.println("Digite o nome do autor: ");
                        String nomeAutor = sc.nextLine();
                        System.out.println("Digite a data de nascimento do autor (dd/mm/aaaa): ");
                        String dataNacimentoStr = sc.nextLine();
                        LocalDate dataNascimento = LocalDate.parse(dataNacimentoStr, formatter);
                        Autor autor = new Autor(nomeAutor, dataNascimento);
                        Livro livro = new Livro(tituloLivro, autor);
                        biblioteca.adicionar_livro(livro, autor);
                        System.out.printf("\n>>> Livro \"%s\" adicionado\n\n", tituloLivro);
                        break;
                    case 2:
                        biblioteca.listar_livros();
                        break;
                    case 3:
                        System.out.println("Digite o nome do usuário que fará o empréstimo:");
                        String nomeUsuario = sc.nextLine();
                        System.out.println("Digite o nome do livro: ");
                        String tituloParaEmprestimo = sc.nextLine();
                        biblioteca.realizar_empréstimo(tituloParaEmprestimo, nomeUsuario);
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.err.println("\nErro: formato inválido!\n");
            }
        }
    }
}
