package Trabalho_Final;

import java.util.Scanner;

public class Liga_4 {
    private Scanner sc = new Scanner(System.in);
    private char[][] tabuleiro = new char[6][7];
    private char[] playerCor = new char[2];
    private char opcaoMenu;
    private int coluna = Integer.MIN_VALUE;
    private boolean loopMenu = true;
    private int[] sequencia = new int[3];
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
        do {
            if(turnos % 2 == 0){
                verificaTabuleiroCheio();
                if(vencedor != true){
                    imprimirTabuleiro();
                    playerSelect(0);
                }
                turnos++;
                System.out.println();
                System.out.println();
                if(jogadas >=4){
                verificaVencedorLinha(0);
                verificaVencedorColuna(0);
                filtroDiagonal(0);
                }
            }else{
                verificaTabuleiroCheio();
                if(vencedor != true){ 
                    imprimirTabuleiro();
                    botSelect();
                }
                turnos++;
                System.out.println();
                System.out.println();
                if(jogadas >=4){
                verificaVencedorLinha(1);
                verificaVencedorColuna(1);
                filtroDiagonal(1);
                }
            }
            jogadas++;
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
                    playerCor[0] = 'A'; playerName[0] = "Azul";
                    playerCor[1] = 'V'; playerName[1] = "Vermelho";
                    loopMenu = false;
                    break;
            
                default:
                    System.out.println("Erro, escolha uma das opções abaixo.");
                    break;
            }
        } while (loopMenu == true);
    }
//Verifica coluna ocupada e esta cheia
    private int verificarColuna(int playerId, int indiceVerfDiag, int verificacao){
        if(verificacao == 0){
            for(int i = 5; i >= 0; i--){
            if(tabuleiro[i][(coluna-1)] == 'B'){
                if(verificacao != 1 && indiceVerfDiag == 0){
                    tabuleiro[i][(coluna-1)] = playerCor[playerId];
                }
                break;
            }else if(i == 0 && tabuleiro[i][(coluna-1)] != 'B' && verificacao != 1){
                System.out.println("Coluna Cheia");
                if(playerId == 0){
                    playerSelect(0);
                }else if(verificacao != 1){
                    botSelect();
                }
                return i;
            }
        }
        }
        if(verificacao == 1 && indiceVerfDiag == 1){
            for(int i = 0; i <= 5; i++){
                if(tabuleiro[i][(coluna-1)] == playerCor[playerId]){
                    return i;
                }
            }
        }
        return -1;
    }
//Player Joga
    private int playerSelect(int id){
        if(id == 0){
            System.out.print("Escolha a coluna para jogar(1 a 7): ");
            coluna = sc.nextInt();
            if(coluna < 1 || coluna > 7){
                System.out.println("Out of range");
                playerSelect(0);
            }else if(id == 0){
                verificarColuna(0,0,0);
            }
        }else{
            return coluna;
        }
        return -1;
    }
//Bot Joga
    private void botSelect(){
        coluna = (int)(Math.random() * 7) + 1;
        // System.out.println(coluna);
        verificarColuna(1,0,0);
    }
//Zerar sequencia
    private void zerarSequencia(){
        for(int i = 0; i < 2; i++){
            sequencia[i] = 0;
        }
    }
