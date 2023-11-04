/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import DB.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class AI extends Thread{
    
    private Buffer buffer;
    
    
    @Override
    public void run(){
        
        try {
            buffer.getS2().release();
            buffer.getS1().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
}
