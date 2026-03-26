package Unidade_4;

import java.util.Scanner;

public class Uni4Exe05 {
    Scanner sc = new Scanner(System.in);
    private String cor, isAzul; 

    public Uni4Exe05(){
        entrada();
        saida();
    }
    private void entrada(){
        System.out.println("A cor é azul?");
        cor = sc.next();
        sc.close();
    }
    private void saida(){
        if(cor.equalsIgnoreCase("Sim")){
            isAzul = "Sim";
        }else{
            isAzul = "Não";
        }
        System.out.println(isAzul);
    }
    public static void main(String[] args) {
        new Uni4Exe05();
    }
}

/*
TESTE
A cor é azul?
sim
Sim

A cor é azul?
nao
Não
*/
