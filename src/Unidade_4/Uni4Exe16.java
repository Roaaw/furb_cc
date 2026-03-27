package Unidade_4;

import java.util.Scanner;

public class Uni4Exe16 {
    Scanner sc = new Scanner(System.in);
    private int idadeH1, idadeH2, idadeM1, idadeM2, soma, produto;

    public Uni4Exe16(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Informe a idade dos dois homens: ");
        idadeH1 = sc.nextInt();
        idadeH2 = sc.nextInt();
        System.out.print("Informe a idade das duis mulheres: ");
        idadeM1 = sc.nextInt();
        idadeM2 = sc.nextInt();

    }
    private void logica(){
        if(idadeH1 > idadeH2 && idadeM1 > idadeM2){
            soma = idadeH1 + idadeM2;
            produto = idadeH2 * idadeM1;
        }
    }
    private void saida(){
        System.out.printf("Soma:%s Produto:%s",soma, produto);
    }
    public static void main(String[] args) {
        new Uni4Exe16();
    }
}
/*
TESTE 1
Informe a idade dos dois homens: 30
25
Informe a idade das duis mulheres: 30
20
Soma:50 Produto:750

TESTE 2

Informe a idade dos dois homens: 40
28
Informe a idade das duis mulheres: 25
22
Soma:62 Produto:700
*/