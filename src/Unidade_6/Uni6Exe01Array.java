package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe01Array {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> numeros = new ArrayList<>();

    public Uni6Exe01Array(){
        logica();
        output();
    }
    private void logica(){
        while (numeros.size() < 10) {  
            System.out.print("Digite o numero: ");
            numeros.add(sc.nextInt());
        }
    }
    private void output(){
        System.out.println("Números em ordem inversa a digitada:");
            System.out.println((numeros.reversed().toString().replace("[", "").replace("]", "")));
        }
    public static void main(String[] args) {
        new Uni6Exe01Array();
    }
}
