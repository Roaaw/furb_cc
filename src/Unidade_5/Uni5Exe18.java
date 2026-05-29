package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe18 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private boolean exit = true;
    private int canal = 0;
    private float canal4 = 0;
    private float canal5 = 0;
    private float canal9 = 0;
    private float canal12 = 0;
    private float soma = 0;

    public Uni5Exe18(){
        logica();
    }
    private void entrada(){
        System.out.print("Canais 4, 5, 9, 12\nInsira o canal: ");
        canal = sc.nextInt();
    }
    private void logica(){
        while (exit) {
            entrada();
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
        imprimir();
    }
    private void imprimir(){
        if(soma == 0){
            System.out.println("Pesquisa não efetuada.");
        }else{
            System.out.println("Percentual de audiência do canal 4: "+df.format((canal4 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 5: "+df.format((canal5 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 9: "+df.format((canal9 / soma) * 100)+"%");
            System.out.println("Percentual de audiência do canal 12: "+df.format((canal12 / soma) * 100)+"%");    
        }
    }
    public static void main(String[] args) {
        new Uni5Exe18();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // boolean exit = true;
        // int canal = 0;
        // float canal4 = 0;
        // float canal5 = 0;
        // float canal9 = 0;
        // float canal12 = 0;
        // float soma = 0;
        // while (exit) {
        //     System.out.print("Canais 4, 5, 9, 12\nInsira o canal: ");
        //     canal = sc.nextInt();
        //     switch (canal) {
        //         case 4:
        //             canal4++;
        //             break;
        //         case 5:
        //             canal5++;
        //             break;
        //         case 9:
        //             canal9++;
        //             break;
        //         case 12:
        //             canal12++;
        //             break;
        //         case 0:
        //             exit = false;
        //             break;
            
        //         default:
        //             System.out.println("Digite um canal válido: 4, 5 ,9 ou 12");
        //             break;
        //     }
        // }
        // soma = (canal4+canal5+canal9+canal12);
        // if(soma == 0){
        //     System.out.println("Pesquisa não efetuada.");
        // }else{
        //     System.out.println("Percentual de audiência do canal 4: "+df.format((canal4 / soma) * 100)+"%");
        //     System.out.println("Percentual de audiência do canal 5: "+df.format((canal5 / soma) * 100)+"%");
        //     System.out.println("Percentual de audiência do canal 9: "+df.format((canal9 / soma) * 100)+"%");
        //     System.out.println("Percentual de audiência do canal 12: "+df.format((canal12 / soma) * 100)+"%");    
        // }
        // sc.close();
    }
}
