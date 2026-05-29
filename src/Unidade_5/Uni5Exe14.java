package Unidade_5;

import java.util.Scanner;

public class Uni5Exe14 {
    private String np;
    private float pc,pv,ll;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private float pct = 0;
    private float pvt = 0;
    private float llt = 0;
    private Scanner sc = new Scanner(System.in);
    private int n;

    public Uni5Exe14(){
        entrada();
        logica();
        imprimir();
    }

    private void entrada(){
        System.out.print("Insira a quantidade de produtos que serão inseridos: ");
        n = sc.nextInt();
    }
    private void logica(){
        for(int i=0; i<=(n-1); i++){
            System.out.print("Nome do produto: ");
            np = sc.next().toUpperCase();
            sc.nextLine();
            System.out.print("Preço de compra: ");
            pc = sc.nextFloat();
            System.out.print("Preço de venda: ");
            pv = sc.nextFloat();
            ll = (pv - pc) / pc * 100;
            if(ll < 10){
                a++;
            }else if(ll >= 10 && ll <=20){
                b++;
            }else if(ll > 20){
                c++;
            }
            pct += pc;
            pvt += pv;
            llt += ll;
        }
    }
    private void imprimir(){
        System.out.print("Você tem "+a+" produto(s) com no minimo 10% de lucro.\nVocê tem "+b+" produto(s) entre 10% a 20% de lucro.\nVocê tem "+c+" produto(s) com mais de 20% de lucro.\nValor de compra total: "+pct+"\nValor de venda total: "+pvt+"\nLucro total: "+llt);
    }
    public static void main(String[] args) {
        new Uni5Exe14();
        // String np;
        // float pc,pv,ll;
        // int a = 0;
        // int b = 0;
        // int c = 0;
        // float pct = 0;
        // float pvt = 0;
        // float llt = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Insira a quantidade de produtos que serão inseridos: ");
        // int n = sc.nextInt();
        // for(int i=0; i<=(n-1); i++){
        //     System.out.print("Nome do produto: ");
        //     np = sc.next().toUpperCase();
        //     sc.nextLine();
        //     System.out.print("Preço de compra: ");
        //     pc = sc.nextFloat();
        //     System.out.print("Preço de venda: ");
        //     pv = sc.nextFloat();
        //     ll = (pv - pc) / pc * 100;
        //     if(ll < 10){
        //         a++;
        //     }else if(ll >= 10 && ll <=20){
        //         b++;
        //     }else if(ll > 20){
        //         c++;
        //     }
        //     pct += pc;
        //     pvt += pv;
        //     llt += ll;
        // }
        // System.out.print("Você tem "+a+" produto(s) com no minimo 10% de lucro.\nVocê tem "+b+" produto(s) entre 10% a 20% de lucro.\nVocê tem "+c+" produto(s) com mais de 20% de lucro.\nValor de compra total: "+pct+"\nValor de venda total: "+pvt+"\nLucro total: "+llt);
        // sc.close();
    }
}