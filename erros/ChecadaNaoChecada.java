package erros;

public class ChecadaNaoChecada {
    public static void main(String[] args) {
        geraErro1();
        geraErro2();

        System.out.println("Fim");
    }

    static void geraErro1() {
        throw new RuntimeException("Ocoreu um erro bem legal #01");
    }

    static void geraErro2() {
       throw new RuntimeException("Ocoreu um erro bem legal #02");
    }
}
