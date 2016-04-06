/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;

/**
 *
 * @author jjerc
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    static int LEVEL =0;
    static int WIDTH =16;
    static int HEIGHT =12;
    
    
    public static void main(String[] args) {
        
        
        
        Map map = new Map(HEIGHT, WIDTH);   //load the map
        Position pK = new Position(0,0);
        Position pM = new Position(0,0);
        
        MainCharacter koshi = new MainCharacter(pK,1,1,'K');    //Create koshi
        MainCharacter monkey = new MainCharacter(pM,1,1,'M');    //Create Monkey
//        
        
        while (true){
            Renderer.welcome();
            Renderer.draw_options();// could finish here
            for (LEVEL = 0; LEVEL < 3; LEVEL++){//0 for the tutorial
                Renderer.draw_history(LEVEL);
//                map = MapManager.fill_map(LEVEL);
                
                koshi.setPos(0,7); //hard-code
                monkey.setPos(0,0);  //hard-code                            
                                
                while (true){
//                    Renderer.draw_map(map, koshi, monkey);
//                    String comand = read(); // could finish here
                    Position posK = koshi.getPos();
                    Position posM = monkey.getPos();
//                    koshi.setStatus(map.getStatus(posK));
//                    monkey.setStatus(map.getStatus(posM));
//                    CommandInterpreter.execute(command, koshi, monkey);
//                    String condition = map.update(koshi,monkey);
                        
                      //It is logic from the map
//                    if (conditio.equals("win")){
//                       Renderer.draw_map(map, koshi, monkey);
//                       Renderer.draw_screen("next-level");//sale del bucle
//                       break;
//                    }
//                    if (lose()) {
//                        Renderer.draw_map(map, koshi, monkey);
//                        Renderer.draw_lose();
//                        lose_flag = true;
//                        break;
//                    }
                }
//              if (lose_flag) break;
//                
//              if (!lose_flag) {
//                Renderer.draw_win();
//                break;
//              }
            }
        }
    }
    private boolean lose(){
        return MainCharacter.getHealth() <= 0;
    }    
}
