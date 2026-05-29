package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe22 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private int ano = 1995;
    private float aumento = 0.015f;
    private float salario = 2000;
    private String text = "";
    private boolean exit = true;
    private int anoAtual;
    public Uni5Exe22(){
        logica();
    }
    private void entrada(){
        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();
    }
    private void logica(){
        entrada();
        while (exit) {
            if(ano == 1995){
                salario += salario*aumento;
                text = "Salário: R$"+df.format(salario);
            }else{
                salario += salario * (aumento * 2);
                text = "Salário: R$"+df.format(salario);
            }
            ano++;
            imprimir();
            if(ano == anoAtual){
                exit = false;
            }
        }
    }
    private void imprimir(){
        System.out.println("Em "+ano+"\n"+text);
    }
    public static void main(String[] args) {
        new Uni5Exe22();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // int ano = 1995;
        // float aumento = 0.015f;
        // float salario = 2000;
        // String text = "";
        // boolean exit = true;
        // int anoAtual = sc.nextInt();
        // while (exit) {
        //     if(ano == 1995){
        //         salario += salario*aumento;
        //         text = "Salário: R$"+df.format(salario);
        //     }else{
        //         salario += salario * (aumento * 2);
        //         text = "Salário: R$"+df.format(salario);
        //     }
        //     ano++;
        //     System.out.println("Em "+ano+"\n"+text);
        //     if(ano == anoAtual){
        //         exit = false;
        //     }
        // }
        // sc.close();
    }
}
