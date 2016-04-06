package koshi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class MapManager {
    
    public static void fill_map(int level){
        Cell matrix[][];
        load_file("src\\koshi\\map" + level + ".txt");
    }
    
    private static void load_file(String name){
        BufferedReader file = null;
        String buff;
        try {
            file = new BufferedReader(new FileReader(name));
            try {
                while((buff=file.readLine())!=null ){
                    System.out.println(buff);
                }
            } catch (IOException e){
                System.out.println("exception");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
    
}
