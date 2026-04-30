package Unidade_5;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float soma = 0;
        float result = 0;
        for(int i=1; i<=20; i++){
            System.out.print("Informe a altura: ");
            a = sc.nextFloat();
            soma += a;
            result = soma/i;
        }
        System.out.println("A média das alturas é: "+result);
        sc.close();
    }
}
