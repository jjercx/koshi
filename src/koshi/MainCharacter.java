/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

/**
 *
 * @author SAMSUNG
 */

public class MainCharacter extends Character {
    private static int health = 10;    
    
    public MainCharacter(int x, int y, int height, int weight, char sprite){
        super(x,y,height,weight,sprite);        
    }
    
    /**
     * @return the health
     */
    public static int getHealth() {
        return health;
    }

    /**
     * @param aHealth the health to set
     */
    public static void setHealth(int aHealth) {
        health = aHealth;
    }
    
    public void goUp(){
        this.y -= 1;
    }
    
    public void goDown(){
        this.y += 1;
    }
    
    public void goLeft(){
        this.x -= 1;
    }
    
    public void goRight(){
        this.x += 1;
    }
    
    public void decreaseHealth(int amount){
        this.health -= amount;
    }
}
