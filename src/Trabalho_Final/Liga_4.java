package Trabalho_Final;

import java.util.Scanner;

public class Liga_4 {
    private Scanner sc = new Scanner(System.in);
    private char[][] tabuleiro = new char[6][7];
    private char[] playerCor = new char[2];
    private char opcaoMenu;
    private int coluna = Integer.MIN_VALUE;
    private boolean loopMenu = true;
    private int[] sequencia = new int[2];
    private int jogadas = 0;
    private boolean vencedor = false;
    private String[] playerName = new String[2];
    private int turnos = 0;

    public Liga_4(){
        do {
            System.out.print("1-Jogar\n2-Sair\nEscolha: ");
            opcaoMenu = sc.next().toUpperCase().charAt(0);
            switch (opcaoMenu) {
                case '1':
                    resetVar();
                    iniciarTabuleiro();
                    menuPlayerCor();
                    iniciarJogo();
                    break;
                case '2':
                    System.out.println("Encerrando . . .");
                    break;
            
                default:
                    System.out.println("Erro");
                    break;
            }
        } while (opcaoMenu != '2');
    }
    private void iniciarJogo(){
        // tabuleiro[5][0] = 'V';
        // tabuleiro[4][1] = 'V';
        // tabuleiro[3][2] = 'V';
        // tabuleiro[2][3] = 'V';
        do {
            if(turnos % 2 == 0){
                imprimirTabuleiro();
                playerSelect();
                turnos++;
                System.out.println();
                System.out.println();
            }else{
                imprimirTabuleiro();
                botSelect();
                turnos++;
                System.out.println();
                System.out.println();
            }
            jogadas++;
            if(jogadas >=4){
                // verificaVencedorLinha();
                // verificaVencedorColuna();
                verifcaVencedorDiagonal();
            }
        } while (vencedor != true);
    }
//Inicia Vetor Tabuleiro e Preenche com "B"
    private void iniciarTabuleiro(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                tabuleiro[i][j] = 'B';
            }
        }
    }
//Imprime Tabuleiro
    private void imprimirTabuleiro(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(tabuleiro[i][j]+" ");
            }
            System.out.println();
        }
    }
//Seleção de Cor
    private void menuPlayerCor(){
        do {
            System.out.print("\nMenu:\n(V)Vermelho/(A)Azul\nEscolha uma cor: ");
            opcaoMenu = sc.next().toUpperCase().charAt(0);
            switch (opcaoMenu) {
                case 'V':
                    playerCor[0] = 'V'; playerName[0] = "Vermelho";
                    playerCor[1] = 'A'; playerName[1] = "Azul";
                    loopMenu = false;
                    break;
                case 'A':
                    playerCor[0] = 'A'; playerName[1] = "Azul";
                    playerCor[1] = 'V'; playerName[0] = "Vermelho";
                    loopMenu = false;
                    break;
            
                default:
                    System.out.println("Erro, escolha uma das opções abaixo.");
                    break;
            }
        } while (loopMenu == true);
    }
//Verifica coluna ocupada e esta cheia
    private int verificarColuna(int playerId){
        for(int i = 5; i >= 0; i--){
            if(tabuleiro[i][(coluna-1)] == 'B'){
                tabuleiro[i][(coluna-1)] = playerCor[playerId];
                break;
            }else if(i == 0 && tabuleiro[i][(coluna-1)] != 'B'){
                System.out.println("Coluna Cheia");
                if(playerId == 0){
                    playerSelect();
                }else{
                    botSelect();
                }
                return i;
            }
        }
        return -1;
    }
//Player Joga
    private void playerSelect(){
        System.out.print("Escolha a coluna para jogar(1 a 7): ");
        coluna = sc.nextInt();
        if(coluna < 1 || coluna > 7){
            System.out.println("Out of range");
            playerSelect();
        }else{
            verificarColuna(0);
        }
    }
//Bot Joga
    private void botSelect(){
        coluna = (int)(Math.random() * 7) + 1;
        // System.out.println(coluna);
        verificarColuna(1);
    }
//Zerar sequencia
    private void zerarSequencia(){
        for(int i = 0; i < 2; i++){
            sequencia[i] = 0;
        }
    }
