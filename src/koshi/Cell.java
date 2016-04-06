package koshi;

/**
 *
 * @author Juan José Ramírez Calderón
 */
public class Cell {
    
    private Position pos;
    private Position next[];
    private Position enemies[];
    
    private boolean walkable;
    private String type; //trigger, action, duo, normal, enemy
    private boolean active;
    private char sprite;

    public Cell(boolean walkable, String type, char sprite, int i, int j) {
        this.walkable = walkable;
        this.type = type;
        this.sprite = sprite;
        pos = new Position(i,j);
    }

    /**
     * @return the pos
     */
    public Position getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Position pos) {
        this.pos = pos;
    }

    /**
     * @return the next
     */
    public Position[] getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Position[] next) {
        this.next = next;
    }

    /**
     * @return the walkable
     */
    public boolean isWalkable() {
        return walkable;
    }

    /**
     * @param walkable the walkable to set
     */
    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the sprite
     */
    public char getSprite() {
        return sprite;
    }

    /**
     * @param sprite the sprite to set
     */
    public void setSprite(char sprite) {
        this.sprite = sprite;
    }
    
    
}
