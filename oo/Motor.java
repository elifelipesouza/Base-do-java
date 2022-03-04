package oo;

public class Motor {

    boolean ligado = false;
    double fatorInjecao1 = 1;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao1 * 3000);
        }
    }
}
