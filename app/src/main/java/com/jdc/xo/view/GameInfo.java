package com.jdc.xo.view;

import javax.swing.Icon;
import javax.swing.JPanel;

import java.awt.FlowLayout;

public class GameInfo extends JPanel {
    
    private String gamer;
    private Icon icon;

    public GameInfo() {
        super(new FlowLayout());
    }

    public String getGamer() {
        return this.gamer;
    }

    public void setGamer(String gamer) {
        this.gamer = gamer;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}
