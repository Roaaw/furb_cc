package Unidade_4;

import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    private float numero1, numero2, result;
    private char sinal;

    public Calculadora(){
        obterValores();
        executarOperacao();
        exibirResultados();        
    }
    private void obterValores(){
        System.out.print("Digite o primeiro: ");
        numero1 = sc.nextFloat();
        System.out.print("Digite o segundo: ");
        numero2 = sc.nextFloat();
    }
    private void executarOperacao(){
        System.out.print("Digite o sinal da operação: ");
        sinal = sc.next().charAt(0);
        operacao();
    }
    private void exibirResultados(){
        System.out.println("O resultado é:"+ result);
    }
    public static void main(String[] args) {
        new Calculadora();
    }
    private void operacao(){
        if (sinal == '+'){
            result = (numero1 + numero2);
        }else if (sinal == '-'){
            result = (numero1 - numero2);
        }else if (sinal == '*'){
            result = (numero1 * numero2);
        }else if (sinal == '/'){
            if (numero1 <= numero2){
                result = +(numero1 / numero2);
            }else{
                result = 0;
            }
        }else if (sinal == '%'){
            result = (numero1 % numero2);
        }else if (sinal == '^'){
            result = (float)(Math.pow(numero1, numero2));
        }else{
            System.out.println("Sinal de operação errado.");
        }
    }
}