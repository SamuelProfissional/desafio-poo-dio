import com.com.dio.desafio.dominio.Bootcamp;
import com.com.dio.desafio.dominio.Curso;
import com.com.dio.desafio.dominio.Dev;
import com.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();

    curso2.setTitulo("Curso Js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descricao mentoria em java");
    mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcap(bootcamp);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());

        System.out.println("------------------");

        //Control + D copia e cola

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcap(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Xp: " + devJoao.calcularTotalXp());


    }
}