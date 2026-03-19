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

    public float calcMetros(){
        return (this.altura * this.largura);
    }
    public float valorAzuleijo(){
        return calcMetros() * (valorAzuleijo * 9);
    }

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a altuda da parede: ");
        float altura = sc.nextFloat();
        System.out.print("Insira o comprimento da parede: ");
        float largura = sc.nextFloat();
        Uni3Exe13 classExec = new Uni3Exe13(altura,largura);
        System.out.printf("O valor final é: %.2f%n", classExec.valorAzuleijo());
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