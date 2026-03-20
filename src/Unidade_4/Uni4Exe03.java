package Unidade_4;

import java.util.Scanner;

public class Uni4Exe03 {
    private int numero1, numero2;

    public Uni4Exe03(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public int escolhaMaior(){
        if(numero1 > numero2){
            return numero1;
        }else{
            return numero2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores diferentes: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        sc.close();
        Uni4Exe03 classExec = new Uni4Exe03(numero1, numero2);
        int result = classExec.escolhaMaior();
        if(result == numero1){
            System.out.printf("O valor %s é maior do que o valor %s", numero1, numero2);
        }else{
            System.out.printf("O valor %s é maior do que o valor %s", numero2, numero1);
        }
    }
}
/*
TESTE 1
Insira dois valores diferentes: 
28
14
O valor 28 é maior do que o valor 14

TESTE 2
Insira dois valores diferentes: 
60
69
O valor 69 é maior do que o valor 60

TESTE 3
Insira dois valores diferentes: 
2975
1974
O valor 2975 é maior do que o valor 1974
*/