package base.classe;

public class valorVsReferencia {
    public static void main(String[] args) {       
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 1970);
        Data d2 = d1; // atribuição por referencia (objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.ObterDataFormatada());
        System.out.println(d2.ObterDataFormatada());

    }
}
