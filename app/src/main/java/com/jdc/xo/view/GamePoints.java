package com.jdc.xo.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;

/**
 * Esta clase se usa solamente para visualizar el numero de juegos ganados por
 * los jugadores.
 * 
 * @author jhon fernandez
 * @version 1.0
 */
public class GamePoints extends JPanel {

    /**
     * Este widget es usado para mostrar el numero de juegos ganados por el jugador
     * "x"
     */
    private JLabel xGamerPoints;

    /**
     * Este widget es usado para mostrar el numero de juegos ganados por el jugador
     * "o"
     */
    private JLabel oGamerPoints;

    /**
     * Este constructor inicia colocando los widgets de juegos ganados en la
     * pantalla. Por defecto los juegos ganados empiezan en 0.
     */
    public GamePoints() {
        super(new FlowLayout());
        this.paintWidgets();
    }

    /**
     * Este es el metodo encargado de colocar los widgets en la pantalla
     */
    private void paintWidgets() {
        this.xGamerPoints = new JLabel();
        this.add(this.xGamerPoints);

        JLabel separator = new JLabel(" - ");
        this.add(separator);

        this.oGamerPoints = new JLabel();
        this.add(this.oGamerPoints);
    }

    /**
     * Usado para obtener la cantidad de juegos ganados por el jugador "X"
     * 
     * @return juegos ganados por "X"
     */
    public String getxGamePoints() {
        return this.xGamerPoints.getText();
    }

    /**
     * Usado para modificar la cantidad de juegos ganados por "X"
     * 
     * @param xGamePoints cantidad de juegos ganados por "X"
     */
    public void setxGamePoints(String xGamePoints) {
        this.xGamerPoints.setText(xGamePoints);
    }

    /**
     * Usado para obtener la cantidad de juegos ganados por el jugador "Y"
     * 
     * @return juegos ganados por "Y"
     */
    public String getoGamerPoints() {
        return this.oGamerPoints.getText();
    }

    /**
     * Usado para modificar la cantidad de juegos ganados por "Y"
     * 
     * @param oGamerPoints juegos ganados por "Y"
     */
    public void setoGamerPoints(String oGamerPoints) {
        this.oGamerPoints.setText(oGamerPoints);
    }

}
