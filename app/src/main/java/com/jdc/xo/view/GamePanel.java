package com.jdc.xo.view;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase es el panel encargado de contener a los botones
 * 
 * @author jhon fernandez
 * @version 1.0
 */
public class GamePanel extends JPanel {

    /**
     * Almacena los 9 botones del tablero
     */
    private final List<JButton> buttons;

    /**
     * El contructor inicia a los botones en la pantalla
     */
    public GamePanel() {
        super(new GridLayout(3, 3));
        this.buttons = new LinkedList<>();
        this.initializeButtons();
    }

    /**
     * Este metodo se encarga de inicializar todos los botones de acuerdo
     * a las coordenadas de la matriz.
     */
    private void initializeButtons() {
        for(byte row = 0; row < 9; row++) {
            this.buttons.add(new JButton());
        }
    }

}
