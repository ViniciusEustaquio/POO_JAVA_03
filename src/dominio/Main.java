package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Java");
        curso1.setDecricao("Curso de Java");
        curso1.setCargaHoraria(8);
        
        
        Mentoria mentoria1 = new Mentoria();
        
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDecricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        
        
        
        Bootcamp bootcamp = new Bootcamp();
        
        bootcamp.setNome("Java");
        bootcamp.setDescricao("BootCamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);
        
        
        
        Dev dev1 = new Dev();
        
        dev1.setNome("Vinicius");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " +  dev1.getConteudoInscritos());
       
       
        Dev dev2 = new Dev();
        
        dev1.setNome("Jose");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " +  dev2.getConteudoInscritos());
       
        
        
        
    }

}
