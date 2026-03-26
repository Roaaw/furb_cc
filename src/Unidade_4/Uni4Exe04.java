package Unidade_4;

import java.util.Scanner;

public class Uni4Exe04 {
    Scanner sc = new Scanner(System.in);
    private float numero, result;

    public Uni4Exe04(){
        entrada();
        saida();
    }
    private void entrada(){
        System.out.print("Escreva um numero maior que 0: ");
        numero = sc.nextFloat();
        sc.close();
    }
    private void saida(){
        result = temDecimal();
        if (result == 1) {
            System.out.println("Casas decimais foram digitadas.");
        }else{
            System.out.println("Casas decimais não foram digitadas.");
        }
    }
    private float temDecimal(){
        float result = numero % 1;
        if (result == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        new Uni4Exe04();
    }
}
/*
TESTE 1
Escreva um numero maior que 0: 1,33
Casas decimais foram digitadas.

TESTE 2
Escreva um numero maior que 0: 5
Casas decimais não foram digitadas.

TESTE 3
Escreva um numero maior que 0: 10,5
Casas decimais foram digitadas.

*/
