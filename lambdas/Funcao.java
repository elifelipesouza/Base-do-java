package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = 
        numero -> numero % 2 == 0 ? "par" : "Impar";

        Function<String, String> oResultadoE =
        valor -> "O resultado é: " + valor;

        String resultadoFinal =
        parOuImpar.andThen(oResultadoE).apply(23);

        System.out.println(resultadoFinal);

    }
}
