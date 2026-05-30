package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    private Scanner sc = new Scanner(System.in);
    private String decimalF = "";
    private DecimalFormat df = new DecimalFormat(verfDecimal(decimalF));
    private boolean exit = true;
    private double codigo = 0;
    private double codUm = 0;
    private double codDois = 0;
    private double codTres = 0;
    private double codQuat = 0;
    private String text = "";
    private char confirmar;
    
    public Uni5Exe28(){
        logica();
    }
    private void entrada(){
        System.out.print("1- Nenhum de Nós | 2- CPM22 | 3- Skank | 4- Jota Quest\nEscolha uma das opções acima: ");
        codigo = sc.nextFloat();
    }
    private void logica(){
        while (exit) {
            entrada();
            switch ((int)codigo) {
                case 1:
                   codUm++ ;
                   confirma();
                    continue;
                case 2:
                    codDois++;
                    confirma();
                    continue;
                case 3:
                    codTres++;
                    confirma();
                    continue;
                case 4:
                    codQuat++;
                    confirma();
                    continue;
            
                default:
                    System.out.println("Erro! Informe uma das opções abaixo.");
                    break;
            }
        }
        codigo = (codUm+codDois+codTres+codQuat);
        imprimir();
    }
    private void entrada2(){
        System.out.println("Mais um voto: S (SIM) / N (NÃO)?");
        confirmar = sc.next().toUpperCase().charAt(0);
    }
    private void confirma(){
        entrada2();
        switch ((confirmar)) {
            case 'S':
                exit = true;
                break;
            case 'N':
                exit = false;
                break;
        
            default:
                break;
        }
    }
    private String verfDecimal(String decimalF){
        if(((codUm / codigo) * 100) % 2 > 1 && ((codUm / codigo) * 100) % 2 < 2 || ((codDois / codigo) * 100) % 2 > 1 && ((codDois / codigo) * 100) % 2 < 2 || ((codTres / codigo) * 100) % 2 > 1 && ((codTres / codigo) * 100) % 2 < 2 || ((codQuat / codigo) * 100) % 2 > 1 && ((codQuat / codigo) * 100) % 2 < 2){
            decimalF = "0.00";
        }else{
            decimalF = "0";
        }
        return decimalF;
    }
    private void imprimir(){
        if(codigo == 0){
            System.out.println("Pesquisa não efetuada.");
        }else{
            text += "Votação encerrada!\nTotal de votos: "+codigo+"\n";
            text += "Nenhum de nós recebeu: "+df.format((codUm / codigo) * 100)+" % dos votos.\n";
            text += "CPM22 recebeu: "+df.format((codDois / codigo) * 100)+" % dos votos.\n";
            text += "Skank recebeu: "+df.format((codTres / codigo) * 100)+" % dos votos.\n";
            text += "Jota Quest recebeu: "+df.format((codQuat / codigo) * 100)+" % dos votos.\n";
            if(codUm > codDois && codDois > codTres && codTres > codQuat){
                    text += "Nenhum de nós venceu!";
                }else if(codDois > codTres && codTres > codQuat && codQuat > codUm){
                    text += "CPM22 venceu!";
                }else if(codTres > codQuat && codQuat > codUm && codUm > codDois){
                    text += "Skank venceu!";
                }else if (codQuat > codUm && codUm > codDois && codDois > codTres){
                    text += "Jota Quest venceu!";
                }
            System.out.println(text);
        }
    }
    public static void main(String[] args) {
        new Uni5Exe28();
        // Scanner sc = new Scanner(System.in);
        // String decimalF = "";
        // DecimalFormat df = new DecimalFormat(decimalF);
        // boolean exit = true;
        // double codigo = 0;
        // double codUm = 0;
        // double codDois = 0;
        // double codTres = 0;
        // double codQuat = 0;
        // String text = "";
        
        // while (exit) {
        //     System.out.print("1- Nenhum de Nós | 2- CPM22 | 3- Skank | 4- Jota Quest\nEscolha uma das opções acima: ");
        //     codigo = sc.nextFloat();
        //     switch ((int)codigo) {
        //         case 1:
        //            codUm++ ;
        //             continue;
        //         case 2:
        //             codDois++;
        //             continue;
        //         case 3:
        //             codTres++;
        //             continue;
        //         case 4:
        //             codQuat++;
        //             continue;
        //         case 0:
        //             exit = false;
        //             break;
            
        //         default:
        //             System.out.println("Erro! Informe uma das opções abaixo.");
        //             break;
        //     }
        // }
        // codigo = (codUm+codDois+codTres+codQuat);
        // if(((codUm / codigo) * 100) % 2 > 1 && ((codUm / codigo) * 100) % 2 < 2 || ((codDois / codigo) * 100) % 2 > 1 && ((codDois / codigo) * 100) % 2 < 2 || ((codTres / codigo) * 100) % 2 > 1 && ((codTres / codigo) * 100) % 2 < 2 || ((codQuat / codigo) * 100) % 2 > 1 && ((codQuat / codigo) * 100) % 2 < 2){
        //     decimalF = "0.00";
        // }else{
        //     decimalF = "0";
        // }
        // if(codigo == 0){
        //     System.out.println("Pesquisa não efetuada.");
        // }else{
        //     text += "Votação encerrada!\nTotal de votos: "+codigo+"\n";
        //     text += "Nenhum de nós recebeu: "+df.format((codUm / codigo) * 100)+" % dos votos.\n";
        //     text += "CPM22 recebeu: "+df.format((codDois / codigo) * 100)+" % dos votos.\n";
        //     text += "Skank recebeu: "+df.format((codTres / codigo) * 100)+" % dos votos.\n";
        //     text += "Jota Quest recebeu: "+df.format((codQuat / codigo) * 100)+" % dos votos.\n";
        //     if(codUm > codDois && codDois > codTres && codTres > codQuat){
        //             text += "Nenhum de nós venceu!";
        //         }else if(codDois > codTres && codTres > codQuat && codQuat > codUm){
        //             text += "CPM22 venceu!";
        //         }else if(codTres > codQuat && codQuat > codUm && codUm > codDois){
        //             text += "Skank venceu!";
        //         }else if (codQuat > codUm && codUm > codDois && codDois > codTres){
        //             text += "Jota Quest venceu!";
        //         }
        //     System.out.println(text);
        //     sc.close();
        // }
    }
}