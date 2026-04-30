package Unidade_5;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<=20; i++){
            
            if(i % 2 == 0){
                System.out.println(i+" Par");
            }else
                System.out.println(i+" Ímpar");
        }
    }
}
