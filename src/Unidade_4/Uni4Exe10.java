package Unidade_4;

import java.util.Scanner;

public class Uni4Exe10 {
    Scanner sc = new Scanner(System.in);
    private String nome1, nome2, nome3, result;
    private int idade1, idade2, idade3;

    public Uni4Exe10(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Insira o nome: ");
        nome1 = sc.next();
        System.out.print("Insira a idade: ");
        idade1 = sc.nextInt();
        System.out.print("Insira o nome: ");
        nome2 = sc.next();
        System.out.print("Insira a idade: ");
        idade2 = sc.nextInt();
        System.out.print("Insira o nome: ");
        nome3 = sc.next();
        System.out.print("Insira a idade: ");
        idade3 = sc.nextInt();
    }
    private void logica(){
        if (idade1 > idade2 || idade1 > idade3) {
            result = nome2;
            if (idade2 > idade3 || idade2 > idade3) {
                result = nome3;
            }else{
                result = nome2;
            }
        }else{
            result = nome1;
        }
    }
    private void saida(){
        System.out.printf("O %s é o caçula.", result);
    }
    public static void main(String[] args) {
        new Uni4Exe10();
    }
}
/*
TESTE 1

Insira o nome: Marquinhos   
Insira a idade: 15
Insira o nome: Zezinho
Insira a idade: 11
Insira o nome: Luluzinha
Insira a idade: 18
O Zezinho é o caçula.
TESTE 2

Insira o nome: Marquinhos
Insira a idade: 11
Insira o nome: Zezinho 
Insira a idade: 15
Insira o nome: Luluzinha
Insira a idade: 18
O Marquinhos é o caçula.
TESTE 3

Insira o nome: Marquinhos
Insira a idade: 18
Insira o nome: Zezinho
Insira a idade: 15
Insira o nome: Luluzinha
Insira a idade: 11
O Luluzinha é o caçula.
*/