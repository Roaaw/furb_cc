package Unidade_5;

import java.util.Scanner;

public class Uni5Exe13 {
    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    private float km,c;
    
    public Uni5Exe13(){
        logica();
    }
    private void entrada(){
        System.out.print("Insira o número de paradas: ");
        n = sc.nextInt();
    }
    private void entradaDados(){
        System.out.print("Insira a Quilometragem do Odometro: ");
        km = sc.nextFloat();
        System.out.print("Insira a quantidade de litros da comanda de abastecimento: ");
        c = sc.nextFloat();
    }
    private void logica(){
        entrada();
        for(int i=0; i<=(n-1); i++){
            entradaDados();
            imprimir(i);
        }
    }
    private void imprimir(int i){
        System.out.printf("Parada %s: Quilometragem: %s km, Combustivel: %s litros\n",i+1,km,c);
        km = km/c;
        System.out.printf("Parada %s: %s km por litro\n",i+1,km);
    }
    public static void main(String[] args) {
        new Uni5Exe13();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Insira o número de paradas: ");
        // int n = sc.nextInt();
        // float km, c;
        // for(int i=0; i<=(n-1); i++){
        //     System.out.print("Insira a Quilometragem do Odometro: ");
        //     km = sc.nextFloat();
        //     System.out.print("Insira a quantidade de litros da comanda de abastecimento: ");
        //     c = sc.nextFloat();
        //     System.out.printf("Parada %s: Quilometragem: %s km, Combustivel: %s litros\n",i+1,km,c);
        //     km = km/c;
        //     System.out.printf("Parada %s: %s km por litro\n",i+1,km);
        // }
        // sc.close();
    }
}
