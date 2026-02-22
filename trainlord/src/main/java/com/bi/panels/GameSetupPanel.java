package com.bi.panels;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.bi.constants.DifficultyConstants;
import com.bi.constants.ScreenConstants;
import com.bi.managers.GameManager;
import com.bi.managers.PlayersManager;
import com.bi.managers.StateManager;


public class GameSetupPanel extends JPanel{

    private final String MENU_TEXT = "Game Setup";
    private final String PLAYER_COUNT_TEXT = "Number of Players";
    private final String START_TEXT = "Start Game";
    private final String BACK_TEXT = "Back";
    private final String SELECT_DIFFICULTY_TEXT = "Select Difficulty";
    private final String EASY_TEXT = "Easy";
    private final String NORMAL_TEXT = "Normal";
    private final String HARD_TEXT = "Hard";
    private final String INPUT_NAME_TEXT = "Name";

    SpinnerModel playerSpinnerModel = new SpinnerNumberModel(2,2,6, 1);

    private final JButton startButton = new JButton(START_TEXT);
    private final JButton backButton = new JButton(BACK_TEXT);

    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final JRadioButton easyButton = new JRadioButton(EASY_TEXT);
    private final JRadioButton normalButton = new JRadioButton(NORMAL_TEXT);
    private final JRadioButton hardButton = new JRadioButton(HARD_TEXT);

    private final JSpinner playerCountSpinner = new JSpinner(playerSpinnerModel);

    private final JLabel menuLabel = new JLabel(MENU_TEXT); 
    private final JLabel spinnerLabel = new JLabel(PLAYER_COUNT_TEXT);
    private final JLabel selectDifficultyLabel = new JLabel(SELECT_DIFFICULTY_TEXT);
    private final JLabel inputNameLabel = new JLabel(INPUT_NAME_TEXT);

    private final JTextField playerNameInput = new JTextField(15);


    public GameSetupPanel(){
        buttonGroup.add(easyButton);
        buttonGroup.add(normalButton);
        buttonGroup.add(hardButton);

    startButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            PlayersManager.setNumPlayers((Integer) playerCountSpinner.getValue());
            setDifficulty();
            createPlayer(true);
            for(int i = 1; i < PlayersManager.getNumPlayers() ; i++){createPlayer(false);}
            
            StateManager.setStateGAME();
        }
    });

    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            StateManager.setStateMENU();
        }
    });

    this.setPreferredSize(new Dimension(ScreenConstants.SCREEN_WIDTH,ScreenConstants.SCREEN_HEIGHT));
    this.setFocusable(true);

    this.add(menuLabel);

    this.add(spinnerLabel);
    this.add(playerCountSpinner);

    this.add(selectDifficultyLabel);
    this.add(easyButton);
    this.add(normalButton);
    this.add(hardButton);

    this.add(inputNameLabel);
    this.add(playerNameInput);

    this.add(startButton);
    this.add(backButton);
    
    this.setVisible(true);
    }

    private void setDifficulty(){
        float difficultyValue = 0.0f;

        if(easyButton.isSelected()){
            difficultyValue = DifficultyConstants.EASY;
        }else if(normalButton.isSelected()){
            difficultyValue = DifficultyConstants.NORMAL;
        }else if(hardButton.isSelected()){
            difficultyValue = DifficultyConstants.HARD;
        }else{
            return;
        }
        GameManager.setDifficulty(difficultyValue);
    }

    private void createPlayer(boolean isUser){
        String playerName;
        if(isUser){
            playerName = playerNameInput.getText();
        }else{
            playerName = "CPU";
        }

        PlayersManager.addNewPlayer(playerName, isUser);
    }
}
