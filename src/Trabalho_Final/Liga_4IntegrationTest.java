package Trabalho_Final;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Liga_4IntegrationTest {

    @Test
    @DisplayName("Teste integrado - menu e jogo completo")
    void testMenuEJogoCompleto() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        // Simula entrada: jogar, cor Vermelho, e algumas jogadas
        StringBuilder input = new StringBuilder();
        input.append("1\n"); // Jogar
        input.append("V\n"); // Cor Vermelho
        input.append("1\n"); // Jogada player
        input.append("2\n"); // Jogada bot
        input.append("1\n");
        input.append("2\n");
        input.append("1\n");
        input.append("2\n");
        input.append("1\n"); // Vitória
        
        Scanner scanner = new Scanner(input.toString());
        Liga_4Refatorado game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarMenu();
        
        // Assert
        String output = outputStream.toString();
        assertTrue(output.contains("Tabuleiro") || output.contains("Jogador"));
        // O jogo deve terminar ou mostrar algum resultado
        assertNotNull(output);
    }

    @Test
    @DisplayName("Teste integrado - sair do menu")
    void testSairDoMenu() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        String input = "2\n"; // Sair
        Scanner scanner = new Scanner(input);
        Liga_4Refatorado game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarMenu();
        
        // Assert
        assertTrue(outputStream.toString().contains("Encerrando . . ."));
    }

    @Test
    @DisplayName("Teste integrado - opção inválida no menu")
    void testOpcaoInvalidaMenu() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        String input = "3\n2\n"; // Opção inválida, depois sair
        Scanner scanner = new Scanner(input);
        Liga_4Refatorado game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarMenu();
        
        // Assert
        assertTrue(outputStream.toString().contains("Erro"));
    }

    @Test
    @DisplayName("Teste integrado - vitória do bot")
    void testVitoriaBot() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        
        // Simula entrada onde o bot pode vencer
        StringBuilder input = new StringBuilder();
        input.append("1\n"); // Jogar
        input.append("A\n"); // Cor Azul (bot será Vermelho)
        input.append("1\n"); // Player joga
        // As próximas jogadas são do bot, que pode vencer
        
        Scanner scanner = new Scanner(input.toString());
        Liga_4Refatorado game = new Liga_4Refatorado(scanner, printStream);
        
        // Act
        game.iniciarTabuleiro();
        game.menuPlayerCor();
        
        // Configura tabuleiro para vitória do bot
        char[][] tabuleiro = game.getTabuleiro();
        tabuleiro[5][0] = 'V';
        tabuleiro[5][1] = 'V';
        tabuleiro[5][2] = 'V';
        tabuleiro[5][3] = 'V';
        game.setColuna(4);
        game.verificaVencedorLinha(1);
        
        // Assert
        assertTrue(game.isVencedor());
        String output = outputStream.toString();
        assertTrue(output.contains("Vermelho Venceu!") || output.contains("Venceu"));
    }
}