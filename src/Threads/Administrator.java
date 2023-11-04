/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import DB.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import Character.Character;
import Primitives.Queue;

/**
 *
 * @author Andres
 */
public class Administrator extends Thread {
    
    private Buffer buffer;
    
    
    
    @Override
    public void run(){
        
        try {
            buffer.getS1().release();
            buffer.getS2().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (buffer.getNumberOfCycles() == 2){
            
            double random = Math.random();
            if (random < 0.8){
                int randomCharacter = (int) Math.round(20*Math.random());
                Character nintendoCharacter = buffer.getNintendoCharacters()[randomCharacter];
                Character capcomCharacter = buffer.getCapcomCharacters()[randomCharacter];
                
                //TODO: Meter en la cola correspondiente segun su fuerza
                
            }
            
        }
            
        Queue longWaitersNQ3 = buffer.getNintendoQueue3().verifyTurnsInQueue();
        buffer.getNintendoQueue2().queueAQueueInQueue(longWaitersNQ3);
        
        Queue longWaitersCQ3 = buffer.getCapcomQueue3().verifyTurnsInQueue();
        buffer.getCapcomQueue2().queueAQueueInQueue(longWaitersCQ3);        

        Queue longWaitersNQ2 = buffer.getNintendoQueue2().verifyTurnsInQueue();
        buffer.getNintendoQueue1().queueAQueueInQueue(longWaitersNQ2);
        
        Queue longWaitersCQ2 = buffer.getCapcomQueue2().verifyTurnsInQueue();
        buffer.getCapcomQueue1().queueAQueueInQueue(longWaitersCQ2);        
        
        buffer.setCapcomFighter(buffer.getCapcomQueue1().dequeue().getData());
        buffer.setNintendoFighter(buffer.getNintendoQueue1().dequeue().getData());
        
        buffer.setNumberOfCycles(buffer.getNumberOfCycles() + 1);
        
    }
    
}
