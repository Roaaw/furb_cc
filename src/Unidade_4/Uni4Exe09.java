package Unidade_4;

import java.util.Scanner;

public class Uni4Exe09 {
    Scanner sc = new Scanner(System.in);
    private int numero1, numero2, result;

    public Uni4Exe09(){
        entrada();
        logica();
    }
    private void entrada(){
        System.out.print("Insira o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.print("Insira o segundo numero: ");
        numero2 = sc.nextInt();
    }
    private void logica(){
        result = numero1 % numero2;
        if (result == 0){
            System.out.print("Os valores são múltiplos.");
        }else{
            System.out.print("Os valores não são múltiplos.");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe09();
    }
}
/*
TESTE 1 

Insira o primeiro numero: 6
Insira o segundo numero: 3
Os valores são múltiplos.
TESTE 2

Insira o primeiro numero: 9
Insira o segundo numero: 4
Os valores não são múltiplos.
TESTE 3

Insira o primeiro numero: 10
Insira o segundo numero: 5
Os valores são múltiplos.
*/
