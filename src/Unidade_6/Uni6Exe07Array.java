package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe07Array {
    private Scanner sc = new Scanner(System.in);
    private int tamanho = 0; // <= 20
    // private int[] numero;
    private ArrayList<Integer> numero = new ArrayList<>();
    private int j = 0;
    private boolean repetido = false;
    // private int bolha;

    public Uni6Exe07Array(){
        tamVetor();
        entradaVetor();
        imprimir();
    }

    private void tamVetor(){
        do {
            if(tamanho > 20){
                System.out.println("Digite um valor menor que 20.");
            }
            System.out.print("Tamanho vetor: ");
            tamanho = sc.nextInt();
            // numero = new int[tamanho];
        } while (tamanho > 20);
    }
    private void entradaVetor(){
        for (int i = 0; i < tamanho; i++){
            do {    
                System.out.println("Digite um numero inteiro");
                numero.add(sc.nextInt());
                if (i > 0){
                    j = i;
                    checarValor();
                }
            } while (repetido);
        }
    }
    private void checarValor(){
        for (int i = 0; i < j; i++){
            if(numero.get(i).equals(numero.get(j))){
                repetido = true;
                break;
            }else{
                repetido = false;
            }
        }
    }
    private void imprimir(){
        System.out.print("Vetor origem: ");
        for (int item : numero) {
            System.out.print("["+item+"]");
        }
        System.out.print("\nVetor ordenado: ");
        numero.sort(null);
        for (int item : numero) {
            System.out.print("["+item+"]");
        }
    }
    public static void main(String[] args) {
        new Uni6Exe07Array();
    }
}
