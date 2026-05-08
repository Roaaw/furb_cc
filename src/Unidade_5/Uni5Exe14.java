package Unidade_5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        String np;
        float pc,pv,ll;
        int a = 0;
        int b = 0;
        int c = 0;
        float pct = 0;
        float pvt = 0;
        float llt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de produtos que serão inseridos: ");
        int n = sc.nextInt();
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
        System.out.print("Você tem "+a+" produto(s) com no minimo 10% de lucro.\nVocê tem "+b+" produto(s) entre 10% a 20% de lucro.\nVocê tem "+c+" produto(s) com mais de 20% de lucro.\nValor de compra total: "+pct+"\nValor de venda total: "+pvt+"\nLucro total: "+llt);
        sc.close();
    }
}