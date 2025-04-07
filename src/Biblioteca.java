import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionar_livro(Livro livro, Autor autor) {
        livros.add(livro);
        autores.add(autor);
    }

    public void listar_livros() {
        if (livros.size() != 0) {
            System.out.println("\n┌ Lista de livros ┐");
            for (Livro livro : livros) {
                if (livro.getDisponivel() == true) {
                    System.out.printf("%s - Disponível\n", livro.getTitulo());
                } else {
                    System.out.printf("%s - Indisponível\n", livro.getTitulo());
                }
            }
            System.out.println("└─────────────────┘\n");
        } else {
            System.out.println("\n>>> Nenhum livro disponível para empréstimo!\n");
        }
    }

    public void realizar_empréstimo(String titulo, String nomeUsuario) {
        if (livros.size() != 0) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    if (livro.getDisponivel().equals(true)) {
                        livro.setDisponivel(false);
                        Emprestimo emprestimo = new Emprestimo(livro, nomeUsuario);
                        emprestimos.add(emprestimo);
                        System.out.println("\n>>> Livro emprestado com sucesso!\n");
                    } else {
                        System.out.println("\n>>> Livro já está emprestado.\n");
                    }
                }
            }
        } else System.out.println("\n>>> Livro não encontrado na biblioteca.\n");
    }
}