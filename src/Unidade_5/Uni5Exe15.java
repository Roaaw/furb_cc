package Unidade_5;

import java.util.Scanner;

public class Uni5Exe15 {
    private Scanner sc = new Scanner(System.in);
    private float nota = 0;
    private String nome = "";
    private boolean exit = false;

    public Uni5Exe15(){
        entrada();
        logica();
    }
    private void entrada(){
        if(nome == ""){
            System.out.print("Nome do aluno: ");
            nome = sc.next();
        }else if(nota == 0){
            System.out.print("Digite a nota: ");
            nota = sc.nextFloat();
            System.out.print("Digite a próxima nota: ");
            nota += sc.nextFloat();
        }
    }
    private void logica(){
        while (!exit) {
            if(nome == ""){
                entrada();
            }
            if(nome.toLowerCase().equals("fim")){
                exit = true;
                break;
            }else{
                entrada();
                imprimir();
                nota = 0;
                nome = "";
            }
        }
    }
    private void imprimir(){
        System.out.println("A média do(a) "+nome+" é "+(nota/2));
        System.out.println("-");
    }
    public static void main(String[] args) {
        new Uni5Exe15();
        // Scanner sc = new Scanner(System.in);
        // float nota = 0;
        // String nome = "";
        // boolean exit = true;
        // while (exit) {
        //     System.out.print("Nome do aluno: ");
        //     nome = sc.next();
        //     if(nome.toLowerCase().equals("fim")){
        //         exit = false;
        //     }else{
        //         for(int i=0; i <=1; i++){
        //             if(nota == 0){
        //                 System.out.print("Digite a nota: ");
        //                 nota = sc.nextFloat();
        //             }else{
        //                 System.out.print("Digite a próxima nota: ");
        //                 nota += sc.nextFloat();
        //             }
        //         }
        //         System.out.println("A médua do(a) "+nome+" é "+(nota/2));
        //         nota = 0;
        //         }
        // }
        // System.out.println("-");
        // sc.close();
    }
}
