package Unidade_5;

import java.text.DecimalFormat;

public class Uni5Exe21 {
    private DecimalFormat df = new DecimalFormat("0.00");
    private float alturaChico = 1.50f;
    private float alturaZe = 1.10f;
    private int ano = 0;
    public Uni5Exe21(){
        logica();
    }
    private void logica(){
        while (alturaChico >= alturaZe) {
            alturaChico += 0.02f;
            alturaZe += 0.03f;
            ano++;
        }
        imprimir();
    }
    private void imprimir(){
        System.out.println("Altura atual de Chico: "+df.format(alturaChico)+"m\nAltura atual de Zé: "+df.format(alturaZe)+"m\n"+ano+" anos até Zé ultrapassar Chico.");
    }
    public static void main(String[] args) {
        new Uni5Exe21();
        // DecimalFormat df = new DecimalFormat("0.00");
        // float alturaChico = 1.50f;
        // float alturaZe = 1.10f;
        // int ano = 0;
        // while (alturaChico >= alturaZe) {
        //     alturaChico += 0.02f;
        //     alturaZe += 0.03f;
        //     ano++;
        // }
        // System.out.println("Altura atual de Chico: "+df.format(alturaChico)+"m\nAltura atual de Zé: "+df.format(alturaZe)+"m\n"+ano+" anos até Zé ultrapassar Chico.");
    }
}
