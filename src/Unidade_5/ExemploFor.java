package Unidade_5;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        // for(int i=0; i<=100; i+=2){
        //     System.out.println(i);
        // }
        // for(char x='a'; x<='z'; x++){
        //     System.out.println(x);
        // }
        // for(double i=0; i<=1; i+=0.001){
        //     System.out.printf("%.3f\n",i);
        // }
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=2; i++){
            String name = sc.next();
            int idade = sc.nextInt();
            System.out.println("Nome "+name+"\nIdade "+idade);
        }
    }
}
