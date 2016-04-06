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
    private String type; //trigger, action, duo, normal, enemy, final
    private boolean active;
    private boolean dead;
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

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the enemies
     */
    public Position[] getEnemies() {
        return enemies;
    }

    /**
     * @param enemies the enemies to set
     */
    public void setEnemies(Position[] enemies) {
        this.enemies = enemies;
    }

    /**
     * @return the dead
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * @param dead the dead to set
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * @return the final_condition
     */
    public boolean isFinal_condition() {
        return final_condition;
    }

    /**
     * @param final_condition the final_condition to set
     */
    public void setFinal_condition(boolean final_condition) {
        this.final_condition = final_condition;
    }
    
    
}
