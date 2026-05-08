package Unidade_5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        char sexo;
        int e = 0;
        int f = 0;
        float altura = 0;
        float alturaF = 0;
        while (exit) {
            System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
            sexo = sc.next().toUpperCase().charAt(0);
            switch (sexo) {
                case 'M':
                    System.out.print("Digite a altura: ");
                    e++;
                    altura += sc.nextFloat();
                    break;
                case 'F':
                    System.out.print("Digite a altura: ");
                    e++;
                    f++;
                    alturaF += sc.nextFloat();
                    break;
                case 'O':
                    System.out.print("Digite a altura: ");
                    e++;
                    altura += sc.nextFloat();
                    break;
                case '0':
                    System.out.printf("A média da altura das mulheres é: %.2f\n",(alturaF/f));
                    System.out.printf("A média de altura do grupo é: %.2f",((altura+alturaF)/e));
                    exit = false;
                    break;
                default:
                    System.out.println("Digite uma das opções:\nM - Masculino\nF - Feminino\nO - Outros\n0 - Sair");
                    break;
            }
        }
        sc.close();
    }
}
