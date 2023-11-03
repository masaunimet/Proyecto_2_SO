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
    
    AIR(1),
    WATER(2),
    EARTH(3),
    FIRE(4),
    LIGHT(5),
    DARKNESS(6),
    NORMAL(7);
    
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

    //Getter
    public int getId() {
	return id;
    }
    
}
