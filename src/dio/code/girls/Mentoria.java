package dio.code.girls;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
