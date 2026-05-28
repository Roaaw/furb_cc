package Unidade_6;

import java.util.Scanner;

public class Uni6Exe08 {
    private Scanner sc = new Scanner(System.in);
    private int tamanho; //<= 20
    private double[] valor;
    private int contador = 1;

    public Uni6Exe08(){
        tamVetor();
        entradaVetor();
        checarVetor();
    }
    private void tamVetor(){
        do {
            if(tamanho > 20){
                System.out.println("Digite um valor menor que 20.");
            }
            System.out.print("Tamanho Vetor: ");
            tamanho = sc.nextInt();
            valor = new double[tamanho];
        } while (tamanho > 20);
    }
    private void entradaVetor(){
        for (int i = 0; i < tamanho; i++){
            System.out.print("Insira os valores: ");
            valor[i] = sc.nextDouble();
        }
    }
    private void checarVetor(){
        for (int i = 0; i < tamanho; i++){
            if(i+1 >= tamanho){
                break;
            }else{
                for (int j = i+1; j < tamanho; j++){
                    if(valor[i] == valor[j]){
                        contador ++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Uni6Exe08 - implementar solução");
        new Uni6Exe08();
    }
}
