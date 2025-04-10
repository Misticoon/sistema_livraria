import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int contadorId = 1;
    private Livro livro;
    private String nomeUsuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean ativo;

    public Emprestimo(Livro livro, String nomeUsuario) {
        this.id = contadorId++;
        this.livro = livro;
        this.nomeUsuario = nomeUsuario;
        this.dataEmprestimo = LocalDate.now();
        this.ativo = true;
    }
}
