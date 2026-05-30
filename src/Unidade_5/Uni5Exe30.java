package Unidade_5;

import java.util.Scanner;

public class Uni5Exe30 {
    private Scanner sc = new Scanner(System.in);
    private int n,k;
    private int m = 10;
    private int somaEntra = 0;
    private int somaFora = 0;
    private String entrou = "";
    private String fora = "";
    private String aEntrar = "";

    private Uni5Exe30(){
        logica();
    }
    private void entrada(){
        System.out.print("");
        n = sc.nextInt();
        System.out.print("");
        k = sc.nextInt();
    }
    private void logica(){
        entrada();
        int valorAtual = n;
        int capacidadeRestante = m;
        int temp = n;
        while(temp > 0){
            if(aEntrar.equals("")){
                aEntrar += temp;
            }else{
                aEntrar += "," + temp;
            }
            temp -= k;
        }
        while (valorAtual > 0) {
            if(capacidadeRestante - valorAtual >= 0){
                capacidadeRestante -= valorAtual;
                if(entrou.equals("")){
                    entrou += valorAtual;
                }else{
                    entrou += "," + valorAtual;
                }
                somaEntra += valorAtual;
            }else{
                if(fora.equals("")){
                    fora += valorAtual;
                }else{
                    fora += "," + valorAtual;
                }
                somaFora += valorAtual;
            }
            valorAtual -= k;
        }
        imprimir();
    }
    private void imprimir(){
        System.out.println("Elementos a serem colocados na mochila (sequência): " + aEntrar);
        System.out.println("Elementos que entraram na mochila: " + entrou);
        System.out.println("Elementos que ficaram fora da mochila: " + fora);
        System.out.println("Soma dos elementos que entraram: " + somaEntra);
        System.out.println("Soma dos elementos que ficaram fora: " + somaFora);
        // System.out.println("Elementos que entraram na mochila: "+aentrar+"\nElementos que ficaram de fora na mochila: "+fora+"\nElementos a entrar mochila: "+entrou+"\nSoma dos elementos que entraram na mochila: "+somaentra+"\nSoma dos elementos que ficaram de fora na mochila: "+somafora);
    }
    public static void main(String[] args) {
        new Uni5Exe30();
    }
}
