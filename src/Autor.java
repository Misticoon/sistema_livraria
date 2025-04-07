import java.time.LocalDate;

public class Autor {
    private int id;
    private static int contadorId = 1;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome, LocalDate dataNascimento) {
        this.id = contadorId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
