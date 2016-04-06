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
        
        //Limpiando el buffer
        
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
            
        System.out.println("Felicitaciones");
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
        
        System.out.println("Lo lamento");
        System.out.println("No pudieron ayudar a koshi y su mono a resolver el misterio del amazonas");
        try
        {
            Thread.sleep(3000);
        }catch(InterruptedException e){}
    }
    
    
}
