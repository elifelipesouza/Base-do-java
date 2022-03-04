package base.classe;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String ObterDataFormatada() {
        
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
