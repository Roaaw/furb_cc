package Unidade_4;

import java.util.Scanner;

public class Uni4Exe22 {
    Scanner sc = new Scanner(System.in);
    private int escolha;

    public Uni4Exe22(){
        entrada();
        saida();
    }
    private void entrada(){
        System.out.printf("1 - Ciência da Computação \n"+"2 - Licenciatura da Computação \n"+"3 - Sistemas de Informação \n"+"Informe o numero do seu curso: ");
        escolha = sc.nextInt();
    }
    private void saida(){
        switch (escolha) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        
            default:

                break;
        }
    }
    public static void main(String[] args) {
        new Uni4Exe22();
    }
}
/*
TESTE 1

1 - Ciência da Computação 
2 - Licenciatura da Computação
3 - Sistemas de Informação
Informe o numero do seu curso: 1
Bacharel em Ciência da Computação
TESTE 2

1 - Ciência da Computação 
2 - Licenciatura da Computação
3 - Sistemas de Informação
Informe o numero do seu curso: 2
Licenciado em Computação
TESTE 3

1 - Ciência da Computação 
2 - Licenciatura da Computação
3 - Sistemas de Informação
Informe o numero do seu curso: 3
Bacharel em Sistemas de Informação
*/