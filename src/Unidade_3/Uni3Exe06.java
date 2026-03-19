package Unidade_3;

import java.util.Scanner;

public class Uni3Exe06 {
    private final float valorKg = 25f;
    private final float pratoPeso = 0.750f;
    private float pesagem;

    public Uni3Exe06(float pesagem){
        this.pesagem = pesagem;
    }

    public float calculo(){
        return (this.pesagem - pratoPeso) * valorKg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o peso do prato: ");
        float pesagem = sc.nextFloat();
        Uni3Exe06 calc = new Uni3Exe06(pesagem);
        System.out.printf("O valor do prato do cliente é R$ %.2f%n", calc.calculo());
        sc.close();
    }
}
/*
TESTE 1
Insira o peso do prato: 2,42
O valor do prato do cliente é R$ 41,75

TESTE 2
Insira o peso do prato: 1,77
O valor do prato do cliente é R$ 25,50

TESTE 3
Insira o peso do prato: 3,5
O valor do prato do cliente é R$ 68,75

*/