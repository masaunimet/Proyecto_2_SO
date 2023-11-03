/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Enums.CharacterTypeEnum;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Masa500
 */
public class CharacterBuilder {
    
    private Semaphore idMutex = new Semaphore(1);
    int nextCharacterId = 0;
    
    public CharacterBuilder(){}
    
    public Character CreateCharacter(){
    
        Character ch = new Character();
        
        CharacterTypeEnum chType;
        
        chType = CharacterTypeEnum.byId((int) Math.random() * CharacterTypeEnum.values().length);
        
        return ch;
    }
}
