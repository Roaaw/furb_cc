package Unidade_4;

import java.util.Scanner;

public class Uni4Exe06 {
    Scanner sc = new Scanner(System.in);
    private char entrada;
    public Uni4Exe06(){
        entrada();
        validacao();
    }
    private void entrada(){
        System.out.printf("M = Masculino\n"+"F = Feminino \n"+"I = Nâo informar\n"+"Informe o seu sexo: ");
        entrada = sc.next().toUpperCase().charAt(0);
        sc.close();
    }
    private void validacao(){
        if (entrada == 'M'){
            System.out.println("Masculino");
        }else if (entrada == 'F'){
            System.out.println("Feminino");
        }else if (entrada == 'I'){
            System.out.println("Não Informado");
        }else{
            System.out.println("Entrada Incorreda");
        }
    }
    public static void main(String[] args) {
        new Uni4Exe06();
    }
}
