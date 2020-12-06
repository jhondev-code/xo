package com.jdc.xo.view;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;

/**
 * Esta clase se usa para representar el panel de informacion y avance del
 * juego. En este panel se muestra el nombre del jugador, el avatar
 * correspondiente y el numero de juegos ganados por cada jugador.
 * 
 * @author jhon fernandez
 * @version 1.0
 */
public class GameInfo extends JPanel {

    /**
     * Widget usado para mostrar el nombre del jugador.
     */
    private JLabel gamerLabel;

    /**
     * Widget usado para mostrar el avatar del jugador.
     */
    private JLabel gamerIcon;

    /**
     * Se almacena el nombre del jugador.
     */
    private String gamer;

    /**
     * Se almacena el avatar del jugador.
     */
    private Icon icon;

    /**
     * Visor de juegos ganados.
     */
    private GamePoints pointsView;

    /**
     * El constructor inicia con los datos del primer jugador y el vatar
     * correspondiente.
     * 
     * @param initialGamer nombre del jugador.
     * @param initialIcon  avatar del jugador.
     */
    public GameInfo(String initialGamer, Icon initialIcon) {
        super(new FlowLayout());
        this.paintWidgets();
        this.setGamer(initialGamer);
        this.setIcon(initialIcon);
    }

    /**
     * Este metodo se encarga de inicializar y agregar los componentes visuales del
     * panel de informacion.
     */
    private void paintWidgets() {
        this.gamerLabel = new JLabel();
        this.add(this.gamerLabel);

        this.gamerIcon = new JLabel();
        this.add(this.gamerIcon);

        this.pointsView = new GamePoints();
        this.pointsView.setxGamePoints("0");
        this.pointsView.setoGamerPoints("0");
        this.add(this.pointsView);
    }

    /**
     * Este metodo devuelve el nombre del jugador actual
     * 
     * @return nombre del jugador actual.
     */
    public String getGamer() {
        return this.gamer;
    }

    /**
     * Este metodo se encarga de cambiar el nombre del jugador el el panel de
     * informacion
     * 
     * @param gamer nombre del jugador.
     */
    public void setGamer(String gamer) {
        this.gamer = gamer;
        this.gamerLabel.setText("Turno del jugador: " + gamer);
    }

    /**
     * Este metodo devuelve el avatar que identifica al jugador actual
     * 
     * @return avatar del jugador.
     */
    public Icon getIcon() {
        return this.icon;
    }

    /**
     * Este metodo es el encargado de establecer el avatar del jugador
     * 
     * @param icon avatar del jugador actual.
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
        this.gamerIcon.setIcon(icon);
    }

    /**
     * Se devuelve el visor de jugadas en donde se encuentra la cantidad de jugadas
     * ganadas por cada jugador.
     * 
     * @return visor de jugadas
     */
    public GamePoints getPointsView() {
        return this.pointsView;
    }

}
