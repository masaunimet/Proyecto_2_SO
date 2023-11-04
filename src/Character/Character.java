/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Enums.CharacterTypeEnum;
import Enums.CompanyEnum;

/**
 *
 * @author Masa500
 */
public class Character {
    
    private int id;
    private String name;
    private CharacterTypeEnum characterType;
    private CompanyEnum companyType;
    private int power;

    public Character() {}
    
    public Character(int id, String name, CharacterTypeEnum characterType, CompanyEnum companyType ,int power) {
        this.id = id;
        this.name = name;
        this.characterType = characterType;
        this.companyType = companyType;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CharacterTypeEnum getCharacterType() {
        return characterType;
    }

    public CompanyEnum getCompanyType() {
        return companyType;
    }

    public int getPower() {
        return power;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterType(CharacterTypeEnum characterType) {
        this.characterType = characterType;
    }

    public void setCompanyType(CompanyEnum companyType) {
        this.companyType = companyType;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    
}