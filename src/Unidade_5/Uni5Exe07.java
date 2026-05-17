package Unidade_5;

import java.util.Scanner;

public class Uni5Exe07 {
    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    private float num = 0;
    private float temp = 0;
    private float temp2 = 0;
    
    public Uni5Exe07(){
        logic();
    }
    private void input(){
        System.out.print("Insira a quantidade de entradas: ");
        n = sc.nextInt();
    }
    private void logic(){
        input();
        for(int i=1; i<=n; i++){
            System.out.print("Informe um número real: ");
            num = sc.nextFloat();
            if(num > temp || temp == 0){
                temp = num;
            }
            if(num < temp2 || temp2 == 0){
                temp2 = num;
            }
        }
        output();
    }
    private void output(){
        System.out.printf("Maior número: %.2f\n",temp);
        System.out.printf("Menor número: %.2f",temp2);
    }
    public static void main(String[] args) {
        new Uni5Exe07();
    }
}
