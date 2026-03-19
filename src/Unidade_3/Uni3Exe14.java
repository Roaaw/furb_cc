package Unidade_3;

import java.util.Scanner;

public class Uni3Exe14 {
    private float distancia,tempo;
    private final float autonomia = 0.012f;

    public Uni3Exe14(float distancia, float tempo){
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float calcTempo(){
        return (this.distancia / this.tempo);
    }
    public float calcAutonomia(){
        return ((this.distancia / autonomia) / 1000);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distancia percorrida: ");
        float distancia = sc.nextFloat();
        System.out.print("Digite o tempo de viagem: ");
        float tempo = sc.nextFloat();
        sc.close();
        Uni3Exe14 classExec = new Uni3Exe14(distancia, tempo);
        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade dde combustível usado foi de %.2f litros.", classExec.calcTempo(), classExec.calcAutonomia());
    }
}
/*
TESTE 1
Digite a distancia percorrida: 240
Digite o tempo de viagem: 4
A velocidade média foi de 60,00 km/h e a quantidade dde combustível usado foi de 20,00 litros.

TESTE 2
Digite a distancia percorrida: 150
Digite o tempo de viagem: 2
A velocidade média foi de 75,00 km/h e a quantidade dde combustível usado foi de 12,50 litros.

TESTE 3
Digite a distancia percorrida: 95
Digite o tempo de viagem: 1
A velocidade média foi de 95,00 km/h e a quantidade dde combustível usado foi de 7,92 litros.
*/
