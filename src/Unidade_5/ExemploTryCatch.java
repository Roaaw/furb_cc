package Unidade_5;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Digite um número: ");
        try{
            numero = sc.nextInt();
            System.out.println("Numer digitado: "+numero);
        }catch(Exception e){
            System.out.println("Erro: "+e);
            e.getMessage();
            e.getStackTrace();
        }
        sc.close();
    }
}
