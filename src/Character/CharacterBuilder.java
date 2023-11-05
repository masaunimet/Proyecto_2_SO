/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Enums.CharacterTypeEnum;
import Enums.TierEnum;
import Threads.Administrator;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        int power = (int) Math.random() * 9;
        
        int randNum = (int) Math.random() * 100;
        
        CharacterTypeEnum chType;
        
        if(randNum < CharacterTypeEnum.getNormalPercentage())
            chType = CharacterTypeEnum.NORMAL;
        
        else{
            
            boolean isSpecial = Math.random() > CharacterTypeEnum.getEvolPercentage();
            
            chType = CharacterTypeEnum.byId((int) Math.random()*CharacterTypeEnum.getSpecialLimit());
            
            if(isSpecial)
                chType = CharacterTypeEnum.byId(chType.getId()+ (1+CharacterTypeEnum.getSpecialLimit()));
        }
        
        ch.setPower(power);
        ch.setCharacterType(chType);
        ch.setTier(getTier(chType, power));
        ch.setId(this.getId());
        
        return ch;
    }
    
    public Character CreateCharacter(TierEnum tier){
    
        Character ch = new Character();
        boolean isSpecial = false;
        int power = 0;
        CharacterTypeEnum chType = CharacterTypeEnum.NORMAL;
        
        switch(tier){
            case WEAK:
                power = (int) Math.random() * 4;
                break;
            case NORMAL:
                
                boolean normal = Math.random() > CharacterTypeEnum.getNormalPercentage();
                
                if(normal){
                    power = (int) Math.random() * 9;
                    break;
                }
                
                power = (int) Math.random() * 4;
                chType = CharacterTypeEnum.byId((int) Math.random()*CharacterTypeEnum.getSpecialLimit());
                isSpecial = Math.random() > CharacterTypeEnum.getEvolPercentage();
                if(isSpecial)
                    chType = CharacterTypeEnum.byId(chType.getId()+ (1+CharacterTypeEnum.getSpecialLimit()));
                break;
            case STRONG:
                power = (int) Math.random() * 9;
                chType = CharacterTypeEnum.byId((int) Math.random()*CharacterTypeEnum.getSpecialLimit());
                isSpecial = Math.random() > CharacterTypeEnum.getEvolPercentage();
                if(isSpecial)
                    chType = CharacterTypeEnum.byId(chType.getId()+ (1+CharacterTypeEnum.getSpecialLimit()));
                break;
            case FIX:
                break;
            default:
                throw new AssertionError(tier.name());
        }
        
        ch.setPower(power);
        ch.setCharacterType(chType);
        ch.setTier(getTier(chType, power));
        ch.setId(this.getId());
        
        return ch;
    }
    
    private int getId(){
    
        try{
            
            idMutex.acquire(1);
            nextCharacterId ++;
            idMutex.release();
        }
        catch(InterruptedException e){
            Logger.getLogger(CharacterBuilder.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nextCharacterId;
    }

    private TierEnum getTier(CharacterTypeEnum chType, int power) {
        
        TierEnum selectedTier = TierEnum.WEAK;
        
        if(chType == CharacterTypeEnum.NORMAL && power > 5)
            selectedTier = TierEnum.NORMAL;
        
        else if(chType != CharacterTypeEnum.NORMAL && power < 5)
            selectedTier = TierEnum.NORMAL;
        
        else if(chType != CharacterTypeEnum.NORMAL && power > 5)
             selectedTier = TierEnum.STRONG;
            
        return selectedTier;
    }
}
