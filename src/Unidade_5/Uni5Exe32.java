package Unidade_5;

import java.util.Scanner;

public class Uni5Exe32 {
    private Scanner sc = new Scanner(System.in);
    private int d = 0;
    private int m = 0;

    public Uni5Exe32(){
        logica();
    }
    private void entrada(){
        System.out.print("Digite o dia da semana que cai o primeiro dia: ");
        d = sc.nextInt();
        System.out.print("Digite a quantidade de dias no mês: ");
        m = sc.nextInt();
    }
    private void logica(){
        entrada();
        System.out.println("Dom    Seg    Ter    Qua    Qui    Sex    Sab");
        for(int i = 1; i < d; i++){
            System.out.print("       ");
        }
        for(int i = 1; i <= m; i++){
            System.out.printf("%-7d", i);
            if((d - 1 + i) % 7 == 0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        new Uni5Exe32();
        // Scanner sc = new Scanner(System.in);
        // int d = 0;
        // int m = 0;
        // d = sc.nextInt();
        // m = sc.nextInt();
        // System.out.println("Dom    Seg    Ter    Qua    Qui    Sex    Sab");
        // for(int i = 1; i < d; i++){
        //     System.out.print("       ");
        // }
        // for(int i = 1; i <= m; i++){
        //     System.out.printf("%-7d", i);
        //     if((d - 1 + i) % 7 == 0){
        //         System.out.println();
        //     }
        // }
    }
}
