package Unidade_5;

import java.util.Scanner;

public class Uni5Exe05 {
    private Scanner sc = new Scanner(System.in);
    private int r = 0;
    private int r2 = 4;
    private int n = 0;

    public Uni5Exe05(){
        logic();
    }
    private void input(){
        System.out.print("Informe o número de repetições: ");
        n = sc.nextInt();
    }
    private void logic(){
        input();
        for(int i = 0; i <= n-1; i++){
            if(i % 2 == 0){
                r = r2 *2;
                r2 = r;
            }else{
                r+=2;
            }
            if(i == n-1){
                n = 1;
                output();
            }else{
                output();
            }
        }
    }
    private void output(){
        if(n == 1){
            System.out.print(r);
        }else{
            System.out.print(r+",");
        }
    }
    public static void main(String[] args) {
        new Uni5Exe05();
    }
}
