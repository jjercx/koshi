package koshi;

/**
 *
 * @author Juan José Ramírez Calderón
 */
public class Map {
    
    private int width;
    private int height;
    private Cell matrix[][];
    
    private String commandA;
    private String commandB;
    private String commandD;
    
    Map(int width, int height){
        this.width = width;
        this.height = height;
        matrix = new Cell[width][height];
    }
    
    public String update(MainCharacter A, MainCharacter B){
        
        check_triggers(A);
        check_triggers(B);
        if (check_victory(A) && check_victory(B)){
            return "win";
        }
        check_enemies(A);
        check_enemies(B);
        return "";
    }
    
    private void check_enemies(MainCharacter A){
        Position pos = A.getPos();
        Cell cell = matrix[pos.getY()][pos.getX()+1];
        if (cell.getType().equals("enemy") && cell.isActive()) {
            MainCharacter.setHealth(MainCharacter.getHealth()-1);        
        }
    }
    
    private void check_triggers(MainCharacter A){
        //checar para triggers
        Position pos = A.getPos();
        Cell cell = matrix[pos.getY()][pos.getX()];
        if (cell.getType().equals("trigger") && cell.isActive()){
            cell.setActive(false);
            Position enemies_pos[] = cell.getEnemies();
            for (int i=0; i<enemies_pos.length; i++){
                int enemy_x = enemies_pos[i].getX();
                int enemy_y = enemies_pos[i].getY();
                Cell enemy_cell = matrix[enemy_x][enemy_y];
                if (!enemy_cell.isDead()){
                    enemy_cell.setActive(true);
                    enemy_cell.setDead(true);
                }
            }
        }
    }
    
    private boolean check_victory(MainCharacter A){
        Position pos = A.getPos();
        Cell cell = matrix[pos.getY()][pos.getX()];
        return cell.getType().equals("final");
    }
    
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the matrix
     */
    public Cell[][] getMatrix() {
        return matrix;
    }

    /**
     * @param matrix the matrix to set
     */
    public void setMatrix(Cell[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * @return the commandA
     */
    public String getCommandA() {
        return commandA;
    }

    /**
     * @param commandA the commandA to set
     */
    public void setCommandA(String commandA) {
        this.commandA = commandA;
    }

    /**
     * @return the commandB
     */
    public String getCommandB() {
        return commandB;
    }

    /**
     * @param commandB the commandB to set
     */
    public void setCommandB(String commandB) {
        this.commandB = commandB;
    }

    /**
     * @return the commandD
     */
    public String getCommandD() {
        return commandD;
    }

    /**
     * @param commandD the commandD to set
     */
    public void setCommandD(String commandD) {
        this.commandD = commandD;
    }

}
