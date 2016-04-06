/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

/**
 *
 * @author Alexandra Espichán Linares
 */
public class Character {
    protected Position pos;
    protected int height;
    protected int weight;
    protected char sprite;

    public Character(Position pos, int height, int weight, char sprite){
        this.pos = pos;
        this.height = height;
        this.weight = weight;
        this.sprite = sprite;
    }  

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the sprite
     */
    public char getSprite() {
        return sprite;
    }

    /**
     * @param sprite the sprite to set
     */
    public void setSprite(char sprite) {
        this.sprite = sprite;
    }

    /**
     * @return the pos
     */
    public Position getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Position pos) {
        this.pos = pos;
    }
    
    public void setPos(int x, int y) {
        this.pos.setX(x);
        this.pos.setY(y);
    }
    
    
}
