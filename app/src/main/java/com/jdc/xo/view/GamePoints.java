package com.jdc.xo.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class GamePoints extends JPanel {
    
    private JLabel xGamerPoints;
    private JLabel oGamerPoints;

    public GamePoints() {
        super(new FlowLayout());
        this.paintWidgets();
    }

    private void paintWidgets() {
        this.xGamerPoints = new JLabel();
        this.add(this.xGamerPoints);

        JLabel separator = new JLabel(" - ");
        this.add(separator);

        this.oGamerPoints = new JLabel();
        this.add(this.oGamerPoints);
    }

    public String getxGamePoints() {
        return this.xGamerPoints.getText();
    }

    public void setxGamePoints(String xGamePoints) {
        this.xGamerPoints.setText(xGamePoints);;
    }

    public String getoGamerPoints() {
        return this.oGamerPoints.getText();
    }

    public void setoGamerPoints(String oGamerPoints) {
        this.oGamerPoints.setText(oGamerPoints);;
    }

    

}
