package Unidade_4;

import java.util.Scanner;

public class Uni4Exe14 {
    Scanner sc = new Scanner(System.in);
    private int dia, mes, ano;
    private String result;
    
    public Uni4Exe14(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Informe o dia: ");
        dia = sc.nextInt();
        System.out.print("Informe o mês: ");
        mes = sc.nextInt();
        System.out.print("Informe o ano: ");
        ano = sc.nextInt();
    }
    private void logica(){
        if(dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano >0){
            if (mes == 1 || mes == 3){
                result = "Válida";
            }else if(mes != 2 && dia < 31){
                result = "Válida";
            }else if (mes == 2 && dia <29){
                result = "Válida";
            }else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 !=0)){
                result = "Válida";
            }else{
                result = "Não válida";
            }
        }else{
                result = "Não válida";
            }
    }
    private void saida(){
        System.out.print(result);
    }
    public static void main(String[] args) {
        new Uni4Exe14();
    }
}
/*
TESTE 1

Informe o dia: 15
Informe o mês: 5
Informe o ano: 2023
Válida
TESTE 2
Informe o dia: 31
Informe o mês: 4
Informe o ano: 2023
Não válida

TESTE 3
Informe o dia: 29
Informe o mês: 2
Informe o ano: 2024
Válida

TESTE 4
Informe o dia: 29
Informe o mês: 2
Informe o ano: 2022
Não válida

*/