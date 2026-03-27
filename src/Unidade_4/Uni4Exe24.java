package Unidade_4;

import java.util.Scanner;

public class Uni4Exe24 {
    Scanner sc = new Scanner(System.in);
    private int valor1, valor2, valor3, opcao;
    private String result;
    private boolean loop = true;

    public Uni4Exe24(){
        entrada();
        logica();
        saida();
    }

    private void entrada(){
        System.out.print("Informe três numeros diferentes: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        System.out.print("1-Ordem crescente\n"+"2-Ordem decrescente\n"+"3-Maior no meio\n"+"4-Sair\n"+"Escolha uma das opções: \n");
        opcao = sc.nextInt();
    }
    private void ordemCrescente(){
        if(valor1 < valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor1+","+valor2+","+valor3;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor3+","+valor2+","+valor1;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 < valor3){
            result = valor2+","+valor3+","+valor1;
        }else if(valor1 > valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor2+","+valor1+","+valor3;
        }else if(valor1 < valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor3+","+valor1+","+valor2;
        }
    }
    private void ordemDecrescente(){
        if(valor1 < valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor3+","+valor2+","+valor1;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor1+","+valor2+","+valor3;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 < valor3){
            result = valor1+","+valor3+","+valor2;
        }else if(valor1 > valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor3+","+valor1+","+valor2;
        }else if(valor1 < valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor2+","+valor1+","+valor3;
        }
    }
    private void maiorMeio(){
        if(valor1 < valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor1+","+valor3+","+valor2;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor3+","+valor1+","+valor2;
        }else if(valor1 > valor2 && valor1 > valor3 && valor2 < valor3){
            result = valor2+","+valor1+","+valor3;
        }else if(valor1 > valor2 && valor1 < valor3 && valor2 < valor3){
            result = valor2+","+valor3+","+valor1;
        }else if(valor1 < valor2 && valor1 > valor3 && valor2 > valor3){
            result = valor3+","+valor2+","+valor1;
        }
    }
    private void logica(){
        switch (opcao) {
            case 1:
                ordemCrescente();
                break;
            case 2:
                ordemDecrescente();
                break;
            case 3:
                maiorMeio();
                break;
            default:
                break;
        }   
    }
    private void saida(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Uni4Exe24();
    }
}
/*
TESTE 1

Informe três numeros diferentes: 4
1
9
1-Ordem crescente
2-Ordem decrescente
3-Maior no meio
4-Sair
Escolha uma das opções:
1
1,4,9
TESTE 2

1-Ordem crescente
2-Ordem decrescente
3-Maior no meio
4-Sair
Escolha uma das opções:
2
9,4,1
TESTE 3

Informe três numeros diferentes: 4
1
9
1-Ordem crescente
2-Ordem decrescente
3-Maior no meio
4-Sair
Escolha uma das opções:
3
1,9,4
*/