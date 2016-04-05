/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class CommandInterpreter {
    
    //This attribute is the option for the main menu.
    private int option;
    //This attribute is for the command secuency in game.
    private String secuency;
    //This attribute is for the current key pressed to do an action.
    private char gameKey;

    public void CommandInterpreter(){
        
    }
    public int verifyMainMenuInput(){
        /*This method takes the main menu's option and verify it
          to do an specific event.*/
        int op;
        Scanner read = new Scanner(System.in);
        op = read.nextInt();
        
        if (op == 1) {
            //When the player chose this option, the game its supposed to start.
            System.out.println("Empieza nueva partida\n");
            return 1;
        }
        else if (op == 2) System.exit(0);
        else {
            //When the CI detects an unknown character, it will request to the player
            //to retype the option character.
            System.out.println("Por favor ingrese una opción válida.\n");
        }
        return 0;
    }
    public int verifyInputKey(int eventFlag){
        String key;
        Scanner readKey = new Scanner(System.in);
        key = readKey.nextLine();
        if (key.length() == 1){
            /*In this part could be any of the movement or special keys or the ESC key*/
        }else{
            /*This is the command secuency part, when the CI verifies if that secuency
              is correct.*/
        }
        return 0;

    }
    
    /**
     * @return the option
     */
    public int getOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(int option) {
        this.option = option;
    }

    /**
     * @return the secuency
     */
    public String getSecuency() {
        return secuency;
    }

    /**
     * @param secuency the secuency to set
     */
    public void setSecuency(String secuency) {
        this.secuency = secuency;
    }

    /**
     * @return the gameKey
     */
    public char getGameKey() {
        return gameKey;
    }

    /**
     * @param gameKey the gameKey to set
     */
    public void setGameKey(char gameKey) {
        this.gameKey = gameKey;
    }
    
    
    
    
}
