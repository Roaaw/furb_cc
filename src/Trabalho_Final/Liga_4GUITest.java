package Trabalho_Final;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class Liga_4GUITest {
    private Liga_4GUI gui;

    @BeforeEach
    void setUp() throws Exception {
        SwingUtilities.invokeAndWait(() -> gui = new Liga_4GUI());
    }

    @AfterEach
    void tearDown() throws Exception {
        if (gui != null) {
            SwingUtilities.invokeAndWait(() -> {
                gui.dispose();
                gui = null;
            });
        }
    }

    @Test
    void testGuiInitialState() throws Exception {
        assertEquals("Liga 4 - Interface Gráfica", gui.getTitle());
        JLabel statusLabel = getPrivateField(gui, "statusLabel");
        assertEquals("Sua vez: escolha uma coluna.", statusLabel.getText());

        JButton[][] cellButtons = getPrivateField(gui, "cellButtons");
        for (int row = 0; row < cellButtons.length; row++) {
            for (int col = 0; col < cellButtons[row].length; col++) {
                assertEquals(" ", cellButtons[row][col].getText());
            }
        }
    }

    @Test
    void testResetButtonClearsBoard() throws Exception {
        JButton[][] cellButtons = getPrivateField(gui, "cellButtons");
        JButton[] dropButtons = getPrivateField(gui, "dropButtons");
        JButton resetButton = getPrivateField(gui, "resetButton");

        SwingUtilities.invokeAndWait(() -> dropButtons[0].doClick());
        assertNotEquals(" ", cellButtons[5][0].getText());

        SwingUtilities.invokeAndWait(() -> resetButton.doClick());
        assertEquals(" ", cellButtons[5][0].getText());

        for (int row = 0; row < cellButtons.length; row++) {
            for (int col = 0; col < cellButtons[row].length; col++) {
                assertEquals(" ", cellButtons[row][col].getText());
            }
        }
    }

    @Test
    void testDropButtonPlacesPlayerPiece() throws Exception {
        JButton[][] cellButtons = getPrivateField(gui, "cellButtons");
        JButton[] dropButtons = getPrivateField(gui, "dropButtons");

        SwingUtilities.invokeAndWait(() -> dropButtons[0].doClick());

        assertEquals("V", cellButtons[5][0].getText());
        JLabel statusLabel = getPrivateField(gui, "statusLabel");
        assertNotEquals("Escolha uma cor e jogue.", statusLabel.getText());
    }

    @Test
    void testChoosingBluePlayerPiece() throws Exception {
        JRadioButton blueButton = getPrivateField(gui, "blueButton");
        JButton[] dropButtons = getPrivateField(gui, "dropButtons");
        JButton[][] cellButtons = getPrivateField(gui, "cellButtons");
        JButton resetButton = getPrivateField(gui, "resetButton");

        SwingUtilities.invokeAndWait(() -> {
            blueButton.setSelected(true);
            resetButton.doClick();
            dropButtons[0].doClick();
        });

        assertEquals("A", cellButtons[5][0].getText());
    }

    @SuppressWarnings("unchecked")
    private <T> T getPrivateField(Object instance, String fieldName) throws Exception {
        Field field = instance.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return (T) field.get(instance);
    }
}
