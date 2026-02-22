package com.bi.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.bi.constants.ScreenConstants;
import com.bi.panels.GamePanel;
import com.bi.panels.GameSetupPanel;
import com.bi.panels.MainMenuPanel;

import java.awt.Dimension;

public class GameFrame extends JFrame{

    private final MainMenuPanel mmp = new MainMenuPanel();
    private GameSetupPanel gsp;
    private GamePanel gm;

    public GameFrame(){
        this.setPreferredSize(new Dimension(ScreenConstants.SCREEN_WIDTH,ScreenConstants.SCREEN_HEIGHT));
        this.setFocusable(true); 
        this.setTitle("Train Lord");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setContentPane(mmp);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true); 
    }

    public void showMenu() {
        SwingUtilities.invokeLater(() -> {
            setContentPane(mmp);
            pack();
            revalidate();
            repaint();
        });
    }

    public void showSetup() {
        gsp = new GameSetupPanel();
        SwingUtilities.invokeLater(() -> {
            setContentPane(gsp);
            pack();
            revalidate();
            repaint();
        });
    }

    public void showGame() {
        gm = new GamePanel();
        SwingUtilities.invokeLater(() -> {
            setContentPane(gm); 
            pack();
            revalidate();
            repaint();
        });
        gm.startGameThread();
    }
}