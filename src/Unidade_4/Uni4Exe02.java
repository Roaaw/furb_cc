package Unidade_4;

import java.util.Scanner;

public class Uni4Exe02 {
    private float numero;

    public Uni4Exe02(float numero){
        this.numero = numero;
    }
    public float parImpar(){
        return this.numero % 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com um valor maior que 0: ");
        float numero = sc.nextFloat();
        sc.close();
        Uni4Exe02 classExec = new Uni4Exe02(numero);
        if (classExec.parImpar() != 0){
            System.out.println("Número é impar");
        }else{
            System.out.println("Número é par");
        }
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
