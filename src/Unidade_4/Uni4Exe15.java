package Unidade_4;

import java.util.Scanner;

public class Uni4Exe15 {
    Scanner sc = new Scanner(System.in);
    private int mes;
    private String result;

    public Uni4Exe15(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Informe a quantos meses o funcionario está admitido: ");
        mes = sc.nextInt();

    }
    private void logica(){
        if(mes > 0 && mes <= 12){
            result = "O funcionário irá receber 5 % de reajuste";
        }else if(mes >= 13  && mes <= 48){
            result = "O funcionário irá receber 7 % de reajuste";
        }else if (mes == 0){
            result = "A quantidade de meses precisa ser maior que zero";
        }else{
            result = "Reajuste nâo informado";
        }
        

    }
    private void saida(){
        System.out.print(result);
    }
    public static void main(String[] args) {
        new Uni4Exe15();
    }
}
/*
TESTE 1

Informe a quantos meses o funcionario está admitido: 10
O funcionário irá receber 5 % de reajuste
TESTE 2

Informe a quantos meses o funcionario está admitido: 45
O funcionário irá receber 7 % de reajuste
TESTE 3

Informe a quantos meses o funcionario está admitido: 52
Reajuste nâo informado
TESTE 4

Informe a quantos meses o funcionario está admitido: 0
A quantidade de meses precisa ser maior que zero
*/