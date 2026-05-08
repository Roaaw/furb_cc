package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean exit = true;
        float desconto = 0;
        float valorCompra = 0;
        float soma = 0;
        while (exit) {
            System.out.print("Valor da compra: ");
            valorCompra = sc.nextFloat();
            if(valorCompra == 0){
                exit = false;
            }
            if(valorCompra > 500){
                desconto = 0.20f;
                valorCompra = valorCompra - (valorCompra * desconto);
            }else{
                desconto = 0.15f;
                valorCompra = valorCompra - (valorCompra * desconto);
            }
            soma += valorCompra;
            if(valorCompra != 0){
                System.out.println("Valor a pagar: R$"+df.format(valorCompra));
            }
        }
        System.out.println("O valor total recebido foi de R$"+df.format(soma));
        sc.close();
    }
}
