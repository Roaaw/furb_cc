package Unidade_6;

import java.util.Scanner;

public class Uni6Exe05Array {
    private Scanner sc = new Scanner(System.in);
    private String[][] pergunta = new String[2][6];
    private char[][] resposta = new char[2][5];
    private int afinidade = 0;

    public Uni6Exe05Array(){
    }
    private String perguntas(int p){
        pergunta[0][0] = "Gosta de música sertaneja?";
        pergunta[0][1] = "Gosta de futebol?";
        pergunta[0][2] = "Gosta de seriados?";
        pergunta[0][3] = "Gosta de redes sociais?";
        pergunta[0][4] = "Gosta de Oktoberfest?";
        return pergunta[0][p];
    }
    private String resultadoPerguntas(int r){
        pergunta[1][0] = "Casem!";
        pergunta[1][1] = "Vocês têm muita coisa em comum!";
        pergunta[1][2] = "Talvez não dê certo :(";
        pergunta[1][3] = "Valem um encontro.";
        pergunta[1][4] = "Melhor não perder tempo";
        pergunta[1][5] = "Vocês se odeiam!";
        return pergunta[1][r];
    }
    private void resultado(){
        if(afinidade >= 15){
            System.out.println(resultadoPerguntas(0));
        }else if(afinidade >= 10 && afinidade <= 14){
            System.out.println(resultadoPerguntas(1));
        }else if(afinidade >= 5 && afinidade <= 9){
            System.out.println(resultadoPerguntas(2));
        }else if(afinidade >= 0 && afinidade <= 4){
            System.out.println(resultadoPerguntas(3));
        }else if(afinidade >= -1 && afinidade <= -9){
            System.out.println(resultadoPerguntas(4));
        }else if(afinidade >= -10){
            System.out.println(resultadoPerguntas(5));
        }
    }
    private void resposta(){
        for(int i = 0; i < 2; i++){
            String pessoa = "";
            if(i == 0){
                pessoa = "A";
            }else{
                pessoa = "B";
            }
            System.out.printf("Pessoa %s responda as 5 perguntas com Sim(S)/Nâo(N)/Indiferente(I)\n",pessoa);
            for(int j = 0; j < 5; j++){
                System.out.println(perguntas(j));
                resposta[i][j] = sc.next().toUpperCase().charAt(0);
            }
        }
    }
    private void pontuacao(){
        for(int i = 0; i < 5; i++){
            if(resposta[0][i] == resposta[1][i]){
                afinidade += 3;
            }else if(resposta[0][i] == 'I' || resposta[1][i] == 'I'){
                afinidade += 1;
            }else if (resposta[0][i] != resposta[1][i]){
                afinidade -= 2;
            }
        }
    }
    public static void main(String[] args) {
        Uni6Exe05Array init = new Uni6Exe05Array();
        init.resposta();
        init.pontuacao();
        init.resultado();

    }
}
