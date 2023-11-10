/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

import Enums.CharacterTypeEnum;
import Enums.CompanyEnum;
import Enums.TierEnum;

/**
 *
 * @author Masa500
 */
public class Character implements Cloneable{
    
    private int id;
    private String name;
    private CharacterTypeEnum characterType;
    private CompanyEnum companyType;
    private TierEnum tier;
    private int power;
    private String image;
    private int tierColdown;

    public Character() {tierColdown = 0;}
    
    public Character(int id, String name, CharacterTypeEnum characterType, CompanyEnum companyType ,int power, String pathToImage) {
        this.id = id;
        this.name = name;
        this.characterType = characterType;
        this.companyType = companyType;
        this.power = power;
        this.image = pathToImage;
        tierColdown = 0;
    }
    
    // Overriding clone() method 
    // by simply calling Object class 
    // clone() method. 
    @Override
    public Character clone() throws CloneNotSupportedException 
    { 
        return (Character) super.clone(); 
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
    
    public TierEnum getTier() {
        return tier;
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
    
    public void setTier(TierEnum tier) {
        this.tier = tier;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    public int getTierColdown() {
        return tierColdown;
    }
    
    public void setTierColdown(int tierColdown) {
        this.tierColdown = tierColdown;
    }
}
