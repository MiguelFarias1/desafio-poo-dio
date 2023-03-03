package br.com.dio.desafio.dominio;

public abstract class Conteudo
{
    protected final static double XP_PADRAO = 10D;

    private final String titulo;
    private final String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularXp();

    @Override
    public int hashCode()
    {
        return titulo.hashCode() + descricao.hashCode();
    }


}
