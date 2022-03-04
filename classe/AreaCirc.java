package base.classe;

public class AreaCirc {
    double raio;
    final static  double PI = 3.1415;

    AreaCirc(double raio){
        this.raio = raio;
    }

    double area(){
        return PI * Math.pow(raio, 2 );
    }
}
