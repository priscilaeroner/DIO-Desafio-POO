import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao Curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPriscila = new Dev();
        devPriscila.setNome("Priscila");
        devPriscila.inscreverBootcamp((bootcamp));
        System.out.println("Conteúdos Inscritos Priscila:" + devPriscila.getConteudosInscritos());
        devPriscila.progredir();
        System.out.println(("-"));
        System.out.println("Conteúdos Inscritos Priscila:" + devPriscila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Priscila:" + devPriscila.getConteudosConcluidos());

        System.out.println("-------");

        Dev devRoner = new Dev();
        devRoner.setNome("Roner");
        devRoner.inscreverBootcamp((bootcamp));
        System.out.println("Conteúdos Inscritos Roner:" + devRoner.getConteudosInscritos());
        devRoner.progredir();
        System.out.println(("-"));
        System.out.println("Conteúdos Inscritos Roner:" + devRoner.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Roner:" + devRoner.getConteudosConcluidos());
    }
}