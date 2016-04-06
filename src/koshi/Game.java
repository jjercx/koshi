/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

import java.util.Scanner;

/**
 *
 * @author jjerc
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    static int LEVEL = 0;
    static int WIDTH = 16;
    static int HEIGHT = 12;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map map = new Map(HEIGHT, WIDTH);   //load the map
        Position pK = new Position(0, 0);
        Position pM = new Position(0, 0);

        MainCharacter koshi = new MainCharacter(pK, 1, 1, 'A');    //Create koshi
        MainCharacter monkey = new MainCharacter(pM, 1, 1, 'B');    //Create Monkey
        boolean lose_flag = false;
        while (true) {
            Renderer.welcome();
            Renderer.draw_options();// could finish here
            for (LEVEL = 0; LEVEL < 3; LEVEL++) {//0 for the tutorial
                Renderer.draw_history(LEVEL);
                map = MapManager.fill_map(LEVEL, koshi, monkey);                          
                while (true) {

                    Renderer.draw_map(map, koshi, monkey);
                    String command = in.next(); // could finish here
                    Position posK = koshi.getPos();
                    Position posM = monkey.getPos();

                    CommandInterpreter.execute(command, koshi, monkey, map, LEVEL);
                    koshi.setStatus(map.getStatus(posK));
                    monkey.setStatus(map.getStatus(posM));
                    String condition = map.update(koshi, monkey);

                    //It is logic from the map
                    if (condition.equals("win")) {
                        Renderer.draw_map(map, koshi, monkey);
                        break;
                    }
                    if (lose()) {
                        Renderer.draw_map(map, koshi, monkey);
                        Renderer.draw_lose();
                        lose_flag = true;
                        break;
                    }
                }
                if (lose_flag) {
                    break;
                }

            }
            if (!lose_flag) {
                Renderer.draw_win();
            }
        }

    }

    private static boolean lose() {
        return MainCharacter.getHealth() <= 0;
    }
}
