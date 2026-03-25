package Unidade_4;

import java.util.Scanner;

public class Aula_2503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        sc.close();
        if(idade >= 80){
            System.out.println("Idoso");
        }else if(idade >= 60){
            System.out.println("Terceira Idade");
        }else if(idade >= 18){
            System.out.println("Adulto");
        }else if(idade >= 12){
            System.out.println("Adolescente");
        }else if(idade >= 7){
            System.out.println("Criança");
        }else{
            System.out.println("Bebe");
        }
    }
}
