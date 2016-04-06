/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

/**
 *
 * @author Alexandra Espichan Linares
 */

public class MainCharacter extends Character {
    private static int health = 10; 
    private String status;
    
    public MainCharacter(Position pos, int height, int weight, char sprite){
        super(pos,height,weight,sprite);  
        this.status = "movement";
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
        this.pos.setY(this.pos.getY()-1);
    }
    
    public void goDown(){
        this.pos.setY(this.pos.getY()+1);
    }
    
    public void goLeft(){
        this.pos.setX(this.pos.getX()-1);
    }
    
    public void goRight(){
        this.pos.setX(this.pos.getX()+1);
    }
    
    public void decreaseHealth(int amount){
        this.health -= amount;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
