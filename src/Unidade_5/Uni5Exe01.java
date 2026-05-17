package Unidade_5;

import java.util.Scanner;

public class Uni5Exe01 {
    Scanner sc = new Scanner(System.in);
    int input;
    private String output;
    public Uni5Exe01(){
        logica();
    }
    private void entrada(){
        System.out.print("Informe um número: ");
        input = sc.nextInt();
    }
    private void logica(){
        for(int i = 0; i<20; i++){
            entrada();
            if(i % 2 == 0){
                output = "Par";
                saida();
            }else{
                output = "Ímpar";
                saida();
            }
        }
    }
    private void saida(){
        System.out.println(output);
    }
    public static void main(String[] args) {
        new Uni5Exe01();
    }
}
