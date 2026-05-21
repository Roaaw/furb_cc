package Unidade_6;

import java.util.Scanner;

public class Uni6Exe05 {
    private Scanner sc = new Scanner(System.in);
    private String[] pergunta = new String[5];
    private char[] resposta = new char[5];
    private int afinidade = 0;

    public Uni6Exe05(){

    }
    private void perguntas(){
        pergunta[0] = "Gosta de música sertaneja?";
        pergunta[1] = "Gosta de futebol?";
        pergunta[2] = "Gosta de seriados?";
        pergunta[3] = "Gosta de redes sociais?";
        pergunta[4] = "Gosta de Oktoberfest?";
    }
    public static void main(String[] args) {
        System.out.println("Uni6Exe05 - implementar solução");
    }
}
