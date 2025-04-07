import java.time.LocalDate;

public class Livro {
    private int id;
    private static int contadorId = 1;
    private String titulo;
    private Autor autor;
    private Boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualização;

    public Livro(String titulo, Autor autor) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now();;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
