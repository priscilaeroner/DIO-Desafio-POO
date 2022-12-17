import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprender os conceitos da linguagem de programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprender os conceitos da linguagem de programação JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria que abordará muitos assuntos interessantes da linguagem de programação Java e sua importância na área de TI");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developers");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPriscila = new Dev();
        devPriscila.setNome("Priscila");
        devPriscila.inscreverBootcamp(bootcamp);
        System.out.println("\n Conteúdos Inscritos Priscila:" + devPriscila.getConteudosInscritos());
        devPriscila.progredir();
        devPriscila.progredir();

        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        //System.out.println("Conteúdos Inscritos Priscila:" + devPriscila.getConteudosInscritos());
        System.out.println("\n Conteúdos Concluídos Priscila:" + devPriscila.getConteudosConcluidos());
        System.out.println("XP:" + devPriscila.calcularTotalXp());

        System.out.println("-------");

        Dev devRoner = new Dev();
        devRoner.setNome("Roner");
        devRoner.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Roner:" + devRoner.getConteudosInscritos());
        devRoner.progredir();
        devRoner.progredir();
        devRoner.progredir();

        //System.out.println("Conteúdos Inscritos de Roner:" + devRoner.getConteudosInscritos());
        System.out.println("\n Conteúdos Concluídos de Roner:" + devRoner.getConteudosConcluidos());
        System.out.println("XP:" + devRoner.calcularTotalXp());

    }

}
