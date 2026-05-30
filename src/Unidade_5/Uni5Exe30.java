package Unidade_5;

import java.util.Scanner;

public class Uni5Exe30 {
    private Uni5Exe30(){
        
    }
    private void entrada(){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int n,k;
        int m = 10;
        int somaentra = 0;
        int somafora = 0;
        String entrou = "";
        String fora = "";
        String aentrar = "";
        n = sc.nextInt();
        k = sc.nextInt();
        while(!exit){
            if(m - n >= 0 && n > 0){
                m -= n;
                if(entrou.equals("")){
                    entrou += n;
                }else{
                    entrou += ","+n;
                }
                somaentra += n;
                if(aentrar.equals("")){
                    aentrar += n;
                }else{
                    aentrar += ","+n;
                }
                n -= k;
            }else if (m == 0 && n > 0){
                if(fora.equals("")){
                    fora += n;
                }else{
                    fora += ","+n;
                }
                if(aentrar.equals("")){
                    aentrar += n;
                }else{
                    aentrar += ","+n;
                }
                somafora += n;
                n -= k;
            }else{
                exit = true;
            }
            
        }
        System.out.println("Elementos que entraram na mochila: "+entrou+"\nElementos que ficaram de fora na mochila: "+fora+"\nElementos a entrar mochila: "+aentrar+"\nSoma dos elementos que entraram na mochila: "+somaentra+"\nSoma dos elementos que ficaram de fora na mochila: "+somafora);
        sc.close();
    }
}
