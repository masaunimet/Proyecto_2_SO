/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Enums.CharacterTypeEnum;
import Enums.CompanyEnum;
import Enums.TierEnum;
import Threads.Administrator;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para crear Characters
 * @author Masa500
 */
public class CharacterBuilder {
    
    //Semaforo para el id del usuario UNICO
    private Semaphore idMutex = new Semaphore(1);
    int nextCharacterId = 0;
    
    public CharacterBuilder(){}
    
    /**
     * Crea un Character totalmente random
     * @return Character
     */
    public Character CreateCharacter(){
    
        Character ch = new Character();
        // poder Base random
        int power = (int) (Math.random() * 9);
        
        int randNum = (int) (Math.random() * 100);
        
        CharacterTypeEnum chType;
        
        //si el personaje tiene un numero bajo, sera de tipo normal
        if(randNum < CharacterTypeEnum.getNormalPercentage())
            chType = CharacterTypeEnum.NORMAL;
        //sino
        else{
            //numero random para saber si es evolucion o no
            boolean isSpecial = Math.random() > CharacterTypeEnum.getEvolPercentage();
            //Agarra un tipo de elemento (AIRE, AGUA, TIERRA, FUEGO, LUZ O OSCURIDAD)
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
    /**
     * Crea un Character basado en el Tier
     * @param tier CharacterTypeEnum - Tier al cual estara el personaje
     * @param name
     * @param companyType
     * @param pathToImage
     * @return Character
     */
    public Character CreateCharacter(TierEnum tier, String name, CompanyEnum companyType, String pathToImage){
    
        Character ch = new Character(name, companyType,pathToImage);
        boolean isSpecial = false;
        int power = 0;
        CharacterTypeEnum chType = CharacterTypeEnum.NORMAL;
        
        switch(tier){
            case WEAK:
                //Si es debil el poder sera de 0-4 y tipo normal
                power = (int) (Math.random() * 4);
                break;
            case NORMAL:
                //Indica 2 tipos de posibilidades para Character 
                boolean normal = Math.random() > CharacterTypeEnum.getNormalPercentage();
                //Si el character es del tipo normal
                if(normal){
                    power = (int) (Math.random() * 9);
                    break;
                }
                //Si el Character tiene un tipo distinto a Normal
                power = (int) (Math.random() * 4);
                chType = CharacterTypeEnum.byId((int) (Math.random() * CharacterTypeEnum.getSpecialLimit()));
                isSpecial = Math.random() > CharacterTypeEnum.getEvolPercentage();
                if(isSpecial)
                    chType = CharacterTypeEnum.byId(chType.getId()+ (1+CharacterTypeEnum.getSpecialLimit()));
                break;
            case STRONG:
                //Si es fuerte tiene un tipo distinto a Normal y su poder va de 0 -9
                power = (int) (Math.random() * 9);
                chType = CharacterTypeEnum.byId((int) (Math.random() * CharacterTypeEnum.getSpecialLimit()));
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
    
    /**
     * Usa el semaforo para settear el Id UNICO del Character
     * @return int
     */
    public int getId(){
    
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

    /**
     * Settea el TierEnum al character
     * @param chType CharacterTypeEnum - Tipó de Character
     * @param power int - poder del Character
     * @return TierEnum
     */
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
