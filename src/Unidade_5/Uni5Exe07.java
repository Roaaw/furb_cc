package Unidade_5;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de entradas: ");
        int n = sc.nextInt();
        float num = 0;
        float temp = 0;
        float temp2 = 0;
        for(int i=1; i<=n; i++){
            // num1 = num;
            num = sc.nextFloat();
            if(num > temp || temp == 0){
                temp = num;
            }
            if(num < temp2 || temp2 == 0){
                temp2 = num;
            }
        }
        System.out.printf("Maior número: %.2f\n",temp);
        System.out.printf("Menor número: %.2f",temp2);
        sc.close();
    }
}
