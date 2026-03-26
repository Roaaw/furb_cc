package Unidade_4;

import java.util.Scanner;

public class Uni4Exe12 {
    Scanner sc = new Scanner(System.in);
    private int lado1, lado2, lado3;
    private String result;

    public Uni4Exe12(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Informe o primeiro lado do triângulo: ");
        lado1 = sc.nextInt();
        System.out.print("Informe o segundo lado do triângulo: ");
        lado2 = sc.nextInt();
        System.out.print("Informe o terceiro lado do triângulo: ");
        lado3 = sc.nextInt();
    }
    private void logica(){
        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if(lado1 == lado2 && lado1 == lado3){
                result = "É equilatero.";
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                result = "É isósceles.";
            }else{
                result = "É escaleno.";
            }
        }else{
            result = "Não formam um triângulo.";
        }
    }
    private void saida(){
        System.out.print(result);
    }
    public static void main(String[] args) {
        new Uni4Exe12();
    }
}
/*
TESTE 1

Informe o primeiro lado do triângulo: 5
Informe o segundo lado do triângulo: 5
Informe o terceiro lado do triângulo: 5
É equilatero.

TESTE 2

Informe o primeiro lado do triângulo: 7
Informe o segundo lado do triângulo: 7
Informe o terceiro lado do triângulo: 5
É isósceles.

TESTE 3

Informe o primeiro lado do triângulo: 6
Informe o segundo lado do triângulo: 8
Informe o terceiro lado do triângulo: 10
É escaleno.

TESTE 4

Informe o primeiro lado do triângulo: 1
Informe o segundo lado do triângulo: 2
Informe o terceiro lado do triângulo: 3
Não formam um triângulo.
*/
