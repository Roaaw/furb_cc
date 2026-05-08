package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat grms = new DecimalFormat("0.000");
        DecimalFormat clk = new DecimalFormat("0");
        float tempo = 0;
        float massa = 0;
        float initmassa;
        boolean exit = true;
        String text = "";
        System.out.print("Insira a massa inicial em Kg: ");
        massa = sc.nextFloat();
        initmassa = massa;
        massa *= 1000;
        while (exit) {
            if(massa == initmassa){
                text += "Massa inicial: "+df.format(massa)+"Kg";
            }
            massa /= 2;
            if(massa <= 0.5f){
                tempo+= 50;
                text += "\nMassa final: "+grms.format(massa)+" gramas";
                if(tempo % 60 != 0){
                    text += "\nTempo: "+clk.format(tempo / 60)+" min"+clk.format(tempo % 60)+" seg";
                }else{
                    text+= "\nTempo: "+clk.format(tempo / 60)+" min";
                }
                System.out.println(tempo);
                exit = false; 
            }
            tempo+= 50;
        }
        sc.close();
        System.out.println(text);
    }
}
