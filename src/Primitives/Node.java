package Primitives;

import Character.Character;
/**
 *
 * @author Andres
 */
public class Node {
    
    private Character data;
    private Node pNext;
    private int turnsQueued;

    public Node(Character data){
        this.data = data;
    }
    
    /**
     * @return the data
     */
    public Character getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Character data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Node getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the turnsQueued
     */
    public int getTurnsQueued() {
        return turnsQueued;
    }

    /**
     * @param turnsQueued the turnsQueued to set
     */
    public void setTurnsQueued(int turnsQueued) {
        this.turnsQueued = turnsQueued;
    }
    
    
    
    
}
