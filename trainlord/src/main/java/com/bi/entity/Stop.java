package com.bi.entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.util.List;

public class Stop{

    private final int ID;
    private final int X_CORD,Y_CORD;
    private final Color DEFAULT_COLOR;
    private final Color SELECTED_COLOR = Color.MAGENTA;
    private final boolean IS_CITY;
    private final String CITY_NAME;
    private final List<Integer> NEXT_LIST;

    private final int WIDTH = 7, HEIGHT = 7;
    private final RectangularShape SHAPE;

    private boolean isOccupied  = false, isSelected = false;
    private Color currentColor;

    public Stop(int id, int x, int y, boolean isCity, String cityName, List<Integer> next){
        this.ID = id;
        this.X_CORD = x;
        this.Y_CORD = y;
        this.IS_CITY = isCity;
        this.NEXT_LIST = next;

        if(isCity){
            this.CITY_NAME = cityName;
            this.SHAPE = new Rectangle(x,y,WIDTH,HEIGHT);
            this.DEFAULT_COLOR = Color.WHITE; 
        }else{
            this.CITY_NAME = null;
            this.SHAPE = new Ellipse2D.Double(x, y,WIDTH,HEIGHT);
            this.DEFAULT_COLOR = Color.BLACK;
        }

        this.currentColor = DEFAULT_COLOR;
    }

    public void draw(Graphics2D g2){
        g2.setColor(currentColor);
        g2.fill(SHAPE);
        g2.draw(SHAPE);
    }

    public int getId(){
        return ID;
    }

    public int getX() {
        return X_CORD;
    }

    public int getY() {
        return Y_CORD;
    }

    public String getCityName() {
        return CITY_NAME;
    }

    public Boolean isCity(){
        return IS_CITY;
    }

    public List<Integer> getNextList(){
        return NEXT_LIST;
    }

    public RectangularShape getShape() {
        return SHAPE;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
        if(isSelected){
            this.currentColor = SELECTED_COLOR;
        }else{
            this.currentColor = DEFAULT_COLOR;
        }
    }
}
