package Unidade_4;

import java.util.Scanner;

public class Uni4Exe13 {
    Scanner sc = new Scanner(System.in);
    private int carta1, carta2, carta3;
    private int qtCartasBoas = 0;
    private String result;

    public Uni4Exe13(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Carta 1: ");
        carta1 = sc.nextInt();
        System.out.print("Carta 2: ");
        carta2 = sc.nextInt();
        System.out.print("Carta 3: ");
        carta3 = sc.nextInt();
        if (carta1 == 0 || carta1 > 13 || carta2 == 0 || carta2 > 13 || carta3 == 0 || carta3 > 13){
            System.out.print("Insira uma carta valida. (1 a 13)");
        }
    }
    private void logica(){
        if(carta1 == 1 || carta1 == 2 || carta1 == 3){
            qtCartasBoas++;
        }
        if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            qtCartasBoas++;
        }
        if(carta3 == 1 || carta3 == 2 || carta3 == 3){
            qtCartasBoas++;
        }
        if(qtCartasBoas == 1){
            result = "TRUCO";
        }else if(qtCartasBoas == 2){
            result = "SEIS";
        }else if(qtCartasBoas == 3){
            result = "NOVE";
        }else{
            result = "-";
        }
    }
    private void saida(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Uni4Exe13();
    }
}
/*
TESTE 1

Carta 1: 1
Carta 2: 4
Carta 3: 7
TRUCO
TESTE 2

Carta 1: 2
Carta 2: 3
Carta 3: 11
SEIS
TESTE 3

Carta 1: 1
Carta 2: 2
Carta 3: 3
NOVE
TESTE 4

Carta 1: 11
Carta 2: 12
Carta 3: 13
-
TESTE 5

Carta 1: 0
Carta 2: 1
Carta 3: 3
Insira uma carta valida. (1 a 13)
*/