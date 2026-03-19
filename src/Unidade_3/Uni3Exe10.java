package Unidade_3;

import java.util.Scanner;

public class Uni3Exe10 {
    private double cateto1;
    private double cateto2;

    public Uni3Exe10(double cateto1, double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2; 
    }

    public double hipotenusa(){
        return Math.hypot(this.cateto1, this.cateto2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o cateto oposto:");
        float cateto1 = sc.nextFloat();
        System.out.print("Insira o cateto adjacente:");
        float cateto2 = sc.nextFloat();
        Uni3Exe10 classExec = new Uni3Exe10(cateto1, cateto2);
        System.out.printf("A hipotenusa é: %.2f", classExec.hipotenusa());
        sc.close();
    }
}
/*
TESTE 1
Insira o cateto oposto:3
Insira o cateto adjacente:4
A hipotenusa é: 5,00

TESTE 2
Insira o cateto oposto:5
Insira o cateto adjacente:12
A hipotenusa é: 13,00

TESTE 3
Insira o cateto oposto:8 
Insira o cateto adjacente:20
A hipotenusa é: 21,54

*/