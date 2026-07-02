package Trabalho_Final;

import java.io.PrintStream;
import java.util.Scanner;

public class Liga_4Refatorado {
    private Scanner sc;
    private PrintStream out;
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

    // Construtor para uso normal
    public Liga_4Refatorado() {
        this(new Scanner(System.in), System.out);
    }

    // Construtor para testes
    public Liga_4Refatorado(Scanner scanner, PrintStream output) {
        this.sc = scanner;
        this.out = output;
    }

    public void iniciarMenu() {
        do {
            if (!sc.hasNext()) {
                break;
            }
            String token = sc.next();
            if (token.isEmpty()) {
                continue;
            }
            out.print("1-Jogar\n2-Sair\nEscolha: ");
            opcaoMenu = token.toUpperCase().charAt(0);
            switch (opcaoMenu) {
                case '1':
                    resetVar();
                    iniciarTabuleiro();
                    menuPlayerCor();
                    iniciarJogo();
                    break;
                case '2':
                    out.println("Encerrando . . .");
                    break;
                default:
                    out.println("Erro");
                    break;
            }
        } while (opcaoMenu != '2');
    }

    // Métodos públicos para testes
    public void iniciarJogo(){
        do {
            if(turnos % 2 == 0){
                verificaTabuleiroCheio();
                if(vencedor != true){
                    imprimirTabuleiro();
                    playerSelect(0);
                }
                turnos++;
                out.println();
                out.println();
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
                out.println();
                out.println();
                if(jogadas >=4){
                    verificaVencedorLinha(1);
                    verificaVencedorColuna(1);
                    filtroDiagonal(1);
                }
            }
            jogadas++;
        } while (vencedor != true);
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public int getJogadas() {
        return jogadas;
    }

    public int getTurnos() {
        return turnos;
    }

    public char[] getPlayerCor() {
        return playerCor;
    }

    public String[] getPlayerName() {
        return playerName;
    }

    public int[] getSequencia() {
        return sequencia;
    }

    // Métodos que antes eram privados, agora com visibilidade de pacote para testes
    void iniciarTabuleiro(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                tabuleiro[i][j] = 'B';
            }
        }
    }

    void imprimirTabuleiro(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                out.print(tabuleiro[i][j]+" ");
            }
            out.println();
        }
    }

    void menuPlayerCor(){
        do {
            if (!sc.hasNext()) {
                playerCor[0] = 'V'; playerName[0] = "Vermelho";
                playerCor[1] = 'A'; playerName[1] = "Azul";
                break;
            }
            out.print("\nMenu:\n(V)Vermelho/(A)Azul\nEscolha uma cor: ");
            String token = sc.next().toUpperCase();
            if (token.isEmpty()) {
                continue;
            }
            opcaoMenu = token.charAt(0);
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
                    out.println("Erro, escolha uma das opções abaixo.");
                    break;
            }
        } while (loopMenu == true);
    }

    int verificarColuna(int playerId, int indiceVerfDiag, int verificacao){
        if(verificacao == 0){
            for(int i = 5; i >= 0; i--){
                if(tabuleiro[i][(coluna-1)] == 'B'){
                    if(verificacao != 1 && indiceVerfDiag == 0){
                        tabuleiro[i][(coluna-1)] = playerCor[playerId];
                    }
                    return i;
                }else if(i == 0 && tabuleiro[i][(coluna-1)] != 'B' && verificacao != 1){
                    out.println("Coluna Cheia");
                    if(playerId == 0){
                        if (sc.hasNext()) {
                            playerSelect(0);
                        }
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

    int playerSelect(int id){
        if(id == 0){
            out.print("Escolha a coluna para jogar(1 a 7): ");
            while (sc.hasNext()) {
                String token = sc.next();
                try {
                    coluna = Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    out.println("Out of range");
                    continue;
                }
                if(coluna < 1 || coluna > 7){
                    out.println("Out of range");
                    continue;
                }
                return verificarColuna(0,0,0);
            }
            return -1;
        }else{
            return coluna;
        }
    }

    void botSelect(){
        coluna = (int)(Math.random() * 7) + 1;
        verificarColuna(1,0,0);
    }

    void zerarSequencia(){
        for(int i = 0; i < 2; i++){
            sequencia[i] = 0;
        }
    }

    void verificaVencedorLinha(int playerId){
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

    void verificaVencedorColuna(int playerId){
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

    void filtroDiagonal(int playerId){
        if (verificaVencedorDiagonalCompleta(playerId)) {
            mensagemVitoria(playerId);
        }
    }

    private boolean verificaVencedorDiagonalCompleta(int playerId){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                if(tabuleiro[i][j] != 'B' && tabuleiro[i][j] == playerCor[playerId]){
                    if(j <= 3 && i <= 2){
                        if(tabuleiro[i+1][j+1] == playerCor[playerId] &&
                           tabuleiro[i+2][j+2] == playerCor[playerId] &&
                           tabuleiro[i+3][j+3] == playerCor[playerId]){
                            sequencia[playerId] = 4;
                            sequencia[1 - playerId] = 0;
                            return true;
                        }
                    }
                    if(j >= 3 && i <= 2){
                        if(tabuleiro[i+1][j-1] == playerCor[playerId] &&
                           tabuleiro[i+2][j-2] == playerCor[playerId] &&
                           tabuleiro[i+3][j-3] == playerCor[playerId]){
                            sequencia[playerId] = 4;
                            sequencia[1 - playerId] = 0;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    void verificaVencedorDiagonal(int playerId, int sinalId, int linhaI, int colunaK){
        // Método mantido para compatibilidade com testes existentes,
        // mas não é usado pela lógica de filtro diagonal atual.
        zerarSequencia();
        if(linhaI < 0 || linhaI >= 6 || colunaK < 0 || colunaK >= 7){
            return;
        }
        if(tabuleiro[linhaI][colunaK] == playerCor[playerId]){
            for(int j = 0; j <= 3; j++){
                try {
                    boolean match = false;
                    if(sinalId == 0 && linhaI-j >= 0 && colunaK+j < 7){
                        match = tabuleiro[linhaI-j][colunaK+j] == playerCor[playerId];
                    }
                    if(sinalId == 1 && linhaI-j >= 0 && colunaK-j >= 0){
                        match = tabuleiro[linhaI-j][colunaK-j] == playerCor[playerId];
                    }
                    if(sinalId == 2 && linhaI+j < 6 && colunaK+j < 7){
                        match = tabuleiro[linhaI+j][colunaK+j] == playerCor[playerId];
                    }
                    if(sinalId == 3 && linhaI+j < 6 && colunaK-j >= 0){
                        match = tabuleiro[linhaI+j][colunaK-j] == playerCor[playerId];
                    }
                    if(match){
                        sequencia[playerId]++;
                    }else{
                        sequencia[playerId] = 0;
                        break;
                    }
                    if(playerId == 0){
                        sequencia[1] = 0;
                        if(mensagemVitoria(0) == 1){
                            break;
                        }
                    }else if (playerId == 1){
                        sequencia[0] = 0;
                        if(mensagemVitoria(1) == 1){
                            break;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        zerarSequencia();
    }

    int mensagemVitoria(int playerId){
        if(sequencia[0] == 4 || sequencia[1] == 4){
            if(playerId != -1 && playerId > -1){
                imprimirTabuleiro();
                out.println("Jogador "+playerName[playerId]+" Venceu!");
                vencedor = true;
            }
            return 1;
        }
        if(playerId == -1 && sequencia[2] == 7){
            imprimirTabuleiro();
            out.println("Empate!");
            vencedor = true;
            return 1;
        }
        return -1;
    }

    void verificaTabuleiroCheio(){
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

    void resetVar(){
        zerarSequencia();
        jogadas = 0;
        vencedor = false;
        turnos = 0;
    }

    public static void main(String[] args) {
        new Liga_4Refatorado().iniciarMenu();
    }
}