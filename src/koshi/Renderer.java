/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koshi;
import java.util.Scanner;
import java.lang.Thread;
/**
 *
 * @author Alvaro
 */
public class Renderer{
// esta clase dibuja el mapa y las acciones    
//    private int A;
//    private int B;
    
    //methods
    
    public static void welcome(){
        System.out.println("           *   *  * * *  * * *  *   *  * ");
        System.out.println("           *  *   *   *  *      *   *  * ");
        System.out.println("           * *    *   *  *      *   *  * ");
        System.out.println("           * *    *   *  * * *  * * *  * ");
        System.out.println("           *  *   *   *      *  *   *  * ");
        System.out.println("           *   *  * * *  * * *  *   *  * ");
        System.out.println("               Y la selva del amazonas ");
        
        Scanner reader = new Scanner(System.in);
        String n = reader.nextLine();//esperara que el usuario escriba cual quier cosa o una tecla
        
    }
    
    public static void draw_options(){
        String op;
        
        //clean buffer
        
//        System.out.print("\033[H\033[2J");  
//        System.out.flush();
        for (int i = 0; i < 50; ++i) System.out.println();
        
        
        //
        
        System.out.println("a- Iniciar juego");
        System.out.println("b- Salir del juego");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        while(1==1){
            Scanner re = new Scanner(System.in);
            op = re.next();//me leera como cadena
            
            if(op.equals("b")){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");                
                System.out.println("                Vuelve pronto              ");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.exit(0);
            }else if(op.equals("a")){
                //acepto jugar, por lo tanto se cargara la pantalla de primer nivel
                break;
            }else{
                System.out.println("Ingrese opcion correcta.");
            }
        }
    }
    
        
    public static void draw_map(Map map, MainCharacter koshi, MainCharacter monkey){
        //clean buffer
        for (int i = 0; i < 50; ++i) System.out.println();
        //
        
        Cell [][]mapAct = map.getMatrix();
        
        Position pK = koshi.getPos();
        Position pM = monkey.getPos();
        int i,j;
        
        if(Game.LEVEL == 0){
        
            for(i=0;i<Game.WIDTH;i++){
                j=0;
                for(j=0;j<Game.HEIGHT;j++){


                    if(pK.getX()==i && pK.getY()==j){
                        char car = koshi.sprite;
                        System.out.print(car);
                    }else if(pM.getX()==i && pM.getY()==j){
                        char car = monkey.sprite;
                        System.out.print(car);
                    }
                    else{
                        System.out.print(mapAct[i][j].getSprite());
                    }

                }
                j++;
                j++;
                if(i==2){
                    //print the life                    
                    System.out.println(" Vida Restante de los jugadores: "+ koshi.getHeight());   
                }
                if(i==5) System.out.println(" Usa las teclas WASD para mover a Koshi y las teclas JKLI para mover al Mono.");
                if(i==7) System.out.println("Si ves un lugar marcado con las letras C o D (Mayusculas) ¡Parate sobre el! Podrás realizar acciones especiales.");
                if(i==9) System.out.println("Sólo podrás pasar los niveles con la ayuda de las acciones especiales. Para esto, tendrás que presionar comandos que se mostrarán en un cuadro de diálogo como éste.");
                if(i==11) System.out.println("Presionar botones que no pertenezcan a una secuencia de comandos reducirá puntos de vida.");
                if(i==13) System.out.println("Para activar los terrenos D, tienen que estar sobre ellos Koshi y el Mono al mismo tiempo, en los C sólo con un personaje sobre ellos basta.");
                if(i==15) System.out.println("");
            }
        }else if(Game.LEVEL == 1){
            for(i=0;i<Game.WIDTH;i++){
                j=0;
                for(j=0;j<Game.HEIGHT;j++){

                    if(pK.getX()==i && pK.getY()==j){
                        char car = koshi.sprite;
                        System.out.print(car);
                    }else if(pM.getX()==i && pM.getY()==j){
                        char car = monkey.sprite;
                        System.out.print(car);
                    }
                    else{
                        System.out.print(mapAct[i][j].getSprite());
                    }

                }                
                j++;
                j++;
                
                if(i==2){
                    //print the life
                    
                    System.out.println(" Vida Restante de los jugadores: "+ koshi.getHeight());   
                }
                if(i==5) System.out.println("Cuando aparece un enemigo, este te bajará puntos de vida. Si tus puntos de vida llegan a 0, se acabará el juego.");
                if(i==7) System.out.println("o	Los puntos de vida son los números en la parte superior de la pantalla. Estos son compartidos entre Koshi y el Mono.");
                if(i==9) System.out.println("o	Si un enemigo afecta a un personaje, este no se podrá mover. Tendrás que usar a su amigo para ayudarlo.");
                if(i==15)System.out.println("");
            }
        
        
        }else if(Game.LEVEL == 2){
            for(i=0;i<Game.WIDTH;i++){
                j=0;
                for(j=0;j<Game.HEIGHT;j++){

                    if(pK.getX()==i && pK.getY()==j){
                        char car = koshi.sprite;
                        System.out.print(car);
                    }else if(pM.getX()==i && pM.getY()==j){
                        char car = monkey.sprite;
                        System.out.print(car);
                    }
                    else{
                        System.out.print(mapAct[i][j].getSprite());
                    }

                }               
                j++;
                j++;
                
                if(i==2){
                    //print the life
                    
                    System.out.println(" Vida Restante de los jugadores: "+ koshi.getHeight());   
                }
                
                if(i==15)System.out.println("");
            }
            
        }else if(Game.LEVEL == 3){
            for(i=0;i<Game.WIDTH;i++){
                j=0;
                for(j=0;j<Game.HEIGHT;j++){
                    
                    if(pK.getX()==i && pK.getY()==j){
                        char car = koshi.sprite;
                        System.out.print(car);
                    }else if(pM.getX()==i && pM.getY()==j){
                        char car = monkey.sprite;
                        System.out.print(car);
                    }
                    else{
                        System.out.print(mapAct[i][j].getSprite());
                    }

                }
                
                j++;
                j++;
                
                if(i==2){
                    //print the life
                    
                    System.out.println(" Vida Restante de los jugadores: "+ koshi.getHeight());   
                }
                
                if(i==15) System.out.println("");
            }
        }    
    }
        
    
    
