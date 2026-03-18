package Unidade_3;

import java.util.Scanner;

public class Uni3Exe15 {
    private int centena;
    private int dezena;
    private int unidade;
    private int numero;

    public Uni3Exe15(int numero){
        this.numero = numero;
    }

    public int calcCentena(int numero){
        return centena = (numero / 100);
    }
    public int calcDezena(int numero){
        return dezena = (numero % 100) / 10;
    }
    public int calcUnidade(int numero){
        return unidade = ((numero % 100) % 10) / 1;
    }

    public static void main(String[] args) {
        Uni3Exe15 classExec = new Uni3Exe15(0);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um numero de 3 digitos:");
            int numero = scan.nextInt();
            if (numero <= 999){
                int centena = classExec.calcCentena(numero);
                int dezena = classExec.calcDezena(numero);
                int unidade = classExec.calcUnidade(numero);
                System.out.printf("%s centena(s) %s dezena(s) %s unidade(s)%n", centena, dezena, unidade);
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
