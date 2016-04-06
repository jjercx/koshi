package koshi;

public class MapManager {

    public static Map fill_map(int level, MainCharacter koshi, MainCharacter monkey) {
        Map map = new Map(Game.WIDTH, Game.HEIGHT);
        Cell matrix[][] = new Cell[Game.HEIGHT][Game.WIDTH];
        char char_matrix[][] = get_char_matrix(level);
        String[] commands = get_commands(level);
        for (int j = 0; j < Game.HEIGHT; j++) {
            for (int i = 0; i < Game.WIDTH; i++) {
                switch (char_matrix[j][i]) {
                    case 'A':
                        koshi.setPos(i, j);
                        matrix[j][i] = new Cell(true, "normal", 'S', i, j);
                        break;
                    case 'S':
                        matrix[j][i] = new Cell(true, "normal", 'S', i, j);
                        break;
                    case 'B':
                        monkey.setPos(i, j);
                        matrix[j][i] = new Cell(true, "normal", 'N', i, j);
                        break;
                    case 'N':
                        matrix[j][i] = new Cell(true, "normal", 'N', i, j);
                        break;
                    case 'T':
                        if (j < 6) {
                            matrix[j][i] = new Cell(true, "trigger", 'N', i, j);
                        } else {
                            matrix[j][i] = new Cell(true, "trigger", 'S', i, j);
                        }
                        break;
                    case 'E':
                    case 'U':
                    case 'J':
                        if (j < 6) {
                            matrix[j][i] = new Cell(true, "enemy", 'N', i, j);
                        } else {
                            matrix[j][i] = new Cell(true, "enemy", 'S', i, j);
                        }
                        break;
                    case 'C':
                        matrix[j][i] = new Cell(true, "action", 'C', i, j);
                        break;
                    case 'D':
                        matrix[j][i] = new Cell(true, "duo", 'D', i, j);
                        break;                    
                    default:
                        matrix[j][i] = new Cell(false, "normal", char_matrix[j][i], i, j);
                        break;
                }
                
            }

        }
        for (int i=0; i<Game.HEIGHT; i++){
            matrix[i][15].setType("final");
        }
        map.setMatrix(matrix);
        
        map.setCommandA(commands[0]);
        map.setCommandB(commands[1]);
        map.setCommandD(commands[2]);
        return map;
    }

    private static String[] get_commands(int level) {
        String str[] = new String[3];
        switch (level) {
            case 0:
                str[1] = "";
                str[0] = "";
                str[2] = "IWUOQE";
                break;
            case 1:
                str[1] = "UOKL";
                str[0] = "";
                str[2] = "KWQEUO";
                break;
            case 2:
                str[1] = "KLIUOJ";
                str[0] = "WQEWW";
                str[2] = "";
                break;
        }
        return str;
    }

    private static char[][] get_char_matrix(int level) {

        if (level == 0) {
            char matrix[][]
                    = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                    {'B', 'N', 'N', '-', '-', '-', 'N', 'N', 'N', '-', '-', '-', '-', '-', '-', '-'},
                    {'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', '-', '-', '-', 'N', 'N'},
                    {'N', 'N', 'N', '-', '-', '-', 'N', 'N', 'N', 'N', 'N', '-', '-', '-', 'N', 'N'},
                    {'N', 'N', 'N', '-', '-', '-', 'N', 'N', 'N', 'N', 'N', '-', '-', '-', 'N', 'N'},
                    {'N', 'N', 'N', '-', '-', '-', 'N', 'N', 'N', 'N', 'N', 'N', 'D', 'N', 'N', 'N'},
                    {'S', 'S', 'S', 'S', 'p', 'p', 'S', 'S', 'S', 'S', 'g', 'g', 'r', 'r', 'S', 'S'},
                    {'S', 'S', 'S', 'S', 'p', 'p', 'S', 'S', 'S', 'S', 'g', 'g', 'r', 'r', 'S', 'S'},
                    {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'D', 'r', 'r', 'S', 'S'},
                    {'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'r', 'r', 'S', 'S'},
                    {'A', 'S', 'S', 'S', 'c', 'c', 'S', 'S', 'S', 'S', 'S', 'S', 'r', 'r', 'S', 'S'}};
            return matrix;
        } else if (level == 1) {
            char matrix[][] = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N'},
            {'B', 'N', 'N', 'N', 'N', 'N', 'C', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N'},
            {'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'D', 'N'},
            {'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r'},
            {'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r'},
            {'S', 'S', 'S', 'S', 'S', 'T', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'D', 'S', 'S'},
            {'S', 'S', 'S', 'S', 'S', 'T', 'E', 'E', 'S', 'S', 'S', 'D', 'S', 'S', 'S', 'S'},
            {'S', 'S', 'S', 'S', 'S', 'T', 'E', 'E', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
            {'A', 'S', 'S', 'S', 'S', 'T', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'}};
            return matrix;
        } else if (level == 2) {
            char matrix[][] = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'T', 'N', 'N', 'N'},
            {'B', 'N', 'N', 'N', 'N', 'N', 'C', 'N', 'N', 'N', 'N', 'N', 'T', 'U', 'U', 'N'},
            {'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'T', 'U', 'U', 'N'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'S', 'S', 'c', 'c', 'S', 'S', 'p', 'p', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
            {'S', 'S', 'c', 'c', 'S', 'S', 'p', 'p', 'S', 'S', 'S', 'D', 'S', 'S', 'S', 'S'},
            {'S', 'S', 'S', 'T', 'J', 'J', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'A', 'S', 'S', 'T', 'J', 'J', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}};
            return matrix;
        }
        return null;
    }

}
