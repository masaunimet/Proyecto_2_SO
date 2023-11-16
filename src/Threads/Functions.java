/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import Character.Character;
import DB.Buffer;
import Primitives.Node;

/**
 *
 * @author Andres
 */
public class Functions {

    public void queueNewCharacter(Character character,Buffer buffer) {
        switch (character.getCompanyType()) {
            case CAPCOM:
                switch (character.getTier()) {
                    case WEAK:
                        buffer.getCapcomQueue3().queue(character);
                        break;
                    case NORMAL:
                        buffer.getCapcomQueue2().queue(character);
                        break;
                    case STRONG:
                        buffer.getCapcomQueue1().queue(character);
                        break;
                }
                break;
            case NINTENDO:
                switch (character.getTier()) {
                    case WEAK:
                        buffer.getNintendoQueue3().queue(character);
                        break;
                    case NORMAL:
                        buffer.getNintendoQueue2().queue(character);
                        break;
                    case STRONG:
                        buffer.getNintendoQueue1().queue(character);
                        break;
                }
        }

    }

}
