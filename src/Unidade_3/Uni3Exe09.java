package Unidade_3;

import java.util.Scanner;

public class Uni3Exe09 {
    private double raio,altura,volume;
    
    public Uni3Exe09(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }
    public double calc(double raio, double altura){
        return volume = Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Uni3Exe09 classExec = new Uni3Exe09(0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o raio: ");
        double raio = sc.nextDouble();
        System.out.print("Insira a altura: ");
        double altura = sc.nextDouble();
        double result = classExec.calc(raio,altura);
        System.out.printf("O volume da lata de óleo é: %.2f%n",result);
        sc.close();
    }
}
/*
TESTE 1
Insira o raio: 6 
Insira a altura: 10
O volume da lata de óleo é: 1130,97

TESTE 2
Insira o raio: 12
Insira a altura: 12
O volume da lata de óleo é: 5428,67

TESTE 3
Insira o raio: 3
Insira a altura: 10
O volume da lata de óleo é: 282,74

*/