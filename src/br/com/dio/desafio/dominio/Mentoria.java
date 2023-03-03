package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo
{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo,descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 10D;
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nTítulo da mentoria: " + getTitulo());
        stringBuilder.append("\nDescrição da mentoria: " + getDescricao());
        stringBuilder.append("\nData da mentoria: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(getData()));

        return stringBuilder.toString();
    }
}
