/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitives;

import Character.Character;

/**
 *
 * @author Andres
 */
public class Queue {
    
    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        
    }

    
    public void empty(){
        this.head = null;
        this.tail = null;
        this.size = 0;    
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void queue(Character character){
        Node pNew = new Node(character);
        if (isEmpty()){            
            tail.setpNext(pNew);
            tail = pNew;
        }else{
            head = pNew;
            tail = pNew;
        }
        size++;
    }
    
    public Node dequeue(){
        Node character = head;
        if (isEmpty()){
            head = head.getpNext();
            size--;
        }
        return character;
    }
    
    public Queue verifyTurnsInQueue(){
        Queue qAux = new Queue();
        int originalSize = size;
        for (int i = 0; i < originalSize; i++) {
            Node pAux = dequeue();
            if (pAux.getTurnsQueued() == 8){
                pAux.setTurnsQueued(0);
                qAux.queue(pAux.getData());
            }else{
                pAux.setTurnsQueued(pAux.getTurnsQueued() + 1);
                queue(pAux.getData());
            }
        }
        
        return qAux;
    }
    
    public void queueAQueueInQueue(Queue q){
        int originalQSize = q.getSize();
        for (int i = 0; i < originalQSize; i++) {
            Character cAux = q.dequeue().getData();
            queue(cAux);
        }
        
    }
    
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
    
}
