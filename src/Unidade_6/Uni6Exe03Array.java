package Unidade_6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe03Array {
    private Scanner sc = new Scanner(System.in);
    private DecimalFormat df = new DecimalFormat("0.00");
    private ArrayList<Double> valores = new ArrayList<>();
    private ArrayList<String> texto = new ArrayList<>();

    public Uni6Exe03Array(){
        lerValores();
        acrescimoVetor();
        escreverValores();
    }
    private void lerValores(){
        for(int i = 0; i < 12; i++){
            System.out.print("Digite um valor: ");
            valores.add(sc.nextDouble());
            if(texto.size() >= 1){
                texto.set(0, texto.get(0)+"Valor"+i+" = "+df.format(valores.get(i))+"\n");
            }else{
                texto.add("Valor"+(i+1)+" = "+df.format(valores.get(i))+"\n");
            }
        }
    }
    private void acrescimoVetor(){
        for(int i = 0; i < 12; i++){
            if(i % 2 == 0){
                valores.set(i, valores.get(i)+(valores.get(i) * 0.05f));
                if(texto.size() >= 2){
                    texto.set(1, texto.get(1)+"Valor"+i+" = "+df.format(valores.get(i))+"\n");    
                }else{
                    texto.add(1, "Valor"+i+" = "+df.format(valores.get(i))+"\n");
                }
            }else if(i % 2 != 0){
                valores.set(i, valores.get(i)+(valores.get(i) * 0.02f));
                if(texto.size() >= 3){
                    texto.set(2, texto.get(2)+"Valor"+i+" = "+df.format(valores.get(i))+"\n");
                }else{
                    texto.add(2, "Valor"+i+" = "+df.format(valores.get(i))+"\n");
                }
            }
        }
    }
    private void escreverValores(){
        System.out.println("Valores digitados: \n"+texto.get(0));
        System.out.println("Valores com + 5%: \n"+texto.get(1));
        System.out.println("Valores com + 2%: \n"+texto.get(2));
        System.out.println("Valores Atualizados: ");
        for (Double item : valores) {
            System.out.println(df.format(item));
        }
    }
    public static void main(String[] args) {
        new Uni6Exe03Array();
    }
}
