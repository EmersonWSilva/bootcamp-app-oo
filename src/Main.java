import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso();
    Curso curso2 = new Curso();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descricao curso java!");
    curso1.setCargaHoraria(8);

    curso2.setTitulo("Curso Ruby");
    curso2.setDescricao("descricao curso Ruby!");
    curso2.setCargaHoraria(14);

    // Conteudo conteudo = new Curso();
    // Conteudo conteudo1 = new Mentoria();

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de JAVA");
    mentoria.setDescricao("Descricao de Mentoria em JAVA");
    mentoria.setData(LocalDate.now());

    // System.out.println(curso1);
    // System.out.println(curso2);
    // System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    System.out.println("--------------------------------------------");

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos de Camila: " + devCamila.getConteudosInscritos());
    devCamila.progredir();
    devCamila.progredir();
    devCamila.progredir();
    System.out.println("--------------------------------------------");
    System.out.println("Conteudos Inscritos de Camila: " + devCamila.getConteudosInscritos());
    System.out.println("Conteudos Concluidos de Camila: " + devCamila.getConteudosConcluidos());
    System.out.println("XP: " + devCamila.calcularTotalXP());

    System.out.println("--------------------------------------------");

    Dev devEmr = new Dev();
    devEmr.setNome("Emerson");
    devEmr.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos de Emerson: " + devEmr.getConteudosInscritos());
    devEmr.progredir();
    System.out.println("--------------------------------------------");
    System.out.println("Conteudos Inscritos de Emerson: " + devEmr.getConteudosInscritos());
    System.out.println("Conteudos Concluidos de Emerson: " + devEmr.getConteudosConcluidos());
    System.out.println("XP: " + devEmr.calcularTotalXP());
    System.out.println("--------------------------------------------");



  }
}
