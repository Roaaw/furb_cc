package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private boolean exit = true;
    private float desconto = 0;
    private float valorCompra = 0;
    private float soma = 0;

    public Uni5Exe19(){
        logica();
    }
    private void entrada(){
        System.out.print("Valor da compra: ");
        valorCompra = sc.nextFloat();
    }
    private void logica(){
        while (exit) {
            entrada();
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
                imprimir();
            }
        }
        imprimir();
    }
    private void imprimir(){
        if(valorCompra != 0){
            System.out.println("Valor a pagar: R$"+df.format(valorCompra));
        }else{
            System.out.println("O valor total recebido foi de R$"+df.format(soma));
        }
    }
    public static void main(String[] args) {
        new Uni5Exe19();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // boolean exit = true;
        // float desconto = 0;
        // float valorCompra = 0;
        // float soma = 0;
        // while (exit) {
        //     System.out.print("Valor da compra: ");
        //     valorCompra = sc.nextFloat();
        //     if(valorCompra == 0){
        //         exit = false;
        //     }
        //     if(valorCompra > 500){
        //         desconto = 0.20f;
        //         valorCompra = valorCompra - (valorCompra * desconto);
        //     }else{
        //         desconto = 0.15f;
        //         valorCompra = valorCompra - (valorCompra * desconto);
        //     }
        //     soma += valorCompra;
        //     if(valorCompra != 0){
        //         System.out.println("Valor a pagar: R$"+df.format(valorCompra));
        //     }
        // }
        // System.out.println("O valor total recebido foi de R$"+df.format(soma));
        // sc.close();
    }
}
