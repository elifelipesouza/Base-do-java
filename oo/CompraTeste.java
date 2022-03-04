package oo;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "Eli Felipe";
        c1.adicionarItem(new Item("Canetaa", 1, 7.45));
        c1.adicionarItem(new Item("Borracha", 1, 3.45));
        c1.adicionarItem(new Item("Caderno", 1, 18.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
    }
}
