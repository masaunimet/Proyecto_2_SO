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

    /**
     * Vacia una cola
     */
    public void empty() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Verifica si una cola esta vacia
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Recibiendo un personaje, lo encola
     *
     * @param character - personaje
     */
    public void queue(Character character) {
        Node pNew = new Node(character);
        if (isEmpty()) {
            tail.setpNext(pNew);
            tail = pNew;
        } else {
            head = pNew;
            tail = pNew;
        }
        size++;
    }
    
    /**
     * Recibiendo un personaje, lo encola un personaje nuevo
     *
     * @param character - personaje
     * @param id - es eñ od de personje
     */
    public void queue(Character character, int id) {
        Node pNew = new Node(character, id);
        if (isEmpty()) {
            tail.setpNext(pNew);
            tail = pNew;
        } else {
            head = pNew;
            tail = pNew;
        }
        size++;
    }

    /**
     * Desencola el primer nodo de la cola
     *
     * @return - Nodo desencolado
     */
    public Node dequeue() {
        Node character = head;
        if (!isEmpty()) {
            head = head.getpNext();
            size--;
        }
        return character;
    }

    /**
     * Aumenta en una unidad al atributo tunrsQueued de cada nodo. Si el
     * atributo es igual a 8, lo iguala a cero, lo desencola y lo encola en una
     * cola auxiliar.
     *
     * @return una cola de nodos que tengan turnsQueued == 8
     */
    public Queue verifyTurnsInQueue() {
        Queue qAux = new Queue();
        int originalSize = size;
        for (int i = 0; i < originalSize; i++) {
            Node pAux = dequeue();
            if (pAux.getTurnsQueued() == 8) {
                pAux.setTurnsQueued(0);
                qAux.queue(pAux.getData());
            } else {
                pAux.setTurnsQueued(pAux.getTurnsQueued() + 1);
                queue(pAux.getData());
            }
        }

        return qAux;
    }

    /**
     * Encola los nodos de una cola a otra
     *
     * @param q
     */
    public void queueAQueueInQueue(Queue q) {
        int originalQSize = q.getSize();
        for (int i = 0; i < originalQSize; i++) {
            Character cAux = q.dequeue().getData();
            queue(cAux);
        }

    }

    /**
     * Innserta en un array los nombres y los ids de los personajes en un nodo
     *
     * @return el array generado
     */
    public String[] queueToArray() {
        int originalSize = size;
        String[] output = new String[size];

        for (int i = 0; i < originalSize; i++) {
            Node pAux = dequeue();
            output[i] = String.valueOf(pAux.getData().getId()) + ": " + pAux.getData().getName();
            queue(pAux.getData());
        }
        return output;
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
