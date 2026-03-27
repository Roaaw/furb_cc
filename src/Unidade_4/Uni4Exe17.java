package Unidade_4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    private float rendaAnual, numDependentes, rendaAnualLiquida, imposto, calcImposto, calcDependentes, impostoRenda;
    private final float descDependentes = 0.02f;
    private String imposto1;

    public Uni4Exe17(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Informe a renda anual: ");
        rendaAnual = sc.nextFloat();
        System.out.print("Informe a quantidade de denpendentes: ");
        numDependentes = sc.nextFloat();
    }
    private void calculo(){
        calcDependentes = (numDependentes * descDependentes);
        calcImposto = (rendaAnual * imposto);
        rendaAnualLiquida = calcImposto * calcDependentes;
        impostoRenda = calcImposto - rendaAnualLiquida;
    }
    private void logica(){
        if(rendaAnual > 2000f && rendaAnual <= 5000f){
            imposto = 0.05f;
            imposto1 = "5%";
            calculo();
        }else if(rendaAnual > 5000f && rendaAnual <= 10000f){
            imposto = 0.10f;
            imposto1 = "10%";
            calculo();
        }else if(rendaAnual > 10000){
            imposto = 0.15f;
            imposto1 = "15%";
            calculo();
        }else{
            impostoRenda = 0;
        }

    }
    private void saida(){
        if(impostoRenda == 0){
            System.out.println("O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto.");
        }else{
        System.out.printf("O imposto é de %s: %.2f", imposto1, impostoRenda);
    }
    }
    public static void main(String[] args) {
        new Uni4Exe17();
    }
}
/*
TESTE 1

Informe a renda anual: 7000
Informe a quantidade de denpendentes: 2
O imposto é de 10%: 672,00
TESTE 2

Informe a renda anual: 11000
Informe a quantidade de denpendentes: 0
O imposto é de 15%: 1650,00
TESTE 3

Informe a renda anual: 2350
Informe a quantidade de denpendentes: 3
O imposto é de 5%: 110,45
TESTE 4

Informe a renda anual: 2000
Informe a quantidade de denpendentes: 0
O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto.
*/