package erros;

public class Basico {
    public static void main(String[] args) {

        try{
            System.out.println(7 / 0);
        }catch (Exception excecao){
            System.out.println("Ocorreu um erro no momento"
            + "de imprimir o nome do usuario");
        }

        System.out.println("fim :) ");

        
    }
}