//Verificação de vencedor na linha
    private void verificaVencedorLinha(int playerId){
        zerarSequencia();
        for(int i = 5; i >= 0; i--){
            for(int k = 0; k < 7; k++){
                if(tabuleiro[i][k] != 'B'){
                    if(tabuleiro[i][k] == playerCor[playerId]){
                        if(k > 0){
                            if(tabuleiro[i][k-1] == playerCor[playerId]){
                                sequencia[playerId]++;
                            }else{
                                sequencia[playerId] = 1;
                            }
                        }else{
                            sequencia[playerId]++;
                        }
                        if(playerId == 0){
                            sequencia[1] = 0;
                            mensagemVitoria(0);
                            if(mensagemVitoria(-1) == 1){
                                break;
                            }
                        }else if (playerId == 1){
                            sequencia[0] = 0;
                            mensagemVitoria(1);
                            if(mensagemVitoria(-1) == 1){
                                break;
                            }
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
    private void verificaVencedorColuna(int playerId){
        zerarSequencia();
        for(int i = 0; i < 7; i++){
            for(int k = 5; k >= 0; k--){
                if(tabuleiro[k][i] != 'B'){
                    if(tabuleiro[k][i] == playerCor[playerId]){
                        if(k < 5){
                            if(tabuleiro[k+1][i] == playerCor[playerId]){
                                sequencia[playerId]++;
                            }else{
                                sequencia[playerId] = 1;
                            }
                        }else{
                            sequencia[playerId]++;
                        }
                        if(playerId == 0){
                            sequencia[1] = 0;
                            mensagemVitoria(0);
                            if(mensagemVitoria(-1) == 1){
                                break;
                            }
                        }else if (playerId == 1){
                            sequencia[0] = 0;
                            mensagemVitoria(1);
                            if(mensagemVitoria(-1) == 1){
                                break;
                            }
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
    private void filtroDiagonal(int playerId){
        if((playerSelect(1) - 1) <= 3 && verificarColuna(playerId,1,1) >= 3){
            // System.out.println("A");
            verificaVencedorDiagonal(playerId,0,verificarColuna(playerId, 1,1),(playerSelect(1) - 1));
        }//>/\
        if((playerSelect(1) - 1) >= 3 && verificarColuna(playerId,1,1) >= 3){
            // System.out.println("B");
            verificaVencedorDiagonal(playerId,1,verificarColuna(playerId, 1,1),(playerSelect(1) - 1));
        }//</\
        if((playerSelect(1) - 1) <= 3 && verificarColuna(playerId,1,1) < 3){
            // System.out.println("C");
            verificaVencedorDiagonal(playerId,2,verificarColuna(playerId, 1,1),(playerSelect(1) - 1));
        }//>\/
        if((playerSelect(1) - 1) >= 3 && verificarColuna(playerId,1,1) < 3){
            // System.out.println("D");
            verificaVencedorDiagonal(playerId,3,verificarColuna(playerId, 1,1),(playerSelect(1) - 1));
        }//<\/
    }
//Verificação de vencedor na diagonal
    private void verificaVencedorDiagonal(int playerId, int sinalId, int linhaI, int colunaK){
        zerarSequencia();
        if(tabuleiro[linhaI][colunaK] == playerCor[playerId]){
            for(int j = 0; j <= 3; j++){
                if(sinalId == 0){
                    if(tabuleiro[linhaI-j][colunaK+j] == playerCor[playerId]){
                        sequencia[playerId]++;
                    }else{
                        sequencia[playerId] = 0;
                        break;
                    }   
                }
                if(sinalId == 1){
                    if(tabuleiro[linhaI-j][colunaK-j] == playerCor[playerId]){
                        sequencia[playerId]++;
                    }else{
                        sequencia[playerId] = 0;
                        break;
                    }   
                }
                if(sinalId == 2){
                    if(tabuleiro[linhaI+j][colunaK+j] == playerCor[playerId]){
                        sequencia[playerId]++;
                    }else{
                        sequencia[playerId] = 0;
                        break;
                    }   
                }
                if(sinalId == 3){
                    if(tabuleiro[linhaI+j][colunaK-j] == playerCor[playerId]){
                        sequencia[playerId]++;
                    }else{
                        sequencia[playerId] = 0;
                        break;
                    }
                }
                if(playerId == 0){
                    sequencia[1] = 0;
                    mensagemVitoria(0);
                    if(mensagemVitoria(-1) == 1){
                        break;
                    }
                }else if (playerId == 1){
                    sequencia[0] = 0;
                    mensagemVitoria(1);
                    if(mensagemVitoria(-1) == 1){
                        break;
                    }
                }
            }
        }
        zerarSequencia();
    }
    //MSG Vitoria
    private int mensagemVitoria(int playerId){
        if(sequencia[0] == 4 || sequencia[1] == 4){
            if(playerId != -1 && playerId > -1){
                imprimirTabuleiro();
                System.out.println("Jogador "+playerName[playerId]+" Venceu!");
                vencedor = true;
            }
            return 1;
        }
        if(playerId == -1 && sequencia[2] == 7){
                imprimirTabuleiro();
                System.out.println("Empate!");
                vencedor = true;
            }
        return -1;
    }
    private void verificaTabuleiroCheio(){
        sequencia[2] = 0;
        for(int i = 0; i < 7; i++){
            if(tabuleiro[0][i] != 'B'){
                sequencia[2]++;
                if(sequencia[2] == 7){
                    mensagemVitoria(-1);
                }
            }
        }
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