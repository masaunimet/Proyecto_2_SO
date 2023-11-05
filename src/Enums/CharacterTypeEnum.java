/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Masa500
 */
public enum CharacterTypeEnum {
    
    AIR(0),
    WATER(1),
    EARTH(2),
    FIRE(3),
    LIGHT(4),
    DARKNESS(5),
    
    THUNDER(6),
    ICE(7),
    STEEL(8),
    MAGMA(9),
    ARMONY(10),
    CHAOS(11),
    
    NORMAL(12);
    
    private final int id;

    private CharacterTypeEnum(int id) {
	this.id = id;
    }
    
    public static CharacterTypeEnum byId(int id){
        
        for(CharacterTypeEnum chType : CharacterTypeEnum.values()){
            if(chType.getId() == id)
                return chType;
        }
        
        return NORMAL;
    }
    
    public static int getSpecialLimit(){
        
        return DARKNESS.getId();
    }
    
    public static double getEvolPercentage(){
        
        return 0.75;
    }
    
    public static double getNormalPercentage(){
        
        return 0.75;
    }

    //Getter
    public int getId() {
	return id;
    }
    
}
