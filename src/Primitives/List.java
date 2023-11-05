/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitives;

import Character.Character;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class List {

    private Node pFirst;
    private Node pLast;
    private int size;

    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public List(Node pFirst) {
        this.pFirst = pFirst;
        this.pLast = pFirst;
        this.size = 1;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void empty() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /*
    Agragegar a la lista y empieza a trabajar
     */
    public void addToList(Character data) {
        Node pNew = new Node(data);

        if (this.isEmpty()) {
            this.pFirst = pNew;
            this.pLast = pNew;
        } else {
            this.pLast.setpNext(pNew);
            this.pLast = pNew;
        }
        this.size++;

    }

    public Node getpFirst() {
        return pFirst;
    }
    
    public Node getNode(int index){
    
        if(index>= this.size)
            return null;
        
        Node node = this.getpFirst();
        
        for(int i=0; i < index; i++){
            
            node = node.getpNext();
        }
        
        return node;
    }

    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    public Node getpLast() {
        return pLast;
    }

    public void setpLast(Node pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
