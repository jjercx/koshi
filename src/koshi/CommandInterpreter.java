/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

/**
 *
 * @author Mauricio
 */
public class CommandInterpreter {

    public static void execute(String command, MainCharacter koshi, MainCharacter monkey, Map m) {
        if (koshi.getStatus().equals("movement")) {//Koshi is A
            if (command.equals("w") || command.equals("W")) {
                koshi.goUp();
            } else if (command.equals("a") || command.equals("A")) {
                koshi.goLeft();
            } else if (command.equals("s") || command.equals("S")) {
                koshi.goDown();
            } else if (command.equals("d") || command.equals("D")) {
                koshi.goRight();
            }
        } else if (koshi.getStatus().equals("action")) {
            String secuency = m.getCommandA();
            String monkeyMovementKeys = "IJKL";
            int index = 0;
            if (secuency.charAt(index) == command.charAt(0)) {
                index++;
                if (index == secuency.length()) {
                    //Change the cell state from action to normal or movement
                    //because the action event has finished successfully
                    int x = koshi.getPos().getX();
                    int y = koshi.getPos().getY();
                    m.getMatrix()[x][y].setType("normal");
                }
            } else if (!monkeyMovementKeys.contains(command)) {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
        if (monkey.getStatus().equals("movement")) {//Monkey is B
            if (command.equals("i") || command.equals("I")) {
                monkey.goUp();
            } else if (command.equals("j") || command.equals("J")) {
                monkey.goLeft();
            } else if (command.equals("k") || command.equals("K")) {
                monkey.goDown();
            } else if (command.equals("l") || command.equals("L")) {
                koshi.goRight();
            }
        } else if (monkey.getStatus().equals("action")) {
            String secuency = m.getCommandB();
            String koshiMovementKeys = "WASD";
            int index = 0;
            if (secuency.charAt(index) == command.charAt(0)) {
                index++;
                if (index == secuency.length()) {
                    //Change the cell state from action to normal or movement
                    //because the action event has finished successfully
                    int x = monkey.getPos().getX();
                    int y = monkey.getPos().getY();
                    m.getMatrix()[x][y].setType("normal");
                }
            } else if (!koshiMovementKeys.contains(command)) {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
        if (koshi.getStatus().equals("duo") && monkey.getStatus().equals("duo")) {
            String secuency = m.getCommandD();
            int index = 0;
            if (secuency.charAt(index) == command.charAt(0)) {
                index++;
                if (index == secuency.length()) {
                    //Change the cell state from action to normal or movement
                    //because the action event has finished successfully
                    int xKoshi = koshi.getPos().getX();
                    int yKoshi = koshi.getPos().getY();
                    m.getMatrix()[xKoshi][yKoshi].setType("normal");
                    int xMonkey = monkey.getPos().getX();
                    int yMonkey = monkey.getPos().getY();
                    m.getMatrix()[xMonkey][yMonkey].setType("normal");
                }
            } else {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
    }

}