    public static void draw_history(int nivel){
        //limpiar consola
        for (int i = 0; i < 50; ++i) System.out.println();
        //
        
        if(nivel == 0)//pantalla de historia 1
        {    
            System.out.println("Koshi y su mono salen atraidos por la selva nocturna");
            try
            {
                Thread.sleep(3000);
            }catch(InterruptedException e){}
        }else if(nivel == 1)//pantalla de historia 2
        {
            System.out.println("Koshi y su mono son atrapados por el otorongo.");
            System.out.println(" El otorongo les cuenta su historia y Koshi y el mono consiguen convencerlo para que les traiga algo de agua negra.");
            try
            {
                Thread.sleep(3000);
            }catch(InterruptedException e){}
        }else if(nivel == 2)//pantalla de historia 3
        {
            System.out.println("Koshi y el mono se encuentran con el gallito de las rocas, quien les confirma lo del otorongo y les muestra el camino a casa.");
            try
            {
                Thread.sleep(3000);
            }catch(InterruptedException e){}
        }else if(nivel == 3)//pantalla de historia 4
        {
            System.out.println("Koshi y su mono regresan a la aldea y hablan con los pobladores para contarles todo. Juntos salen y ayudan a los animales.");
            try
            {
                Thread.sleep(3000);
            }catch(InterruptedException e){}
            
        }
    }
    public static void draw_win(){
        //limpiar consola
        for (int i = 0; i < 50; ++i) System.out.println();
        //
            
        System.out.println("                        Felicitaciones");
        System.out.println("Pudieron avisar a todos sobre el peligro que esta sufriendo el amazonas");
        try
        {
            Thread.sleep(3000);
        }catch(InterruptedException e){}
        
        System.exit(0);
        
    }
    
    public static void draw_lose(){
        //limpiar consola
        for (int i = 0; i < 50; ++i) System.out.println();
        //
        
        System.out.println("                            Lo lamento");
        System.out.println("No pudieron ayudar a koshi y su mono a resolver el misterio del amazonas");
        try
        {
            Thread.sleep(3000);
        }catch(InterruptedException e){}
    }
    
    
}
