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

    public static void execute(String command, MainCharacter koshi, MainCharacter monkey, Map m, int nivel) {
        if (koshi.getStatus().equals("movement")) {//Koshi is A
            int koshiX = koshi.pos.getX();
            int koshiY = koshi.pos.getY();
            if (command.equals("w") || command.equals("W")) {
                Cell c = m.getCellAt(koshiY - 1, koshiX);
                if (c.isWalkable() && c.getSprite() != 'N') {
                    koshi.goUp();
                }
            } else if (command.equals("a") || command.equals("A")) {
                if (koshiX - 1 >= 0 && m.getCellAt(koshiY, koshiX - 1).isWalkable()) {
                    koshi.goLeft();
                }
            } else if (command.equals("s") || command.equals("S")) {
                if (koshiY + 1 < Game.HEIGHT && m.getCellAt(koshiY + 1, koshiX).isWalkable()) {
                    koshi.goDown();
                }
            } else if (command.equals("d") || command.equals("D")) {
                if (koshiX + 1 < Game.WIDTH && m.getCellAt(koshiY, koshiX + 1).isWalkable()) {
                    koshi.goRight();
                }
            }
        } else if (koshi.getStatus().equals("action")) {
            String secuency = m.getCommandA();
            System.out.println("Ingrese el siguiente comando: ");
            System.out.println(secuency);
            String monkeyMovementKeys = "IJKL";
            int index = 0;
            if (secuency.equals(command)) {
                    //Change the cell state from action to normal or movement
                //because the action event has finished successfully
                int x = koshi.getPos().getX();
                int y = koshi.getPos().getY();
                m.getMatrix()[x][y].setType("normal");

            } else if (!monkeyMovementKeys.contains(command)) {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
        if (monkey.getStatus().equals("movement")) {//Monkey is B

            int monkeyX = monkey.pos.getX();
            int monkeyY = monkey.pos.getY();
            if (command.equals("i") || command.equals("I")) {
                if (monkeyY - 1 >= 0 && m.getCellAt(monkeyY - 1, monkeyX).isWalkable()) {
                    monkey.goUp();
                }
            } else if (command.equals("j") || command.equals("J")) {
                if (monkeyX - 1 >= 0 && m.getCellAt(monkeyY, monkeyX - 1).isWalkable()) {
                    monkey.goLeft();
                }
            } else if (command.equals("k") || command.equals("K")) {
                Cell c = m.getCellAt(monkeyY + 1, monkeyX);
                if (c.isWalkable() && c.getSprite() != 'S') {
                    monkey.goDown();
                }
            } else if (command.equals("l") || command.equals("L")) {
                if (monkeyX + 1 < Game.WIDTH && m.getCellAt(monkeyY, monkeyX + 1).isWalkable()) {
                    monkey.goRight();
                }
            }
        } else if (monkey.getStatus().equals("action")) {
            String secuency = m.getCommandB();
            System.out.println("Ingrese el siguiente comando: ");
            System.out.println(secuency);
            String koshiMovementKeys = "WASD";
            if (secuency.equals(command)) {
                //Change the cell state from action to normal or movement
                //because the action event has finished successfully
                int x = monkey.getPos().getX();
                int y = monkey.getPos().getY();
                m.getMatrix()[x][y].setType("normal");

            } else if (!koshiMovementKeys.contains(command)) {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
        if (koshi.getStatus().trim().equals("duo") && monkey.getStatus().trim().equals("duo")) {
            String secuency = m.getCommandD();
            System.out.println("Ingrese el siguiente comando: ");
            System.out.println(secuency);
            int index = 0;
            if (secuency.equals(command)) {
                //Change the cell state from action to normal or movement
                //because the action event has finished successfully
                int xKoshi = koshi.getPos().getX();
                int yKoshi = koshi.getPos().getY();
                m.getMatrix()[yKoshi][xKoshi].setType("normal");
                int xMonkey = monkey.getPos().getX();
                int yMonkey = monkey.getPos().getY();
                m.getMatrix()[yMonkey][xMonkey].setType("normal");
                actualizarPos(koshi, monkey, nivel);

            } else {
                //If the player press a wrong key, your health decreases by two
                MainCharacter.setHealth(MainCharacter.getHealth() - 2);
            }
        }
    }

    private static void actualizarPos(MainCharacter koshi, MainCharacter monkey, int nivel) {
        if (nivel == 0) {
            koshi.setPos(14, 7);
            monkey.setPos(14, 6);
        } else if (nivel == 1) {
            monkey.setPos(15, 6);
            koshi.setPos(15, 7);
        }
    }

}
