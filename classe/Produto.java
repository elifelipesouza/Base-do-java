package base.classe;

public class Produto {
    String nome;
    double preco;
    final static double desconto = 0.2;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
