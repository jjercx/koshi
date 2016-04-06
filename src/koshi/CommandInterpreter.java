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
    
    

    public void CommandInterpreter(){
        
    }
    
    
    
    
    public int verifyMainMenuInput(int op){
        /*This method takes the main menu's option and verify it
          to do an specific event.*/
        while(true){
            //When the player chose this option, the game its supposed to start.
            if (op == 1) break;
            else if (op == 2) System.exit(0);
            else {
                /*When the CI detects an unknown character, it will request to the player
                  to retype the option character.*/
                System.out.println("Por favor ingrese una opción válida.\n");
            }
        }        
        return 1;
    }
    public int verifyInputKey(String command, int type){
        if (command.equals("ESC")) System.exit(0);
        if (type == 0){
            /*This means that we're refering at player's movement*/
            
        }
        return 0;

    }
    
}
