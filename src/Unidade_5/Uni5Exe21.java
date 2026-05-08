package Unidade_5;

import java.text.DecimalFormat;

public class Uni5Exe21 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        float alturaChico = 1.50f;
        float alturaZe = 1.10f;
        int ano = 0;
        while (alturaChico >= alturaZe) {
            alturaChico += 0.02f;
            alturaZe += 0.03f;
            ano++;
        }
        System.out.println("Altura atual de Chico: "+df.format(alturaChico)+"m\nAltura atual de Zé: "+df.format(alturaZe)+"m\n"+ano+" anos até Zé ultrapassar Chico.");
    }
}
