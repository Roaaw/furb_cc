package Unidade_4;

import java.util.Scanner;

public class Uni4Exe02 {
    Scanner sc = new Scanner(System.in);
    private float numero;

    public Uni4Exe02(){
        entrada();
        saida();
    }
    private void entrada(){
    System.out.print("Entre com um valor maior que 0: ");
    numero = sc.nextFloat();
    sc.close();
    }
    private void saida(){
        if (parImpar() != 0){
            System.out.println("Número é impar");
        }else{
            System.out.println("Número é par");
        }
    }
    private float parImpar(){
        return this.numero % 2;
    }

    public static void main(String[] args) {
        new Uni4Exe02();
    }
}

/*
TESTE 1
Entre com um valor maior que 0: 625
Número é impar

TESTE 2
Entre com um valor maior que 0: 84
Número é par

TESTE 3
Entre com um valor maior que 0: 1897
Número é impar
*/
