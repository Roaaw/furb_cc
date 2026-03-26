package Unidade_4;

import java.util.Scanner;

public class Uni4Exe08 {
    Scanner sc = new Scanner(System.in);
    private char letra;

    public Uni4Exe08(){
        entrada();
        logica();
    }
    private void entrada(){
        System.out.print("Informe a letra: ");
        letra = sc.next().toUpperCase().charAt(0);
    }
    private void logica(){
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.print("É vogal.");
        } else {
            System.out.print("Não é Vogal");
        }

    }
    public static void main(String[] args) {
        new Uni4Exe08();
    }
}
/*
TESTE 1

Informe a letra: u
É vogal.
TESTE 2

Informe a letra: b
Não é Vogal
TESTE 3

Informe a letra: A
É vogal.
 */
