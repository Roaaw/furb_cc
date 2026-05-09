package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat km = new DecimalFormat("0");
        float valorPedagio = 0;
        float distancia = 0;
        float maxValor = 0;
        int qntd = 0;
        int dist = 0;
        int negado = 0;
        String text = "Pedágio"+"   Distância";
        boolean exit = true;
        System.out.print("Valor maximo disposto a pagar em pedágio: ");
        maxValor = sc.nextFloat();
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
        if(text.equals("Pedágio"+"   Distância")){

        }else{
            System.out.println(text);
        }
        sc.close();
    }
}
