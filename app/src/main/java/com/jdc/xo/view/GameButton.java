package com.jdc.xo.view;

import javax.swing.JButton;

/**
 * Esta clase es usada para crear botones para el juego, los botones creados a
 * partir de esta clase cambiaran su avatar de acurdo al turno del jugador.
 * 
 * @author jhon fernandez
 * @version 1.0
 */
public class GameButton extends JButton {

    /**
     * Simbolos usados para identificar el avatar del jugador del cual sea el turno.
     */
    public static final String X = "X";
    public static final String O = "O";

    /**
     * El simbolo del avatar perteneciente al jugador.
     */
    private String symbol;

    /**
     * El contructor inicia todas las caracteristicas basicas de un boton de java.
     */
    public GameButton() {
        super();
    }

    /**
     * Retorna el simbolo perteneciente al jugador actual.
     * 
     * @return gammer symbol.
     */
    public String getSymbol() {
        return this.symbol;
    }

    /**
     * Establece el simbolo del jugador actual.
     * 
     * @param symbol gammer symbol.
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
