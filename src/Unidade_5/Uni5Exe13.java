package Unidade_5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número de paradas: ");
        int n = sc.nextInt();
        float km, c;
        for(int i=0; i<=(n-1); i++){
            System.out.print("Insira a Quilometragem do Odometro: ");
            km = sc.nextFloat();
            System.out.print("Insira a quantidade de litros da comanda de abastecimento: ");
            c = sc.nextFloat();
            System.out.printf("Parada %s: Quilometragem: %s km, Combustivel: %s litros\n",i+1,km,c);
            km = km/c;
            System.out.printf("Parada %s: %s km por litro\n",i+1,km);
        }
        sc.close();
    }
}
