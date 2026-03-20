package Unidade_4;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();
        System.out.println("Você é doador de sangue?");
        String respostaDoador = sc.next();
        boolean doador = false;
        sc.close();
        if (respostaDoador.equalsIgnoreCase("Sim") || respostaDoador.equalsIgnoreCase("S")){
            doador = true;
        }
        System.out.println("Você é estudante?");
        String respostaEstudante = sc.next();
        boolean estudante = false;
        if (respostaEstudante.equalsIgnoreCase("Sim") || respostaEstudante.equalsIgnoreCase("S")){
            estudante = true;
        }
        if (idade < 18 || idade >= 60 || doador || estudante){
            System.out.println("Paga meia.");
        }else{
            System.out.println("Paga inteira.");
        }
    }
}
