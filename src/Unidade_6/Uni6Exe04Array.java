package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe04Array {
    private Scanner sc = new Scanner(System.in);
    // private int[][] numeros = new int[3][10];
    // private ArrayList<ArrayList<Integer>> numeros = new ArrayList<>();
    private ArrayList<Integer> primNumero = new ArrayList<>();
    private ArrayList<Integer> segNumero = new ArrayList<>();
    private ArrayList<Integer> calculo = new ArrayList<>();

    public Uni6Exe04Array(){
        lerNumeros();
        calcular();
        imprimir();
    }
    private void lerNumeros(){
        // numeros.add(primNumero);
        // numeros.add(segNumero);
        // numeros.add(calculo);
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um do primeiro vetor numero: ");
            // numeros[0][i] = sc.nextInt();
            primNumero.add(sc.nextInt());
            // numeros.get(0).add(sc.nextInt());
        }
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um do segundo vetor numero: ");
            // numeros[1][i] = sc.nextInt();
            segNumero.add(sc.nextInt());
            // numeros.get(1).add(sc.nextInt());
        }
    }
    private void calcular(){
        for(int i = 0; i < 10; i++){
            // numeros[2][i] = numeros[0][i] + numeros[1][i];
            calculo.add(primNumero.get(i)+segNumero.get(i));
            // numeros.get(2).add(numeros.get(0).get(i)+numeros.get(1).get(i));
        }
    }
    private void imprimir(){
        for(int i = 0; i < 10; i++){
            System.out.println("Soma do vetor1: "+primNumero.get(i)+" com o vetor2: "+segNumero.get(i)+" = "+calculo.get(i));
            // System.out.println("Soma do vetor1: "+numeros.get(0).get(i)+" com o vetor2: "+numeros.get(1).get(i)+" = "+numeros.get(2).get(i));
        }
    }
    public static void main(String[] args) {
        new Uni6Exe04Array();
    }
}
