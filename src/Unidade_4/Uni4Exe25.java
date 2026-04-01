package Unidade_4;

import java.util.Scanner;

public class Uni4Exe25 {
    Scanner sc = new Scanner(System.in);
    private int numero1, numero2, opcao;

    public Uni4Exe25(){
        entrada();
        saida();
    }
    private void entrada(){
        System.out.print("Informe dois números: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        System.out.print("1-Soma\n"+"2-Diferença\n"+"3-Produto\n"+"4-Divisão\n"+"Escolha uma opção: ");
        opcao = sc.nextInt();
    }
    private void saida(){
        switch (opcao) {
            case 1:
                System.out.print(numero1 + numero2);
                break;
            case 2:
                System.out.print(numero1 - numero2);
                break;
            case 3:
                System.out.print(numero1 * numero2);
                break;
            
            case 4:
                if(numero2 != 0){
                    System.out.print(numero1 / numero2);
                }else{
                    System.out.print("O denominador não pode ser 0");
                }
                    break;
                
            default:
                break;
        }
    }
    public static void main(String[] args) {
        new Uni4Exe25();
    }
}
/*
TESTE 1

Informe dois números: 5  
3
1-Soma
2-Diferença
3-Produto
4-Divisão
Escolha uma opção: 1
8
TESTE 2

Informe dois números: 5
3
1-Soma
2-Diferença
3-Produto
4-Divisão
Escolha uma opção: 2
2
TESTE 3

Informe dois números: 5
3
1-Soma
2-Diferença
3-Produto
4-Divisão
Escolha uma opção: 3
15
TESTE 4
Informe dois números: 15
3
1-Soma
2-Diferença
3-Produto
4-Divisão
Escolha uma opção: 4
5
TESTE 5
Informe dois números: 5
0
1-Soma
2-Diferença
3-Produto
4-Divisão
Escolha uma opção: 4
O denominador não pode ser 0
*/