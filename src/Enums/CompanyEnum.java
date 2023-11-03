/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 * Puede identificar a una Compañia de forma inequivoca
 * @author Masa500
 */
public enum CompanyEnum {
    NINTENDO(0),
    CAPCOM(1);
	
    private final int id;

    /**
     * Constructor oculto para no crear sino solo ver tipos de trabajos
     * @param id int - identificador unico del tipo de compañia
     */
    private CompanyEnum(int id) {
	this.id = id;
    }

    //Getter
    public int getId() {
	return id;
    }
}
