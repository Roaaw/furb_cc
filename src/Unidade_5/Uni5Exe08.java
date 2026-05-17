package Unidade_5;

import java.util.Scanner;

public class Uni5Exe08 {
    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    private int num = 0;
    private float numNeg = 0;
    private float numPos = 0;
    private float somaPos = 0;
    private float result = 0;

    public Uni5Exe08(){
        logic();
    }
    public void input(){
        System.out.print("Insira a quantidade de entradas: ");
        n = sc.nextInt();
    }
    public void logic(){
        input();
        for(int i=1; i<=n; i++){
            num = sc.nextInt();
            if(num < numNeg){
                numNeg = num;
            }else{
                numPos++;
                somaPos += num;
                result = somaPos/numPos;
            }
        }
        output();
    }
    public void output(){
        System.out.println("Menor valor negativo: "+numNeg);
        System.out.println("Média dos números positivos: "+result);
    }
    public static void main(String[] args) {
        new Uni5Exe08();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Insira a quantidade de entradas: ");
        // int n = sc.nextInt();
        // float numNeg = 0;
        // float numPos = 0;
        // float somaPos = 0;
        // float result = 0;
        // for(int i=1; i<=n; i++){
        //     int num = sc.nextInt();
        //     if(num < numNeg){
        //         //if(num < numNeg || numNeg == 0){
        //         numNeg = num;
        //         //}
        //     }else{
        //         numPos++;
        //         somaPos += num;
        //         result = somaPos/numPos;
        //     }
        // }
        // System.out.println("Menor valor negativo: "+numNeg);
        // System.out.println("Média dos números positivos: "+result);
        // sc.close();
    }
}
