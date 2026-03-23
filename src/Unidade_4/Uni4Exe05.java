package Unidade_4;

import java.util.Scanner;

public class Uni4Exe05 {
    private String cor; 

    public Uni4Exe05(String cor){
        this.cor = cor;
    }

    public String isAzul(){
        String isAzul;
        if(cor.equalsIgnoreCase("Sim")){
            isAzul = "Sim";
        }else{
            isAzul = "Não";
        }
        return isAzul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A cor é azul?");
        String cor = sc.next();
        sc.close();
        Uni4Exe05 classExec = new Uni4Exe05(cor);
        System.out.println(classExec.isAzul());
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
