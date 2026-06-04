package Unidade_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe03Array {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private double[] valores = new double[12];
    private String[] texto = new String[3];

    public Uni6Exe03Array(){
        lerValores();
        acrescimoVetor();
        escreverValores();
    }
    private void lerValores(){
        texto[0] = "";
        for(int i = 0; i < 12; i++){
            System.out.print("Digite um valor: ");
            valores[i] = sc.nextDouble();
            texto[0] += "Valor"+(i+1)+" = "+df.format(valores[i])+"\n";
        }
    }
    private void acrescimoVetor(){
        texto[1] = "";
        texto[2] = "";
        for(int i = 0; i < 12; i++){
            if(i % 2 == 0){
                valores[i] += valores[i] * 0.05f;
                texto[1] += "Valor"+i+" = "+df.format(valores[i])+"\n";
            }else if(i % 2 != 0){
                valores[i] += valores[i] * 0.02f;
                texto[2] += "Valor"+i+" = "+df.format(valores[i])+"\n";
            }
        }
    }
    private void escreverValores(){
        System.out.println("Valores digitados: "+texto[0]);
        System.out.println("Valores com + 5%: "+texto[1]);
        System.out.println("Valores com + 2%: "+texto[2]);
        for (Double item : valores) {
            System.out.println("Valores Atualizados: "+df.format(item));
        }
    }
    public static void main(String[] args) {
        new Uni6Exe03Array();
    }
}
