package Trabalho_Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Liga_4GUI extends JFrame implements ActionListener {
    private static final int ROWS = 6;
    private static final int COLS = 7;

    private JButton[][] cellButtons;
    private JButton[] dropButtons;
    private JRadioButton redButton;
    private JRadioButton blueButton;
    private JLabel pieceLabel;
    private JLabel statusLabel;
    private JButton resetButton;

    private Liga_4_mod backend;
    private boolean gameOver;

    public Liga_4GUI() {
        super("Liga 4 - Interface Gráfica");
        backend = new Liga_4_mod(true);
        this.cellButtons = new JButton[ROWS][COLS];
        this.dropButtons = new JButton[COLS];
        initializeComponents();
        resetGame();
    }

    private void initializeComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(8, 8));

        JPanel topPanel = new JPanel(new BorderLayout(8, 8));
        JPanel colorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        redButton = new JRadioButton("Vermelho (Você)");
        blueButton = new JRadioButton("Azul (Você)");
        redButton.setActionCommand("COLOR_V");
        blueButton.setActionCommand("COLOR_A");
        redButton.setSelected(true);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(blueButton);
        colorPanel.add(redButton);
        colorPanel.add(blueButton);

        resetButton = new JButton("Novo jogo");
        resetButton.setActionCommand("NOVO_JOGO");
        resetButton.addActionListener(this);
        colorPanel.add(resetButton);

        topPanel.add(colorPanel, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pieceLabel = new JLabel("Peça: Vermelho");
        pieceLabel.setFont(new Font("Arial", Font.BOLD, 14));
        statusLabel = new JLabel("Sua vez: escolha uma coluna.");
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        infoPanel.add(pieceLabel);
        infoPanel.add(Box.createHorizontalStrut(16));
        infoPanel.add(statusLabel);
        topPanel.add(infoPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);

        JPanel boardPanel = new JPanel(new GridLayout(ROWS + 1, COLS, 4, 4));
        boardPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        for (int col = 0; col < COLS; col++) {
            JButton dropButton = new JButton("⬇");
            dropButton.setFont(new Font("Arial", Font.BOLD, 18));
            dropButton.setActionCommand("DROP_" + col);
            dropButton.addActionListener(this);
            boardPanel.add(dropButton);
            dropButtons[col] = dropButton;
        }

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                JButton cell = new JButton(" ");
                cell.setEnabled(false);
                cell.setFont(new Font("Arial", Font.BOLD, 24));
                cell.setBackground(Color.WHITE);
                cell.setOpaque(true);
                cell.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                cell.setFocusPainted(false);
                cellButtons[row][col] = cell;
                boardPanel.add(cell);
            }
        }

        add(boardPanel, BorderLayout.CENTER);
        setSize(620, 520);
        setLocationRelativeTo(null);
    }

    private void resetGame() {
        backend.resetGame();
        backend.setPlayerColor(redButton.isSelected() ? 'V' : 'A');
        pieceLabel.setText("Peça: " + (redButton.isSelected() ? "Vermelho" : "Azul"));
        gameOver = false;
        statusLabel.setText("Sua vez: escolha uma coluna.");
        updateBoard();
    }

    private void updateBoard() {
        char[][] backendBoard = backend.getTabuleiro();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                JButton cell = cellButtons[i][j];
                if (backendBoard[i][j] == 'V') {
                    cell.setText("V");
                    cell.setBackground(Color.RED);
                    cell.setForeground(Color.WHITE);
                } else if (backendBoard[i][j] == 'A') {
                    cell.setText("A");
                    cell.setBackground(Color.BLUE);
                    cell.setForeground(Color.WHITE);
                } else {
                    cell.setText(" ");
                    cell.setBackground(Color.WHITE);
                }
            }
        }
        updateButtonStates();
    }

    private void botMove() {
        if (gameOver) {
            return;
        }
        backend.playBot();
        updateBoard();
        if (backend.isVencedor()) {
            gameOver = true;
            statusLabel.setText("Bot venceu! Fim de jogo.");
            JOptionPane.showMessageDialog(this, "Bot venceu!", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
        } else if (backend.isBoardFull()) {
            gameOver = true;
            statusLabel.setText("Empate! Fim de jogo.");
            JOptionPane.showMessageDialog(this, "Empate!", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            statusLabel.setText("Sua vez: escolha uma coluna.");
        }
    }

    private void updateButtonStates() {
        if (gameOver) {
            for (JButton button : dropButtons) {
                button.setEnabled(false);
            }
            return;
        }
        char[][] backendBoard = backend.getTabuleiro();
        for (int i = 0; i < COLS; i++) {
            dropButtons[i].setEnabled(backendBoard[0][i] == 'B');
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command == null) {
            return;
        }
        if (command.startsWith("DROP_")) {
            if (gameOver) {
                return;
            }
            int col = Integer.parseInt(command.substring(5)) + 1;
            int row = backend.playPlayerColumn(col);
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Coluna cheia! Escolha outra.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            updateBoard();
            if (backend.isVencedor()) {
                gameOver = true;
                statusLabel.setText("Você venceu! Fim de jogo.");
                JOptionPane.showMessageDialog(this, "Você venceu!", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (backend.isBoardFull()) {
                gameOver = true;
                statusLabel.setText("Empate! Fim de jogo.");
                JOptionPane.showMessageDialog(this, "Empate!", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            statusLabel.setText("Bot está jogando...");
            botMove();
        } else if (command.equals("NOVO_JOGO")) {
            resetGame();
        } else if (command.equals("COLOR_V") || command.equals("COLOR_A")) {
            pieceLabel.setText("Peça: " + (command.equals("COLOR_V") ? "Vermelho" : "Azul"));
            if (!gameOver) {
                statusLabel.setText("Troca de cor aplicada. Clique em Novo jogo para reiniciar.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Liga_4GUI gui = new Liga_4GUI();
                gui.setVisible(true);
            }
        });
    }
}
