/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import DB.Buffer;
import Character.Character;
import Enums.CharacterTypeEnum;
import static Enums.CharacterTypeEnum.AIR;
import static Enums.CharacterTypeEnum.ARMONY;
import static Enums.CharacterTypeEnum.CHAOS;
import static Enums.CharacterTypeEnum.DARKNESS;
import static Enums.CharacterTypeEnum.EARTH;
import static Enums.CharacterTypeEnum.FIRE;
import static Enums.CharacterTypeEnum.ICE;
import static Enums.CharacterTypeEnum.LIGHT;
import static Enums.CharacterTypeEnum.MAGMA;
import static Enums.CharacterTypeEnum.NORMAL;
import static Enums.CharacterTypeEnum.STEEL;
import static Enums.CharacterTypeEnum.THUNDER;
import static Enums.CharacterTypeEnum.WATER;
import Enums.TierEnum;
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
            
            Character capcom = buffer.getCapcomFighter();
            Character nintendo = buffer.getNintendoFighter();
            
            sleep(1000);
            
            if(capcom != null && nintendo != null){
                
                int randNum = (int) Math.random() * 100;

                if(randNum < 40){

                    int capcomBuffs = getBuffBonus(capcom.getCharacterType(), nintendo.getCharacterType());
                    capcom.setPower(capcomBuffs+capcom.getPower());

                    int nintendoBuffs = getBuffBonus(nintendo.getCharacterType(), capcom.getCharacterType());
                    nintendo.setPower(nintendoBuffs+nintendo.getPower());
                    
                    if(nintendo.getPower() > capcom.getPower())
                        buffer.getCapcomWinningQueue().queue(nintendo);
                    else
                        buffer.getCapcomWinningQueue().queue(capcom);
                }

                else if(randNum < 67){
                    
                    getToTierQueue(capcom);
                    getToTierQueue(nintendo);
                }

                else{
                    
                    capcom.setTier(TierEnum.FIX);
                    getToTierQueue(capcom);
                    nintendo.setTier(TierEnum.FIX);
                    getToTierQueue(nintendo);
                }
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int getBuffBonus(CharacterTypeEnum characterType, CharacterTypeEnum enemyType) {
    
        CharacterTypeEnum [] temp = getGoodAgainst(characterType);
        
        int indexBuff = 0;
        int isNotNull = 0;
        int i =0;
        boolean buffFound = false;
        
        for(CharacterTypeEnum type :temp){
            
            if(type != null)
                isNotNull++;
            
            if(type == enemyType && !buffFound){
                indexBuff = i;
                buffFound = true;
            }
            else
                i++;
        }
        
        if(buffFound)
            return isNotNull-indexBuff;
        else
            return 0;
    }

    private CharacterTypeEnum[] getGoodAgainst(CharacterTypeEnum characterType) {
        
         CharacterTypeEnum [] goodAgainst =  new CharacterTypeEnum[3];
        
        switch(characterType){
            case AIR:
                goodAgainst[0] = CharacterTypeEnum.FIRE;
                goodAgainst[1] = CharacterTypeEnum.DARKNESS;
                goodAgainst[2] = null;
                break;
            case WATER:
                goodAgainst[0] = CharacterTypeEnum.EARTH;
                goodAgainst[1] = CharacterTypeEnum.LIGHT;
                goodAgainst[2] = null;
                break;
            case EARTH:
                goodAgainst[0] = CharacterTypeEnum.LIGHT;
                goodAgainst[1] = CharacterTypeEnum.AIR;
                goodAgainst[2] = null;
                break;
            case FIRE:
                goodAgainst[0] = CharacterTypeEnum.DARKNESS;
                goodAgainst[1] = CharacterTypeEnum.WATER;
                goodAgainst[2] = null;
                break;
            case LIGHT:
                goodAgainst[0] = CharacterTypeEnum.AIR;
                goodAgainst[1] = CharacterTypeEnum.FIRE;
                goodAgainst[2] = null;
                break;
            case DARKNESS:
                goodAgainst[0] = CharacterTypeEnum.WATER;
                goodAgainst[1] = CharacterTypeEnum.EARTH;
                goodAgainst[2] = null;
                break;
            case THUNDER:
                goodAgainst[0] = CharacterTypeEnum.FIRE;
                goodAgainst[1] = CharacterTypeEnum.DARKNESS;
                goodAgainst[2] = CharacterTypeEnum.WATER;
                break;
            case ICE:
                goodAgainst[0] = CharacterTypeEnum.EARTH;
                goodAgainst[1] = CharacterTypeEnum.LIGHT;
                goodAgainst[2] = CharacterTypeEnum.AIR;
                break;
            case STEEL:
                goodAgainst[0] = CharacterTypeEnum.LIGHT;
                goodAgainst[1] = CharacterTypeEnum.AIR;
                goodAgainst[2] = CharacterTypeEnum.FIRE;
                break;
            case MAGMA:
                goodAgainst[0] = CharacterTypeEnum.DARKNESS;
                goodAgainst[1] = CharacterTypeEnum.WATER;
                goodAgainst[2] = CharacterTypeEnum.EARTH;
                break;
            case ARMONY:
                goodAgainst[0] = CharacterTypeEnum.AIR;
                goodAgainst[1] = CharacterTypeEnum.FIRE;
                goodAgainst[2] = CharacterTypeEnum.DARKNESS;
                break;
            case CHAOS:
                goodAgainst[0] = CharacterTypeEnum.WATER;
                goodAgainst[1] = CharacterTypeEnum.EARTH;
                goodAgainst[2] = CharacterTypeEnum.LIGHT;
                break;
            case NORMAL:
                goodAgainst[0] = null;
                goodAgainst[1] = null;
                goodAgainst[2] = null;
                break;
            default:
                throw new AssertionError(characterType.name());
        }
        
        return goodAgainst;
    }

    private void getToTierQueue(Character ch) {
        
        switch(ch.getTier()){
            
            case WEAK:
                buffer.getCapcomQueue3().queue(ch);
                break;
            case NORMAL:
                buffer.getCapcomQueue2().queue(ch);
                break;
            case STRONG:
                buffer.getCapcomQueue1().queue(ch);
                break;
            case FIX:
                buffer.getCapcomQueue4().queue(ch);
                break;
            default:
                throw new AssertionError(ch.getTier().name());
        }
    }
}
