package base.classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
    
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double preceFinal1 = p1.precoComDesconto();
        double preceFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (preceFinal1 + preceFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f ", mediaCarrinho);

    }
}
