package Unidade_3;

import java.util.Scanner;

public class Calculadora {
    private int num1;
    private int num2;
    //private int resultado;

    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somar(){
        return this.num1 + num2;
    }
    public int somaDoisNumeros(int n1, int n2){
        return n1+n2;
    }
    public void obterNumeros(){

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora(0, 0);
        int valor = calc.somaDoisNumeros(10, 5);
        System.out.printf("Resultado: %s%n", valor);
        valor = calc.somar();
        System.out.printf("Resultado: %s%n", valor);
        scan.close();
    }
}
