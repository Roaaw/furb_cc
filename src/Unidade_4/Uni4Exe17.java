package Unidade_4;

import java.util.Scanner;

public class Uni4Exe17 {
    Scanner sc = new Scanner(System.in);
    private float rendaAnual, numDependentes, rendaAnualLiquida;
    private final float descDependentes = 0.02f;

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
    private void logica(){
        if(rendaAnual <= 2000f){

        }
        if(rendaAnual > 2000f && rendaAnual <= 5000f){

        }else if(rendaAnual > 5000f && rendaAnual <= 10000f){

        }else{
            
        }

    }
    private void saida(){
        System.out.print("O imposto é de %s: %.2f",);
    }
    public static void main(String[] args) {

    }
}
