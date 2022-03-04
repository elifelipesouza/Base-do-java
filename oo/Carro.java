package oo;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        if(motor.fatorInjecao1 < 2.6){
            motor.fatorInjecao1 += 0.4;
        }
    }

    void frear(){
        if(motor.fatorInjecao1 > 0.4){
            motor.fatorInjecao1 -= 0.4;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
