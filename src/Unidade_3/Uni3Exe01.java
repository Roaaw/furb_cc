package Unidade_3;

import java.util.Scanner;

public class Uni3Exe01 {
    private int comprimento;
    private int largura;

    public Uni3Exe01(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;    
    }

    public int terreno(int comprimento, int largura){
        return (comprimento * largura);
    }
    public static void main(String[] args) {
        Uni3Exe01 terreno = new Uni3Exe01(0,0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o comprimento do terreno: ");
        int comprimento = sc.nextInt();
        System.out.print("Insira a largura do terreno: ");
        int largura = sc.nextInt();
        int resultado = terreno.terreno(comprimento,largura);
        System.out.println("Área do terreno: "+resultado);
        sc.close();
    }
}
/*
TESTE 1
Insira o comprimento do terreno: 3
Insira a largura do terreno: 6
Área do terreno: 18

TESTE 2
Insira o comprimento do terreno: 2
Insira a largura do terreno: 18
Área do terreno: 36

TESTE 3
Insira o comprimento do terreno: 10 
Insira a largura do terreno: 30
Área do terreno: 300

*/