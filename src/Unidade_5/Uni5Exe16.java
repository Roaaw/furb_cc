package Unidade_5;

import java.util.Scanner;

public class Uni5Exe16 {
    private Scanner sc = new Scanner(System.in);
    private boolean exit = true;
    private char sexo;
    private int e = 0;
    private int f = 0;
    private float altura = 0;
    private float alturaF = 0;

    public Uni5Exe16(){
        logica();
    }

    private void entrada(){
        System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
        sexo = sc.next().toUpperCase().charAt(0);
    }
    private void altura(){
        if(sexo == 'F'){
            System.out.print("Digite a altura: ");
            alturaF += sc.nextFloat();
        }else{
            System.out.print("Digite a altura: ");
            altura += sc.nextFloat();
        }
    }
    private void logica(){
        while (exit) {
            entrada();
            switch (sexo) {
                case 'M':
                    e++;
                    altura();
                    break;
                case 'F':
                    e++;
                    f++;
                    altura();
                    break;
                case 'O':
                    e++;
                    altura();
                    break;
                case '0':
                    imprimir();
                    exit = false;
                    break;
                default:
                    System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
                    break;
            }
        }
    }
    private void imprimir(){
        System.out.printf("A média da altura das mulheres é: %.2f\n",(alturaF/f));
        System.out.printf("A média de altura do grupo é: %.2f",((altura+alturaF)/e));
    }
    public static void main(String[] args) {
        new Uni5Exe16();
        // Scanner sc = new Scanner(System.in);
        // boolean exit = true;
        // char sexo;
        // int e = 0;
        // int f = 0;
        // float altura = 0;
        // float alturaF = 0;
        // while (exit) {
        //     System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
        //     sexo = sc.next().toUpperCase().charAt(0);
        //     switch (sexo) {
        //         case 'M':
        //             System.out.print("Digite a altura: ");
        //             e++;
        //             altura += sc.nextFloat();
        //             break;
        //         case 'F':
        //             System.out.print("Digite a altura: ");
        //             e++;
        //             f++;
        //             alturaF += sc.nextFloat();
        //             break;
        //         case 'O':
        //             System.out.print("Digite a altura: ");
        //             e++;
        //             altura += sc.nextFloat();
        //             break;
        //         case '0':
        //             System.out.printf("A média da altura das mulheres é: %.2f\n",(alturaF/f));
        //             System.out.printf("A média de altura do grupo é: %.2f",((altura+alturaF)/e));
        //             exit = false;
        //             break;
        //         default:
        //             System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
        //             break;
        //     }
        // }
        // sc.close();
    }
}
