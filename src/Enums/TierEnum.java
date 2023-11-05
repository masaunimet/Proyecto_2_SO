/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Masa500
 */
public enum TierEnum {
    
    WEAK(0),
    NORMAL(1),
    STRONG(2),
    FIX(3);
    
    private final int id;

    private TierEnum(int id) {
	this.id = id;
    }
    
}
