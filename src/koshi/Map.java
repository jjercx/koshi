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
