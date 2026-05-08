package Unidade_5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = 0;
        String nome = "";
        boolean exit = true;
        while (exit) {
            nome = sc.next();
            if(nome.toLowerCase().equals("fim")){
                exit = false;
            }else{
                for(int i=0; i <=1; i++){
                    if(nota == 0){
                        nota = sc.nextFloat();
                    }else{
                        nota += sc.nextFloat();
                    }
                }
                System.out.println("A médua do(a) "+nome+" é "+(nota/2));
                nota = 0;
                }
        }
        sc.close();
    }
}
