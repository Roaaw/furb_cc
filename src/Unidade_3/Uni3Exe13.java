package Unidade_3;

import java.util.Scanner;

public class Uni3Exe13 {
    private final float valorAzuleijo = 12.50f;
    private float altura;
    private float largura;

    public Uni3Exe13(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }

    public float calcMetros(float altura, float largura){
        return (altura * largura);
    }
    public float valorAzuleijo(float altura, float largura){
        return calcMetros(altura, largura) * (valorAzuleijo * 9);
    }

    public static void main(String[] args) {
        Uni3Exe13 classExec = new Uni3Exe13(0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a altuda da parede: ");
        float altura = sc.nextFloat();
        System.out.print("Insira o comprimento da parede: ");
        float largura = sc.nextFloat();
        float result = classExec.valorAzuleijo(altura,largura);
        System.out.printf("O valor final é: %.2f%n", result);
        sc.close();
    }

}
/*
TESTE 1
Insira a altuda da parede: 2
Insira o comprimento da parede: 6
O valor final é: 1350,00

TESTE 2
Insira a altuda da parede: 1,8
Insira o comprimento da parede: 2,6
O valor final é: 526,50

TESTE 3
Insira a altuda da parede: 4,5
Insira o comprimento da parede: 10
O valor final é: 5062,50

*/