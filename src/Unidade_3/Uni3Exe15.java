package Unidade_3;

import java.util.Scanner;

public class Uni3Exe15 {
    private int numero;

    public Uni3Exe15(int numero){
        this.numero = numero;
    }

    public int calcCentena(){
        return (this.numero / 100);
    }
    public int calcDezena(){
        return (this.numero % 100) / 10;
    }
    public int calcUnidade(){
        return ((this.numero % 100) % 10) / 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um numero de 3 digitos:");
            int numero = scan.nextInt();
            Uni3Exe15 classExec = new Uni3Exe15(numero);
            if (numero <= 999){
                System.out.printf("%s centena(s) %s dezena(s) %s unidade(s)%n", classExec.calcCentena(), classExec.calcDezena(), classExec.calcUnidade());
                scan.close();
                break;
            }
        }
    }
}

/*
TESTE 1
Digite um numero de 3 digitos:816
8 centena(s) 1 dezena(s) 6 unidade(s)

TESTE 2
Digite um numero de 3 digitos:974
9 centena(s) 7 dezena(s) 4 unidade(s)

TESTE 3
Digite um numero de 3 digitos:199
1 centena(s) 9 dezena(s) 9 unidade(s)
*/
