package Unidade_3;

import java.util.Scanner;

public class Uni3Exe06 {
    private final float valorKg = 25f;
    private final float pratoPeso = 0.750f;
    private float pesagem;
    private float result;

    public Uni3Exe06(float pesagem, float result){
        this.pesagem = pesagem;
        this.result = result;
    }

    public float calculo(float pesagem, float result){
        return result = (pesagem - pratoPeso) * valorKg;
    }
    public static void main(String[] args) {
        Uni3Exe06 calc = new Uni3Exe06(0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o peso do prato: ");
        float pesagem = sc.nextFloat();
        float result = calc.calculo(pesagem, 0);
        System.out.printf("O valor do prato do cliente é R$ %.2f%n", result);
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