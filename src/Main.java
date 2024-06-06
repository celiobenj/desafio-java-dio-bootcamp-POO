import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("Curso POO");
        cursoPOO.setDescricao("Curso de POO");
        cursoPOO.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Descrição da mentoria 1");
        mentoria.setData(LocalDate.of(2024, 05, 25));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPOO);
        bootcamp.getConteudos().add(mentoria);

        
        Dev dev1 = new Dev();
        dev1.setNome("Célio");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Informações para " + dev1.getNome());
        System.out.println("Conteúdos incritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println("Informações para " + dev2.getNome());
        System.out.println("Conteúdos incritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }
}
