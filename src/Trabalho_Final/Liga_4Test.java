package Trabalho_Final;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Liga_4Test {

    private Liga_4Refatorado game;
    private ByteArrayOutputStream outputStream;
    private PrintStream printStream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
    }

    @Test
    @DisplayName("Testa inicialização do tabuleiro")
    void testIniciarTabuleiro() {
        // Arrange
        Scanner scanner = new Scanner("V\n"); // Simula entrada do usuário
        game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarTabuleiro();
        char[][] tabuleiro = game.getTabuleiro();
        
        // Assert
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                assertEquals('B', tabuleiro[i][j], "Todas as posições devem ser 'B'");
            }
        }
    }

    @Test
    @DisplayName("Testa seleção de cor Vermelho")
    void testMenuPlayerCorVermelho() {
        // Arrange
        String input = "V\n";
        Scanner scanner = new Scanner(input);
        game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.menuPlayerCor();
        
        // Assert
        assertArrayEquals(new char[]{'V', 'A'}, game.getPlayerCor());
        assertArrayEquals(new String[]{"Vermelho", "Azul"}, game.getPlayerName());
    }

    @Test
    @DisplayName("Testa seleção de cor Azul")
    void testMenuPlayerCorAzul() {
        // Arrange
        String input = "A\n";
        Scanner scanner = new Scanner(input);
        game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.menuPlayerCor();
        
        // Assert
        assertArrayEquals(new char[]{'A', 'V'}, game.getPlayerCor());
        assertArrayEquals(new String[]{"Azul", "Vermelho"}, game.getPlayerName());
    }

    @Test
    @DisplayName("Testa verificação de coluna - jogada válida")
    void testVerificarColunaValida() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        game.setColuna(1);
        
        // Act
        int resultado = game.verificarColuna(0, 0, 0);
        
        // Assert
        assertEquals(5, resultado, "Deve retornar a linha 5 (última linha)");
        assertEquals('V', game.getTabuleiro()[5][0], "Deve preencher com V");
    }

    @Test
    @DisplayName("Testa verificação de coluna - coluna cheia")
    void testVerificarColunaCheia() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        game.setColuna(1);
        
        // Preenche a coluna toda
        for(int i = 5; i >= 0; i--) {
            game.verificarColuna(0, 0, 0);
        }
        
        // Act - tenta preencher mais uma vez
        int resultado = game.verificarColuna(0, 0, 0);
        
        // Assert - deve retornar 0 (primeira linha) pois a coluna está cheia
        // e a mensagem "Coluna Cheia" deve aparecer
        assertTrue(outputStream.toString().contains("Coluna Cheia"));
    }

    @Test
    @DisplayName("Testa vitória na horizontal")
    void testVitoriaHorizontal() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro para vitória horizontal
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'V';
        tabuleiro[5][1] = 'V';
        tabuleiro[5][2] = 'V';
        tabuleiro[5][3] = 'V';
        
        // Act
        game.verificaVencedorLinha(0);
        
        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa vitória na vertical")
    void testVitoriaVertical() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro para vitória vertical
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'V';
        tabuleiro[4][0] = 'V';
        tabuleiro[3][0] = 'V';
        tabuleiro[2][0] = 'V';
        
        // Act
        game.verificaVencedorColuna(0);
        
        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa vitória na diagonal (cima-esquerda para baixo-direita)")
    void testVitoriaDiagonal1() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro para vitória diagonal
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'V';
        tabuleiro[4][1] = 'V';
        tabuleiro[3][2] = 'V';
        tabuleiro[2][3] = 'V';
        
        // Act
        game.setColuna(4); // Última coluna da diagonal
        game.filtroDiagonal(0);
        
        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa vitória na diagonal (cima-direita para baixo-esquerda)")
    void testVitoriaDiagonal2() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro para vitória diagonal
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][3] = 'V';
        tabuleiro[4][2] = 'V';
        tabuleiro[3][1] = 'V';
        tabuleiro[2][0] = 'V';
        
        // Act
        game.setColuna(4); // Última coluna da diagonal
        game.filtroDiagonal(0);
        
        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa que não há empate quando a primeira linha está vazia")
    void testNaoTodosEspacosPreenchidosEmpate() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro quase cheio, mas com a primeira linha vazia
        char[][] tabuleiro = game.getTabuleiro();
        for(int i = 1; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                tabuleiro[i][j] = (i % 2 == 0) ? 'V' : 'A';
            }
        }
        
        // Act
        game.verificaTabuleiroCheio();
        
        // Assert
        assertFalse(game.isVencedor());
        assertFalse(outputStream.toString().contains("Empate!"));
    }

    @Test
    @DisplayName("Testa reset de variáveis")
    void testResetVar() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.resetVar();
        
        // Assert
        assertEquals(0, game.getJogadas());
        assertEquals(0, game.getTurnos());
        assertFalse(game.isVencedor());
        assertArrayEquals(new int[3], game.getSequencia());
    }

    @Test
    @DisplayName("Testa zerar sequência")
    void testZerarSequencia() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        int[] sequencia = game.getSequencia();
        sequencia[0] = 3;
        sequencia[1] = 2;
        
        // Act
        game.zerarSequencia();
        
        // Assert
        assertEquals(0, sequencia[0]);
        assertEquals(0, sequencia[1]);
    }

    @Test
    @DisplayName("Testa mensagem de vitória")
    void testMensagemVitoria() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        int[] sequencia = game.getSequencia();
        
        // Act - simula vitória
        sequencia[0] = 4;
        int resultado = game.mensagemVitoria(0);
        
        // Assert
        assertEquals(1, resultado);
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa seleção do player - coluna inválida")
    void testPlayerSelectColunaInvalida() {
        // Arrange
        String input = "V\n10\n1\n"; // Seleciona cor, valor inválido, depois válido
        Scanner scanner = new Scanner(input);
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Act
        int resultado = game.playerSelect(0);
        
        // Assert
        assertTrue(outputStream.toString().contains("Out of range"));
        // O método deve continuar até receber um valor válido
        assertNotEquals(-1, resultado);
    }

    @Test
    @DisplayName("Testa jogada do bot")
    void testBotSelect() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Act
        game.botSelect();
        
        // Assert - verifica se alguma posição foi preenchida
        boolean preenchido = false;
        char[][] tabuleiro = game.getTabuleiro();
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 7; j++) {
                if(tabuleiro[i][j] != 'B') {
                    preenchido = true;
                    break;
                }
            }
        }
        assertTrue(preenchido, "O bot deve preencher alguma posição");
    }

    @Test
    @DisplayName("Testa jogo completo - vitória do player")
    void testJogoCompletoVitoriaPlayer() {
        // Arrange
        StringBuilder input = new StringBuilder();
        input.append("1\n"); // Menu: Jogar
        input.append("V\n"); // Seleciona cor
        // Simula jogadas para vitória na horizontal
        input.append("1\n");
        input.append("2\n");
        input.append("1\n"); 
        input.append("2\n");
        input.append("1\n");
        input.append("2\n");
        input.append("1\n"); // Vitória
        
        Scanner scanner = new Scanner(input.toString());
        game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarMenu();
        
        // Assert
        // O jogo deve terminar com vitória
        assertTrue(game.isVencedor() || outputStream.toString().contains("Venceu"));
    }

    @Test
    @DisplayName("Testa vitória diagonal na borda direita")
    void testVitoriaDiagonalBordaDireita() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();

        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[2][3] = 'V';
        tabuleiro[3][4] = 'V';
        tabuleiro[4][5] = 'V';
        tabuleiro[5][6] = 'V';
        game.setColuna(7);

        // Act
        game.filtroDiagonal(0);

        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa vitória diagonal de cima-direita para baixo-esquerda na borda")
    void testVitoriaDiagonalBordaEsquerda() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();

        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[2][6] = 'V';
        tabuleiro[3][5] = 'V';
        tabuleiro[4][4] = 'V';
        tabuleiro[5][3] = 'V';
        game.setColuna(4);

        // Act
        game.filtroDiagonal(0);

        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Vermelho Venceu!"));
    }

    @Test
    @DisplayName("Testa empate completo no tabuleiro")
    void testEmpateCompleto() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();

        char[][] tabuleiro = game.getTabuleiro();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = ((i + j) % 2 == 0) ? 'V' : 'A';
            }
        }

        // Act
        game.verificaTabuleiroCheio();

        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Empate!"));
    }

    @Test
    @DisplayName("Testa menu inicial com opções inválidas antes de sair")
    void testMenuInicialOpcaoInvalidaRepetida() {
        // Arrange
        String input = "3\n4\n2\n";
        Scanner scanner = new Scanner(input);
        game = new Liga_4Refatorado(scanner, printStream);

        // Act
        game.iniciarMenu();

        // Assert
        assertTrue(outputStream.toString().contains("Erro"));
        assertTrue(outputStream.toString().contains("Encerrando . . ."));
    }

    @Test
    @DisplayName("Testa playerSelect com várias entradas inválidas não numéricas")
    void testPlayerSelectMultiplasEntradasInvalidas() {
        // Arrange
        String input = "V\na\n?\n10\n3\n";
        Scanner scanner = new Scanner(input);
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();

        // Act
        int resultado = game.playerSelect(0);

        // Assert
        assertTrue(outputStream.toString().contains("Out of range"));
        assertNotEquals(-1, resultado);
    }

    @Test
    @DisplayName("Testa menuPlayerCor sem entrada disponível")
    void testMenuPlayerCorSemEntrada() {
        // Arrange
        Scanner scanner = new Scanner("");
        game = new Liga_4Refatorado(scanner, printStream);

        // Act
        game.menuPlayerCor();

        // Assert
        assertArrayEquals(new char[]{'V', 'A'}, game.getPlayerCor());
        assertArrayEquals(new String[]{"Vermelho", "Azul"}, game.getPlayerName());
    }

    @Test
    @DisplayName("Testa verificação de coluna com parâmetro de verificação 1")
    void testVerificarColunaVerificacao1() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        game.setColuna(1);
        game.verificarColuna(0, 0, 0);

        // Act
        int row = game.verificarColuna(0, 1, 1);

        // Assert
        assertEquals(5, row);
    }

    @Test
    @DisplayName("Testa vitória vertical do jogador Azul")
    void testVitoriaVerticalAzul() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        game.getTabuleiro()[5][0] = 'A';
        game.getTabuleiro()[4][0] = 'A';
        game.getTabuleiro()[3][0] = 'A';
        game.getTabuleiro()[2][0] = 'A';

        // Act
        game.verificaVencedorColuna(1);

        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Azul Venceu!"));
    }

    @Test
    @DisplayName("Testa vitória na linha do jogador Azul")
    void testVitoriaHorizontalAzul() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'A';
        tabuleiro[5][1] = 'A';
        tabuleiro[5][2] = 'A';
        tabuleiro[5][3] = 'A';

        // Act
        game.verificaVencedorLinha(1);

        // Assert
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Azul Venceu!"));
    }

    @Test
    @DisplayName("Testa filtro diagonal sem vitória")
    void testFiltroDiagonalSemVitoria() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'V';
        tabuleiro[4][1] = 'V';
        tabuleiro[3][2] = 'V';

        // Act
        game.filtroDiagonal(0);

        // Assert
        assertFalse(game.isVencedor());
        assertFalse(outputStream.toString().contains("Venceu"));
    }

    @Test
    @DisplayName("Testa mensagem de vitória por empate")
    void testMensagemVitoriaEmpate() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        int[] sequencia = game.getSequencia();
        sequencia[2] = 7;

        // Act
        int resultado = game.mensagemVitoria(-1);

        // Assert
        assertEquals(1, resultado);
        assertTrue(game.isVencedor());
        assertTrue(outputStream.toString().contains("Empate!"));
    }

    @Test
    @DisplayName("Testa impressão do tabuleiro")
    void testImprimirTabuleiroOutput() {
        // Arrange
        Scanner scanner = new Scanner("V\n");
        game = new Liga_4Refatorado(scanner, printStream);
        game.iniciarTabuleiro();

        // Act
        game.imprimirTabuleiro();

        // Assert
        assertTrue(outputStream.toString().contains("B B B B B B B "));
    }
}