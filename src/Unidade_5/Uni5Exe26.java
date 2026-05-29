package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe26 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private DecimalFormat km = new DecimalFormat("0");
    private float valorPedagio = 0;
    private float distancia = 0;
    private float maxValor = 0;
    private int qntd = 0;
    private int dist = 0;
    private int negado = 0;
    private String text = "Pedágio"+"   Distância";
    private boolean exit = true;

    public Uni5Exe26(){
        logica();
    }
    private void entrade(){
        System.out.print("Valor maximo disposto a pagar em pedágio: ");
        maxValor = sc.nextFloat();
    }
    private void logica(){
        entrade();
        while (exit) {
            System.out.print("Valor pedágio: ");
            valorPedagio = sc.nextFloat();
            if(valorPedagio <= -1){
                exit = false;
                break;
            }
            System.out.print("Distância: ");
            distancia = sc.nextFloat();
            qntd++;
            if(valorPedagio <= maxValor){
                text += "\n"+df.format(valorPedagio)+"      "+km.format(distancia);
                if(distancia >= 150){
                    dist++;
                }
            }else if(valorPedagio >= maxValor){
                negado++;
            }
        }
        text += "\nQuantidade de trechos informados: "+qntd+"\nTrechos acima de 150km dentro do valor desejado: "+dist+"\nTrechos fora do valor desejado: "+negado;
        imprimir();
    }
    private void imprimir(){
        if(text.equals("Pedágio"+"   Distância")){

        }else{
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        new Uni5Exe26();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // DecimalFormat km = new DecimalFormat("0");
        // float valorPedagio = 0;
        // float distancia = 0;
        // float maxValor = 0;
        // int qntd = 0;
        // int dist = 0;
        // int negado = 0;
        // String text = "Pedágio"+"   Distância";
        // boolean exit = true;
        // System.out.print("Valor maximo disposto a pagar em pedágio: ");
        // maxValor = sc.nextFloat();
        // while (exit) {
        //     System.out.print("Valor pedágio: ");
        //     valorPedagio = sc.nextFloat();
        //     if(valorPedagio <= -1){
        //         exit = false;
        //         break;
        //     }
        //     System.out.print("Distância: ");
        //     distancia = sc.nextFloat();
        //     qntd++;
        //     if(valorPedagio <= maxValor){
        //         text += "\n"+df.format(valorPedagio)+"      "+km.format(distancia);
        //         if(distancia >= 150){
        //             dist++;
        //         }
        //     }else if(valorPedagio >= maxValor){
        //         negado++;
        //     }
        // }
        // text += "\nQuantidade de trechos informados: "+qntd+"\nTrechos acima de 150km dentro do valor desejado: "+dist+"\nTrechos fora do valor desejado: "+negado;
        // if(text.equals("Pedágio"+"   Distância")){

        // }else{
        //     System.out.println(text);
        // }
        // sc.close();
    }
}
