package Unidade_4;

import java.util.Scanner;

public class Uni4Exe07 {
    Scanner sc = new Scanner(System.in);
    private float peso, valorPagar, pesoExcedido, result;
    private final float valorSelo =  0.45f;
    
    public Uni4Exe07(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Informe o peso da carta: ");
        peso = sc.nextFloat();
    }
    private void logica(){
        if (peso <= 50){
            result = valorSelo;
        }else if (peso > 50){
            pesoExcedido = (peso - 50);
            float qtAdicional =  (pesoExcedido / 20) + 1;
            valorPagar = (valorSelo + (valorSelo * qtAdicional));
            result = valorPagar;
        }
    }
    private void saida(){
        System.out.println(result);
        System.out.printf("Valor a pagar R$ %.2f", result);
    }
    public static void main(String[] args) {
        new Uni4Exe07();
    }
}
/*
TESTE 1

Informe o peso da carta: 50
0.45
Valor a pagar R$ 0,45
TESTE 2

Informe o peso da carta: 105
2.1375
Valor a pagar R$ 2,14
TESTE 3

Informe o peso da carta: 500
11.025
Valor a pagar R$ 11,02
*/