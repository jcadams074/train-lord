package com.bi.panels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.bi.main.GameFrame;
import com.bi.managers.GameManager;

public class GamePanel extends JPanel implements Runnable{
    
    GameFrame gp;
    int currentTurn = 0;
    int fps = 60;

    private BufferedImage map;
    Thread gameThread;

    GameManager gm = new GameManager();

   
    public GamePanel(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                gm.sm.handleClick(e.getPoint());
            }
        });  

        try {
            map = ImageIO.read(this.getClass().getResource("/images/trainLordMap.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/fps; 
        double delta = 0;
        double lastTime = System.nanoTime();
        long currentTime;
        

        gm.runGame();
        
        while(gameThread != null){

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if(delta >= 1){
                repaint();
                delta--;
            }
       }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2  = (Graphics2D)g;
        g.drawImage(map, 0, 0, null);

        gm.sm.draw(g2);
        g2.dispose();
    }
}
