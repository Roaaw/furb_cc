package Unidade_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");//pos 0
        nomes.add(0, "Ze");//move Joao para pos 1 e ocupa pos 0
        nomes.add("a");
        sc.close();
    }
}
