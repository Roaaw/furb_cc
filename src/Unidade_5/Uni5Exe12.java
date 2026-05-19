package Unidade_5;

import java.util.Scanner;

public class Uni5Exe12 {
    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    private int t = 0;
    private int k = 0;
    private String temp = "";
    public Uni5Exe12(){
        logic();
    }
    private void input(){
        System.out.print("Digite um número inteiro positivo:");
        n = sc.nextInt();
    }
    private void logic(){
        input();
        if(n > 0){
            for(int i=0; i<=n; i++){
                t++;
                for(int j=1; j<=t; j++){
                    k++;
                    if(k < 10){
                        temp += k+"  ";
                    }else{
                        temp += k+" ";
                    }
                }
                temp += "\n";
            }
        }else{
            temp = "Número informado não é positivo ou intiero.";
        }
        output();
    }
    private void output(){
        System.out.println(temp);
    }
    public static void main(String[] args) {
        new Uni5Exe12();
    }
}