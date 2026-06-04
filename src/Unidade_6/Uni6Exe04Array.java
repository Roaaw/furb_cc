package Unidade_6;

import java.util.Scanner;

public class Uni6Exe04Array {
    private Scanner sc = new Scanner(System.in);
    private int[][] numeros = new int[3][10];

    public Uni6Exe04Array(){
        lerNumeros();
        calcular();
        imprimir();
    }
    private void lerNumeros(){
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um do primeiro vetor numero: ");
            numeros[0][i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um do segundo vetor numero: ");
            numeros[1][i] = sc.nextInt();
        }
    }
    private void calcular(){
        for(int i = 0; i < 10; i++){
            numeros[2][i] = numeros[0][i] + numeros[1][i];
        }
    }
    private void imprimir(){
        for(int i = 0; i < 10; i++){
            System.out.println("Soma do vetor1: "+numeros[0][i]+" com o vetor2: "+numeros[1][i]+" = "+numeros[2][i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe04Array();
    }
}
