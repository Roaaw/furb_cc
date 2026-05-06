package Unidade_5;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de entradas: ");
        int n = sc.nextInt();
        float numNeg = 0;
        float numPos = 0;
        float somaPos = 0;
        float result = 0;
        for(int i=1; i<=n; i++){
            int num = sc.nextInt();
            if(num < numNeg || numNeg == 0){
                //if(num < numNeg || numNeg == 0){
                numNeg = num;
                //}
            }else{
                numPos++;
                somaPos += num;
                result = somaPos/numPos;
            }
        }
        System.out.println("Menor valor negativo: "+numNeg);
        System.out.println("Média dos números positivos: "+result);
        sc.close();
    }
}
