package Unidade_6;

import java.util.Scanner;

public class Uni6Exe01 {
    private Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    public Uni6Exe01(){
        logica();
    }
    private void input(int i){
        System.out.printf("Digite o numero %s:",i+1);
        numeros[i] = sc.nextInt();
    }
    private void logica(){
        for(int i = 0; i <= 9; i++){
            input(i);
        }
        output();
    }
    private void output(){
        System.out.println("Números em ordem inversa a digitada:");
        for(int i = 9; i >= 0; i--){
            if(i == 9){
                System.out.print(numeros[i]);
            }else{
                System.out.print(" , "+numeros[i]);
            }
        }
    }
    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
