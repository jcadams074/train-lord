package com.bi.panels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bi.constants.ScreenConstants;
import com.bi.managers.StateManager;

public class MainMenuPanel extends JPanel{

    private final String MENU_TEXT = "Main Menu";
    private final String SINGLE_PLAYER_TEXT = "Single Player";
    private final String CLOSE_TEXT = "Close Game";

    private final JButton startButton = new JButton(SINGLE_PLAYER_TEXT), closeButton = new JButton(CLOSE_TEXT);
    private final JLabel menuLabel = new JLabel(MENU_TEXT);

    public MainMenuPanel(){

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StateManager.setStateSETUP();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.setPreferredSize(new Dimension(ScreenConstants.SCREEN_WIDTH,ScreenConstants.SCREEN_HEIGHT));
        this.setFocusable(true);
        this.add(menuLabel);
        this.add(startButton);
        this.add(closeButton);
        this.setVisible(true);
    }
}
