package Unidade_6;

import java.util.Scanner;

public class ExermploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] nomes = new String[10][2];
        double[] numero = new double[10];
        int n = 0;
        while(n != 9){
            nomes[n][0] = sc.nextLine();//vetor comun
            nomes[n+1][1] = sc.nextLine();//vetor multidimensional
            numero[n] = sc.nextDouble();
            sc.nextLine();
            n++;
        }
        sc.close();
        System.out.println(nomes);
    }
}
