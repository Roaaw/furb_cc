package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat cm = new DecimalFormat("0");
        boolean exit = true;
        char comfirma;
        float limiteDiario = 150;
        float pescou = 0;
        float peso = 0;
        float pegos = 0;
        float l = 0;
        float w = 0;
        float a = 0.0278f;
        float b = 2.79f;
        float v = 0;

        while (exit) {
            System.out.println("Campeonato de pesca de pirarucu!\nLimite diario de "+df.format(limiteDiario)+" kg");
            if(limiteDiario <= peso){
                exit = false;
            }else{
                l = (int)(Math.random() * ((270 - 50) + 1) + 50);
                w = ((int)Math.pow(l, b)) * a;
                v = (int)(Math.random() * ((15f - 0) + 1));
                v = v / 100;
                pescou = (w + (w * v)) / 1000;
                System.out.print("Você pegou um pirarucu!\n   Tamanho: "+cm.format(l)+"cm\n   Peso: "+df.format(pescou)+" kg\nDeseja capturar? S(SIM)/N(NÃO): ");
                comfirma = sc.next().toLowerCase().charAt(0);
                if(comfirma == 's'){
                    peso += pescou;
                    pegos++;
                }
            }
        }
        System.out.println("Você pegou um total de "+cm.format(pegos)+" peixes.\nCom o total de "+df.format(peso)+" kg");
        sc.close();
    }
}
