package org.example.data;

import java.awt.*;


public class Ball {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Ball(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle getBallRectangle(){
        return new Rectangle(x,y,width, height);
    }

    public boolean isColided(Rectangle otherObject){
        return getBallRectangle().intersects(otherObject);
    }

    public void move(int steps, Direction direction) {
        switch (direction) {
            case DOWN -> {
                y += steps;
            }
            case UP -> {
                y -= steps;
            }
            case LEFT -> {
                x -= steps;
            }
            case RIGHT -> {
                x += steps;
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }



    public int getWidth() {
        return width;
    }



    public int getHeight() {
        return height;
    }



    public Color getColor() {
        return color;
    }
}