package Unidade_5;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int r2 = 4;
        System.out.print("Informe o número de repetições: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i % 2 == 0){
                r = r2 *2;
                r2 = r;
            }else{
                r+=2;
            }
            System.out.println(r);
        }
        sc.close();
    }
}
