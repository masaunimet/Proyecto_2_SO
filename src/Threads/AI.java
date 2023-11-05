/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import DB.Buffer;
import Character.Character;
import Enums.CharacterTypeEnum;
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
            
            CharacterTypeEnum [] capcomBuffs = getGoodAgainst(capcom.getCharacterType());
            CharacterTypeEnum [] nintendoBuffs = getGoodAgainst(nintendo.getCharacterType());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public CharacterTypeEnum [] getGoodAgainst(CharacterTypeEnum typeEnum) {
    
        CharacterTypeEnum [] temp =  new CharacterTypeEnum[3];
        
        switch(typeEnum){
            case AIR:
                temp[0] = CharacterTypeEnum.FIRE;
                temp[1] = CharacterTypeEnum.DARKNESS;
                temp[2] = null;
                break;
            case WATER:
                temp[0] = CharacterTypeEnum.EARTH;
                temp[1] = CharacterTypeEnum.LIGHT;
                temp[2] = null;
                break;
            case EARTH:
                temp[0] = CharacterTypeEnum.LIGHT;
                temp[1] = CharacterTypeEnum.AIR;
                temp[2] = null;
                break;
            case FIRE:
                temp[0] = CharacterTypeEnum.DARKNESS;
                temp[1] = CharacterTypeEnum.WATER;
                temp[2] = null;
                break;
            case LIGHT:
                temp[0] = CharacterTypeEnum.AIR;
                temp[1] = CharacterTypeEnum.FIRE;
                temp[2] = null;
                break;
            case DARKNESS:
                temp[0] = CharacterTypeEnum.WATER;
                temp[1] = CharacterTypeEnum.EARTH;
                temp[2] = null;
                break;
            case THUNDER:
                temp[0] = CharacterTypeEnum.FIRE;
                temp[1] = CharacterTypeEnum.DARKNESS;
                temp[2] = CharacterTypeEnum.WATER;
                break;
            case ICE:
                temp[0] = CharacterTypeEnum.EARTH;
                temp[1] = CharacterTypeEnum.LIGHT;
                temp[2] = CharacterTypeEnum.AIR;
                break;
            case STEEL:
                temp[0] = CharacterTypeEnum.LIGHT;
                temp[1] = CharacterTypeEnum.AIR;
                temp[2] = CharacterTypeEnum.FIRE;
                break;
            case MAGMA:
                temp[0] = CharacterTypeEnum.DARKNESS;
                temp[1] = CharacterTypeEnum.WATER;
                temp[2] = CharacterTypeEnum.EARTH;
                break;
            case ARMONY:
                temp[0] = CharacterTypeEnum.AIR;
                temp[1] = CharacterTypeEnum.FIRE;
                temp[2] = CharacterTypeEnum.DARKNESS;
                break;
            case CHAOS:
                temp[0] = CharacterTypeEnum.WATER;
                temp[1] = CharacterTypeEnum.EARTH;
                temp[2] = CharacterTypeEnum.LIGHT;
                break;
            case NORMAL:
                temp[0] = null;
                temp[1] = null;
                temp[2] = null;
                break;
            default:
                throw new AssertionError(typeEnum.name());
        }
        
            return temp;
    }
}
