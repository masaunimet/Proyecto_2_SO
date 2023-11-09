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

    public void queueNewCharacter(Character character, Buffer buffer) {
        switch (character.getCompanyType()) {
            case CAPCOM:
                switch (character.getTier()) {
                    case WEAK:
                        //TODO: Enconlar personaje de capcom en su cola
                        break;
                    case NORMAL:
                        //TODO: Enconlar personaje de capcom en su cola
                        break;
                    case STRONG:
                        //TODO: Enconlar personaje de capcom en su cola

                        break;
                }
                break;
            case NINTENDO:
                switch (character.getTier()) {
                    case WEAK:
                        //TODO: Enconlar personaje de nintendo en la colabuffer.getNintendoQueue3().queue(character, id);

                        break;
                    case NORMAL:
                        //TODO: Enconlar personaje de nintendo en la cola
                        break;
                    case STRONG:
                        //TODO: Enconlar personaje de nintendo en la cola
                        break;
                }
        }

    }

}
