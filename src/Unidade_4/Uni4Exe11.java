package Unidade_4;

import java.util.Scanner;

public class Uni4Exe11 {
    Scanner sc = new Scanner(System.in);
    private int idade1, idade2, idade3;
    private String result;

    public Uni4Exe11(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Informe a idade do primeiro irmão: ");
        idade1 = sc.nextInt();
        System.out.print("Informe a idade do segundo irmão: ");
        idade2 = sc.nextInt();
        System.out.print("Informe a idade do terceiro irmão: ");
        idade3 = sc.nextInt();
    }
    private void logica(){
        if(idade1 == idade2 && idade1 == idade3){
            result = "Trigêmeos";
        }else if(idade1 == idade2 || idade1 == idade3){
            result = "Gêmeos";
        }else{
            result = "Apenas Irmãos";
        }
    }
    private void saida(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Uni4Exe11();
    }
}
/*
TESTE 1

Informe a idade do primeiro irmão: 10
Informe a idade do segundo irmão: 10
Informe a idade do terceiro irmão: 5
Gêmeos
TESTE 2

Informe a idade do primeiro irmão: 16
Informe a idade do segundo irmão: 16
Informe a idade do terceiro irmão: 16
Trigêmeos
TESTE 3

Informe a idade do primeiro irmão: 10
Informe a idade do segundo irmão: 21
Informe a idade do terceiro irmão: 16
Apenas Irmãos
*/