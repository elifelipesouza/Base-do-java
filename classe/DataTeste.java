package base.classe;

public class DataTeste {
    
    public static void main(String[] args) {
        Data d1 = new Data();

        d1.dia = 05;
        d1.mes = 11;
        d1.ano = 1996;

        System.out.println(d1.ObterDataFormatada());
    }
}
