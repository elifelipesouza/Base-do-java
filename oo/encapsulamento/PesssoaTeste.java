package oo.encapsulamento;

public class PesssoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(-8);
        p1.alterarIdade(20);

        System.out.println(p1.lerIdade());
    }
}
