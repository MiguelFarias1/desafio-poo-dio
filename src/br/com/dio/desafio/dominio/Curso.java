package br.com.dio.desafio.dominio;

public class Curso extends Conteudo
{
    private final Integer cargaHoraria;

    public Curso(String titulo, String descricao, Integer cargaHoraria)
    {
        super(titulo,descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    @Override
    public double calcularXp()
    {
        return XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString()
    {
        var stringBuilder = new StringBuilder();

        stringBuilder.append("\nTítulo do curso : " + getTitulo());
        stringBuilder.append("\nDescrição do curso: " + getDescricao());
        stringBuilder.append("\nCarga horária do curso: " + getCargaHoraria());

        return stringBuilder.toString();
    }

}
