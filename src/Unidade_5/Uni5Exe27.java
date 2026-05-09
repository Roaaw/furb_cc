package Unidade_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean exit = true;
        int dia = 0;
        int pecas = 0;
        int manha = 0;
        int tarde = 0;
        int producao = 0;
        String maiorProd = "";
        String periodoProd = "";
        float valor = 0;
        while (exit) {
            System.out.print("Dia: ");
            dia = sc.nextInt();
            if(dia <= 0 || dia >= 31){
                System.out.println("Dia inválido");
            }else{
                System.out.print("Numero de peças(Manhã): ");
                manha = sc.nextInt();
                System.out.print("Numero de peças(Tarde): ");
                tarde = sc.nextInt();
                pecas = manha + tarde;
                if(dia <= 15){
                    if(pecas >= 100 && manha >= 30 && tarde >= 30){
                        valor = (pecas * 0.80f);
                    }else{
                        valor = (pecas * 0.50f);
                    }
                }else if( dia >= 16){
                    valor = (manha * 0.40f) + (tarde * 0.30f);
                }
                if(pecas > producao || producao == 0){
                    producao = pecas;
                    maiorProd = "A maior produção ocorreu no dia "+dia+" foram produzidas "+pecas+" unidades.";
                    if(manha > tarde){
                        periodoProd = "O período mais produtivo foi o da manha.\nForam produzidas "+manha+" unidades.";
                    }else{
                        periodoProd = "O período mais produtivo foi o da tarde.\nForam produzidas "+tarde+" unidades.";
                    }
                }
                System.out.println("R$ "+df.format(valor)+"(valor recebido)");
                System.out.print("Novo funcionário? (1)SIM/(2)NÃO: ");
                dia = sc.nextInt();
                if(dia == 2){
                    exit = false;
                }
            }
        }
        System.out.println(""+maiorProd+"\n"+periodoProd);
        sc.close();
    }
}
