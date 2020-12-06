package com.jdc.xo.view;

import javax.swing.JPanel;

import java.awt.FlowLayout;

public class GamePoints extends JPanel {
    
    private String xGamePoints;
    private String oGamerPoints;

    public GamePoints() {
        super(new FlowLayout());
    }

    public String getxGamePoints() {
        return this.xGamePoints;
    }

    public void setxGamePoints(String xGamePoints) {
        this.xGamePoints = xGamePoints;
    }

    public String getoGamerPoints() {
        return this.oGamerPoints;
    }

    public void setoGamerPoints(String oGamerPoints) {
        this.oGamerPoints = oGamerPoints;
    }

    

}
