import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Curso curso = new Curso("Descrição","Curso Java",10);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Bootcamp", "Aprender Java");

        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Miguel");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Miguel");
        System.out.println(dev.getConteudosConcluidos());

        Dev other = new Dev();
        other.setNome("João");


    }
}