//Verificação de vencedor na linha
    private void verificaVencedorLinha(){
        zerarSequencia();
        for(int i = 5; i >= 0; i--){
            for(int k = 0; k < 7; k++){
                if(tabuleiro[i][k] != 'B'){
                    if(tabuleiro[i][k] == 'V'){
                        if(k > 0){
                            if(tabuleiro[i][k-1] == 'V'){
                                sequencia[0]++;
                            }else{
                                sequencia[0] = 1;
                            }
                        }else{
                            sequencia[0]++;
                        }
                        sequencia[1] = 0;
                        mensagemVitoria(0);
                        if(mensagemVitoria(-1) == 1){
                            break;
                        }
                    }else if(tabuleiro[i][k] == 'A'){
                        if(k > 0){
                            if(tabuleiro[i][k-1] == 'A'){
                                sequencia[1]++;
                            }else{
                                sequencia[1] = 1;
                            }
                        }else{
                            sequencia[1]++;
                        }
                        sequencia[0] = 0;
                        mensagemVitoria(1);
                        if(mensagemVitoria(-1) == 1){
                            break;
                        }
                    }
                }
            }
            if(mensagemVitoria(-1) == 1){
                break;
            }
            zerarSequencia();
        }
    }
//Verificação de vencedor na coluna
    private void verificaVencedorColuna(){
        zerarSequencia();
        for(int i = 0; i < 7; i++){
            for(int k = 5; k >= 0; k--){
                if(tabuleiro[k][i] != 'B'){
                    if(tabuleiro[k][i] == 'V'){
                        if(k < 5){
                            if(tabuleiro[k+1][i] == 'V'){
                                sequencia[0]++;
                            }else{
                                sequencia[0] = 1;
                            }
                        }else{
                            sequencia[0]++;
                        }
                        sequencia[1] = 0;
                        mensagemVitoria(0);
                        if(mensagemVitoria(-1) == 1){
                            break;
                        }
                    }else if(tabuleiro[k][i] == 'A'){
                        if(k < 5){
                            if(tabuleiro[k+1][i] == 'A'){
                                sequencia[1]++;
                            }else{
                                sequencia[1] = 1;
                            }
                        }else{
                            sequencia[1]++;
                        }
                        sequencia[0] = 0;
                        mensagemVitoria(1);
                        if(mensagemVitoria(-1) == 1){
                            break;
                        }
                        
                    }
                }
            }
            if(mensagemVitoria(-1) == 1){
                break;
            }
            zerarSequencia();
        }
    }
//Verificação de vencedor na diagonal
    private void verifcaVencedorDiagonal(){
        zerarSequencia();
        for(int i = 5; i >= 0; i--){
            for(int k = 0; k < 7; k++){
                if(tabuleiro[i][k] == 'V'){
                    sequencia[0]++;
                    for(int j = 1; j < 4; j++){
                        if(i < 3 && k < 3){//Verifica Diagonal Baixo > \/
                            if(tabuleiro[i+j][k-j] == 'V'){
                                System.out.println("A");
                                sequencia[0]++;
                            }
                        }else if(i > 2 && k < 3){//Verifica Diagonal Cima >/\
                            if(tabuleiro[i-j][k+j] == 'V'){
                                sequencia[0]++;
                                System.out.println("B");
                            }
                            mensagemVitoria(0);
                            if(mensagemVitoria(-1) == 1){
                                break;
                            }
                        }else if(i > 2 && k == 3){//Verifica Ambas Diagonais Cima >/\ </\
                            if(tabuleiro[i-j][k+j] == 'V'){
                                System.out.println("C");
                                sequencia[0]++;
                            }
                            if(tabuleiro[i-j][k-j] == 'V'){
                                System.out.println("D");
                                sequencia[0]++;
                            }
                        }else if(i < 3 && k == 3){//Verifica Ambas Diagonais Baixo >\/ <\/
                            if(tabuleiro[i+j][k+j] == 'V'){
                                System.out.println("C");
                                sequencia[0]++;
                            }
                            if(tabuleiro[i+j][k-j] == 'V'){
                                System.out.println("D");
                                sequencia[0]++;
                            }
                        }else if(i < 3 && k > 3){//Verifica Diagonal Baixo > \/
                            if(tabuleiro[i+j][k-j] == 'V'){
                                System.out.println("A");
                                sequencia[0]++;
                            }
                        }else if(i > 2 && k > 3){//Verifica Diagonal Cima >/\
                            if(tabuleiro[i-j][k-j] == 'V'){
                                sequencia[0]++;
                                System.out.println("B");
                            }
                        }
                    }
                    if(mensagemVitoria(-1) == 1){
                        break;
                    }
                    sequencia[0] = 0;
                }
            }
            if(mensagemVitoria(-1) == 1){
                break;
            }
        }
        zerarSequencia();
    }
    //MSG Vitoria
    private int mensagemVitoria(int playerId){
        if(sequencia[0] == 4 || sequencia[1] == 4){
            if(playerId != -1){
                System.out.println("Jogador "+playerName[playerId]+" Venceu!");
                vencedor = true;
            }
            return 1;
        }
        return -1;
    }
//reseta variaveis para o padrao
    private void resetVar(){
        zerarSequencia();
        jogadas = 0;
        vencedor = false;
        turnos = 0;
    }
    public static void main(String[] args) {
        new Liga_4();
    }
}