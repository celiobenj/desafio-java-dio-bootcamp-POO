import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCargaHoraria(8);

        System.out.println(cursoJava);


        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Curso de Python");
        cursoPython.setCargaHoraria(4);

        System.out.println(cursoPython);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Descrição da mentoria 1");
        mentoria.setData(LocalDate.of(2024, 05, 25));

        System.out.println(mentoria);
    }
}
