import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java para backend");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("JavaScript front");
        curso2.setCargaHoraria(3);




        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("curso de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Fujan");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("DEV1: "+ dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-=-");
        System.out.println("DEV1: "+ dev1.getConteudoInscritos());
        System.out.println("DEV1: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("=-=-=-=-=-=--=-=-=-=--=-=");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("DEV2: "+ dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("-=-");
        System.out.println("DEV2: "+ dev2.getConteudoInscritos());
        System.out.println("DEV2: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
    }
}
