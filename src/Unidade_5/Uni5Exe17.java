package Unidade_5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        int inscricao= 0;
        int repeat = 0;
        float altura = 0;
        float atemp = 0;
        float atemp2 = 0;
        float soma = 0;
        String temp = "";
        String temp2 = "";
        while (exit) {
            repeat++;
            System.out.print("Nº de inscrição:");
            inscricao = sc.nextInt();
            if(inscricao == 0){
                exit = false;
            }else{
                System.out.print("Altura:");
                altura = sc.nextFloat();
                soma += altura;
                if(altura < atemp || atemp == 0){
                    atemp = altura;
                    temp = "O alteta mais baixo tem "+altura+"m e seu número de inscrição é "+inscricao;
                }
                if(altura > atemp2 || atemp2 == 0){
                    atemp2 = altura;
                    temp2 = "O alteta mais alto tem "+altura+"m e seu número de inscrição é "+inscricao;
                } 
            }
        }
        System.out.println(temp);
        System.out.println(temp2);
        System.out.println("A altura média do grupo de atletas é: "+soma/(repeat-1));
        sc.close();
    }
}