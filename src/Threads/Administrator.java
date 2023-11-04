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
    public void run() {
        while (true) {

            //Sincronizacion de procesos
            try {
                buffer.getS1().release();
                buffer.getS2().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (buffer.getNumberOfCycles() == 2) {

                double random = Math.random();
                if (random < 0.8) {
                    int randomCharacter = (int) Math.round(20 * Math.random());
                    Character nintendoCharacter = buffer.getNintendoCharacters()[randomCharacter];
                    Character capcomCharacter = buffer.getCapcomCharacters()[randomCharacter];

                    //TODO: Meter en la cola correspondiente segun su fuerza (Nota: Hacerlo en una funcion para que al inciar el proyecto no tener que reescribirlo)
                }

            }

            //Revisa a quienes teien que cambiar de cola 
            Queue longWaitersNQ3 = buffer.getNintendoQueue3().verifyTurnsInQueue();
            buffer.getNintendoQueue2().queueAQueueInQueue(longWaitersNQ3);

            Queue longWaitersCQ3 = buffer.getCapcomQueue3().verifyTurnsInQueue();
            buffer.getCapcomQueue2().queueAQueueInQueue(longWaitersCQ3);

            Queue longWaitersNQ2 = buffer.getNintendoQueue2().verifyTurnsInQueue();
            buffer.getNintendoQueue1().queueAQueueInQueue(longWaitersNQ2);

            Queue longWaitersCQ2 = buffer.getCapcomQueue2().verifyTurnsInQueue();
            buffer.getCapcomQueue1().queueAQueueInQueue(longWaitersCQ2);

            Character NintendoFighter = null;
            Character CapcomFighter = null;

            //Capcom Fighter
            if (!buffer.getCapcomQueue1().isEmpty()) {
                CapcomFighter = buffer.getCapcomQueue1().dequeue().getData();
            } else if (!buffer.getCapcomQueue2().isEmpty()) {
                CapcomFighter = buffer.getCapcomQueue2().dequeue().getData();
            } else if (!buffer.getCapcomQueue3().isEmpty()) {
                CapcomFighter = buffer.getCapcomQueue3().dequeue().getData();
            }

            //Nintendo Fighter
            if (!buffer.getNintendoQueue1().isEmpty()) {
                NintendoFighter = buffer.getNintendoQueue1().dequeue().getData();
            } else if (!buffer.getNintendoQueue2().isEmpty()) {
                NintendoFighter = buffer.getNintendoQueue2().dequeue().getData();
            } else if (!buffer.getNintendoQueue3().isEmpty()) {
                NintendoFighter = buffer.getNintendoQueue3().dequeue().getData();
            }

            //Pone en el buffer al peleador que le toca para que el AI lo tome
            buffer.setCapcomFighter(NintendoFighter);
            buffer.setCapcomFighter(CapcomFighter);

            buffer.setNumberOfCycles(buffer.getNumberOfCycles() + 1);

        }

    }
}
