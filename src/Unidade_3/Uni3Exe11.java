package Unidade_3;

import java.util.Scanner;

public class Uni3Exe11 {
    private float tempCelsius;
    private float tempFahrenheit;
    
    public Uni3Exe11(float tempCelsius, float tempFahrenheit){
        this.tempCelsius = tempCelsius;
        this.tempFahrenheit = tempFahrenheit;
    }

    public float convert(float tempCelsius, float tempFahrenheit){
        return (1.8f * tempCelsius) + 32f;
    }

    public static void main(String[] args) {
        Uni3Exe11 classExec = new Uni3Exe11(0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura em °C: ");
        float tempCelsius = sc.nextFloat();
        float result = classExec.convert(tempCelsius, 0);
        System.out.printf("°F %.2f%n", result);
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