package Unidade_6;

import java.util.Scanner;

public class Uni6Exe02 {
    private Scanner sc = new Scanner(System.in);
    private String texto= "";
    private double[] valor = new double[12];
    private double calculo;

    public Uni6Exe02(){
        lerValores();
        calcularValores();
        imprimirValores();
    }
    private void lerValores(){
        for(int i = 0; i < 12; i++){
            System.out.print("Digite um valor: ");
            valor[i] = sc.nextDouble();
        }
    }
    private void calcularValores(){
        for(int i = 0; i < 12; i++){
            calculo += valor[i];
        }
        calculo = calculo / 12;
    }
    private void imprimirValores(){
        for(int i = 0; i < 12; i++){
            if(valor[i] > calculo){
                texto += valor[i]+" ";
            }
        }
        System.out.println("Média dos valores digitados foi: "+calculo);
        System.out.println("Valores acima da média: "+texto);
    }
    public static void main(String[] args) {
        new Uni6Exe02();
    }
}
