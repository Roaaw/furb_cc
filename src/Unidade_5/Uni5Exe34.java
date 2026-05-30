package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private boolean exit = false;
    private int menu = 0;
    private String nomeH = "";
    private int numDiarias = 0;
    private float calculo = 0;
    private String text = "";
    private int contador = 0;

    public Uni5Exe34(){
        logica();
    }
    private void entrada(){
        System.out.println("1- Encerrar a conta de um hóspede\n2- Verificar número de contas encerradas\n3- Sair");
        menu = sc.nextInt();
    }
    private void logica(){
        do {
            entrada();
            switch (menu) {
                case 1:
                    System.out.print("Informe o nome do hóspede: ");
                    nomeH = sc.next();
                    sc.nextLine();
                    System.out.print("Informe o número de diárias: ");
                    numDiarias = sc.nextInt();
                    contador++;
                    imprimirEncerrarConta();
                    break;
                case 2:
                    imprimirVerificar();
                    break;
                case 3:
                    exit = true;
                    break;
            
                default:
                    break;
            }
        } while (!exit);
    }
    private void imprimirEncerrarConta(){
        if(numDiarias < 15){
            calculo = (50 + 7.50f) * numDiarias;
            text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        }else if(numDiarias == 15){
            calculo = (50 + 6.50f) * numDiarias;
            text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        }else if(numDiarias > 15){
            calculo = (50 + 5.00f) * numDiarias;
            text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        }
        System.out.println(text);
    }
    private void imprimirVerificar(){
        System.out.println("Número de contas encerradas: "+contador);
    }
    public static void main(String[] args) {
        new Uni5Exe34();
        // Scanner sc = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("0.00");
        // boolean exit = false;
        // int menu = 0;
        // String nomeH = "";
        // int numDiarias = 0;
        // float calculo = 0;
        // String text = "";
        // int contador = 0;
        // do {
        //     System.out.println("1- Encerrar a conta de um hóspede\n2- Verificar número de contas encerradas\n3- Sair");
        //     menu = sc.nextInt();
        //     switch (menu) {
        //         case 1:
        //             System.out.print("Informe o nome do hóspede: ");
        //             nomeH = sc.next();
        //             sc.nextLine();
        //             System.out.print("Informe o número de diárias: ");
        //             numDiarias = sc.nextInt();
        //             contador++;
        //             if(numDiarias < 15){
        //                 calculo = (50 + 7.50f) * numDiarias;
        //                 text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        //             }else if(numDiarias == 15){
        //                 calculo = (50 + 6.50f) * numDiarias;
        //                 text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        //             }else if(numDiarias > 15){
        //                 calculo = (50 + 5.00f) * numDiarias;
        //                 text = "Nome: "+nomeH+" total a pagar: R$"+df.format(calculo)+"\n";
        //             }
        //             System.out.println(text);
        //             break;
        //         case 2:
        //             System.out.println("Número de contas encerradas: "+contador);
        //             break;
        //         case 3:
        //             exit = true;
        //             break;
            
        //         default:
        //             break;
        //     }
        // } while (!exit);
        // sc.close();
    }
}
