package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean exit = true;
        int canal = 0;
        float canal4 = 0;
        float canal5 = 0;
        float canal9 = 0;
        float canal12 = 0;
        float soma = 0;
        while (exit) {
            System.out.print("Canais 4, 5, 9, 12\nInsira o canal: ");
            canal = sc.nextInt();
            switch (canal) {
                case 4:
                    canal4++;
                    break;
                case 5:
                    canal5++;
                    break;
                case 9:
                    canal9++;
                    break;
                case 12:
                    canal12++;
                    break;
                case 0:
                    exit = false;
                    break;
            
                default:
                    System.out.println("Digite um canal válido: 4, 5 ,9 ou 12");
                    break;
            }
        }
        soma = (canal4+canal5+canal9+canal12);
        if(soma == 0){
            System.out.println("Pesquisa não efetuada.");
        }else{
            System.out.println("Percentual de audiência do canal 4: "+df.format((canal4 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 5: "+df.format((canal5 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 9: "+df.format((canal9 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 12: "+df.format((canal12 / soma) * 100)+"%");    
        }
        sc.close();
    }
}
