import java.time.LocalDate;

import dominio.Curso;
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

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de JAVA");
    mentoria.setDescricao("Descricao de Mentoria em JAVA");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);

    System.out.println(mentoria);
  }
}
