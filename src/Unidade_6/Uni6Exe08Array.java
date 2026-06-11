package Unidade_6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe08Array {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private int tamanho = 9; //<= 20
    // private double[] valor = new double[9];
    // private double[][] freq = new double[2][9];
    private ArrayList<Double> valor = new ArrayList<>();
    private ArrayList<Double> freq = new ArrayList<>();
    private ArrayList<Double> freq1 = new ArrayList<>();

    public Uni6Exe08Array(){
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
            // valor = new double[tamanho];
        } while (tamanho > 20);
    }
    private void entradaVetor(){
        for (int i = 0; i < tamanho; i++){
            System.out.print("Insira os valores: ");
            // valor[i] = sc.nextDouble();
            valor.add(sc.nextDouble());
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
                    if(freq.size() > 0 && freq.size() > j){
                        if(valor.get(i).equals(freq.get(j))){
                            break;
                        }
                    }else if(j == tamanho-1){
                        freq.add(valor.get(i));
                        if(freq1.size() >= 0){
                            freq1.add(1.0);
                        }
                        for (int k = i+1; k < tamanho; k++){
                            if(valor.get(i).equals(valor.get(k))){
                                freq1.set(freq.size()-1, freq1.get(freq.size()-1)+1); 
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Valor"+" | "+"Frequencia");
        for (int i = 0; i < freq.size(); i++){
            if(freq.get(i) != 0){
                if(freq.get(i) > 0){
                    System.out.printf(" "+df.format(freq.get(i))+" | %.0f",freq1.get(i));
                    System.out.println();
                }else{
                    System.out.printf(df.format(freq.get(i))+" | %.0f",freq1.get(i));
                    System.out.println();
                }
                
            }
        }
    }
    public static void main(String[] args) {
        new Uni6Exe08Array();
    }
}
