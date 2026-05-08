package Unidade_5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        int n = 0;
        int t = 0;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo:");
        n = sc.nextInt();
        if(n > 0){
            for(int i=0; i<=n; i++){
                t++;
                for(int j=1; j<=t; j++){
                    k++;
                    if(k < 10){
                        System.out.print(k+"  ");
                    }else{
                        System.out.print(k+" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Número informado não é positivo ou intiero.");
        }
        sc.close();
    }
}