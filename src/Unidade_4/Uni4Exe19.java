package Unidade_4;

import java.util.Scanner;

public class Uni4Exe19 {
    Scanner sc = new Scanner(System.in);
    private float x,y;
    private String a;

    public Uni4Exe19(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("X =");
        x = sc.nextFloat();
        System.out.print("Y =");
        y = sc.nextFloat();
    }
    private void logica(){
        if(x == 0 && y == 0){
            a = "0";
        }else if(x > 0 && y > 0){
            a = "1";
        }else if(x > 0 && y < 0){
            a = "2";
        }else if(x < 0 && y < 0){
            a = "3";
        }else if(x < 0 && y > 0){
            a = "4";
        }
    }
    private void saida(){
        System.out.println("Quadrante "+a);
    }
    public static void main(String[] args) {
        new Uni4Exe19();
    }
}
/*
TESTE 1

X =0
Y =0
Quadrante 0
TESTE 2

X =5
Y =10
Quadrante 1
TESTE 3

X =5
Y =-10
Quadrante 2
TESTE 4

X =-5
Y =-10
Quadrante 3
TESTE 5

X =-5
Y =10
Quadrante 4
 */