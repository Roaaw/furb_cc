package Unidade_5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        boolean exit = false;
        int div = 2;
        String text = "|Número|Decomposição|";
        while (!exit) {
            if(num % div == 0 && div / 1 == div && div / div == 1){
                if(num >= 1000 && num < 9999){
                    text += "\n| "+num+" |      "+div+"     |";
                }else if(num >=100 && num < 1000){
                    text += "\n| "+num+"  |     "+div+"      |";
                }else if(num > 9 && num < 100){
                    text += "\n|  "+num+"  |     "+div+"      |";
                }else{
                    text += "\n|   "+num+"  |     "+div+"      |";
                }
                num = num / div;
            }else if(num % div != 0){
                div++;
            }
            if(num == 1){
                text += "\n|   "+num+"  |"+"            |";
                exit = true;
                System.out.println(" ___________________ ");
                System.out.println(text);
                System.out.println(" ------------------- ");
            }
            if(num == div && num / div != 1){
                System.out.println("Não foi possivel fazer a decomposiçao de fatores primos.");
                exit = true;
            }
        }
        sc.close();
    }
}
