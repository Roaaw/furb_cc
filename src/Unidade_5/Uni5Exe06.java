package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe06 {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    private float a;
    private float soma = 0;
    private float result = 0;

    public Uni5Exe06(){
        logic();
    }
    private void input(){
        System.out.print("Informe a altura: ");
        a = sc.nextFloat();
    }
    private void logic(){
        for(int i=1; i<=20; i++){
            input();
            soma += a;
            result = soma/i;
        }
        output();
    }
    private void output(){
        System.out.println("A média das alturas é: "+df.format(result));
    }
    public static void main(String[] args) {
        new Uni5Exe06();
    }
}
