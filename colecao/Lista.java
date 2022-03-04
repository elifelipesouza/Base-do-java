package colecao;

import java.util.ArrayList;

public class Lista{
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("André");

        lista.add(u1);
        lista.add(new Usuario("Eli Felipe"));

        for (Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}