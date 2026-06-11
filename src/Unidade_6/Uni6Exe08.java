package Unidade_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe08 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private int tamanho = 9; //<= 20
    private double[] valor = new double[9];
    private double[][] freq = new double[2][9];

    public Uni6Exe08(){
        tamVetor();
        entradaVetor();
        checarVetor();
    }
    private void tamVetor(){
        do {
            if(tamanho > 20){
                System.out.println("Digite um valor menor que 20.");
            }
            System.out.print("Tamanho Vetor: ");
            tamanho = sc.nextInt();
            valor = new double[tamanho];
        } while (tamanho > 20);
    }
    private void entradaVetor(){
        for (int i = 0; i < tamanho; i++){
            System.out.print("Insira os valores: ");
            valor[i] = sc.nextDouble();
        }
        // valor[0] = 2.1f;
        // valor[1] = 3.7f;
        // valor[2] = -4.2f;
        // valor[3] = 2.1f;
        // valor[4] = 3.75f;
        // valor[5] = -4.2f;
        // valor[6] =  2.1f;
        // valor[7] = 7f;
        // valor[8] = 7f;
    }
    private void checarVetor(){
        for (int i = 0; i < tamanho; i++){
            if(i+1 >= tamanho){
                break;
            }else{
                for (int j = 0; j < tamanho; j++){
                    if(valor[i] == freq[0][j]){
                        break;
                    }else if(j == tamanho-1){
                        freq[0][i] = valor[i];
                        if(freq[1][i] == 0){
                            freq[1][i] = 1;
                        }
                        for (int k = i+1; k < tamanho; k++){
                            if(freq[0][i] == valor[k]){
                                freq[1][i] += 1; 
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Valor"+" | "+"Frequencia");
        for (int i = 0; i < tamanho; i++){
            if(freq[0][i] != 0){
                if(freq[0][i] > 0){
                    System.out.printf(" "+df.format(freq[0][i])+" | %.0f",freq[1][i]);
                    System.out.println();
                }else{
                    System.out.printf(df.format(freq[0][i])+" | %.0f",freq[1][i]);
                    System.out.println();
                }
                
            }
        }
    }
    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
