package Unidade_3;

import java.util.Scanner;

public class Uni3Exe11 {
    private float tempCelsius;
    
    public Uni3Exe11(float tempCelsius){
        this.tempCelsius = tempCelsius;
    }

    public float convert(){
        return (1.8f * this.tempCelsius) + 32f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura em °C: ");
        float tempCelsius = sc.nextFloat();
        Uni3Exe11 classExec = new Uni3Exe11(tempCelsius);
        System.out.printf("°F %.2f%n", classExec.convert());
        sc.close();
    }
}
/*
TESTE 1
Insira a temperatura em °C: 36
°F 96,80

TESTE 2
Insira a temperatura em °C: 2
°F 35,60

TESTE 3
Insira a temperatura em °C: 24
°F 75,20

*/