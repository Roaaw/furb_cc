package Unidade_4;

import java.util.Scanner;

public class Uni4Exe20 {
    Scanner sc = new Scanner(System.in);
    private float prova1,prova2,prova3,notaExercicios,media;
    private String conceito;
    
    public Uni4Exe20(){
        entrada();
        logica();
        saida();
    }
    private void entrada(){
        System.out.print("Prova 1: ");
        prova1 = sc.nextFloat();
        System.out.print("Prova 2: ");
        prova2 = sc.nextFloat();
        System.out.print("Prova 3: ");
        prova3  = sc.nextFloat();
        System.out.print("Exercicios: ");
        notaExercicios = sc.nextFloat();
    }
    private void logica(){
        media = (prova1 + (prova2 * 2) + (prova3 * 3) + notaExercicios) / 7;
        if(media >= 9){
            conceito = "A. Aprovado";
        }else if(media >= 7.5 && media < 9){
            conceito = "B. Aprovado";
        }else if(media >= 6 && media < 7.5){
            conceito = "C. Aprovado";
        }else if(media >= 4 && media < 6){
            conceito = "D. Reprovado";
        }else{
            conceito = "E. Reprovado"; 
        }
    }
    private void saida(){
        System.out.printf("A média de aproveitamento foi %.2f.Conceito: %s",media, conceito);
    }
    public static void main(String[] args) {
        new Uni4Exe20();
    }
}
/*
TESTE 1

Prova 1: 8 
Prova 2: 7,5
Prova 3: 9
Exercicios: 7
A média de aproveitamento foi 8,14.Conceito: B. Aprovado
TESTE 2

Prova 1: 10
Prova 2: 5
Prova 3: 8,5
Exercicios: 6
A média de aproveitamento foi 7,36.Conceito: C. Aprovado
TESTE 3

Prova 1: 4
Prova 2: 6,5
Prova 3: 5,5
Exercicios: 5
A média de aproveitamento foi 5,50.Conceito: D. Reprovado
*/