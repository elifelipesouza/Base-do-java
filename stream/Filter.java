package stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Eli", 7.8);
        Aluno a2 = new Aluno("MIlena", 7.8);
        Aluno a3 = new Aluno("Elizu", 7.8);
        Aluno a4 = new Aluno("Sara", 7.8);
        Aluno a5 = new Aluno("Lucas", 7.8);
        Aluno a6 = new Aluno("Elaine", 7.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        
        alunos.stream()
        .filter(a -> a.nota >= 7)
        .map(a -> "Parabens " + a.nome + " voce foi aprovado")
        .forEach(System.out::println);
    }
}
