package Unidade_3;

import java.util.Scanner;

public class Uni3Exe04 {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;

    public Uni3Exe04(float nota1, float nota2, float nota3, float media){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }
    public float mediaPonderada(float nota1,float nota2,float nota3,float media){
        return media = (nota1 * 0.5f) + (nota2 * 0.3f) + (nota3 * 0.2f);
    }
    public static void main(String[] args) {
        Uni3Exe04 calculo = new Uni3Exe04(0, 0, 0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float nota3 = sc.nextFloat();
        float resultado = calculo.mediaPonderada(nota1,nota2,nota3,0);
        System.out.printf("Média Ponderada: %.2f%n",resultado);
        sc.close();
    }
}
/*
TESTE 1
Insira a primeira nota: 9
Insira a segunda nota: 6
Insira a terceira nota: 8
Média Ponderada: 7,90

TESTE 2
Insira a primeira nota: 4
Insira a segunda nota: 8
Insira a terceira nota: 6
Média Ponderada: 5,60

TESTE 3
Insira a primeira nota: 9,5
Insira a segunda nota: 7,65
Insira a terceira nota: 4,32
Média Ponderada: 7,91

*/