/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Character.CharacterBuilder;
import Character.Character;
import DB.Buffer;
import Enums.CompanyEnum;
import Enums.TierEnum;

/**
 *
 * @author Andres
 */
public class Functions {

    public static void createCharacters(Buffer buffer) {
        CharacterBuilder cb = new CharacterBuilder();
        buffer.getNintendoCharacters()[0] = cb.CreateCharacter(TierEnum.STRONG, "Black Dragon", CompanyEnum.NINTENDO, "src\\characterImages\\blackDragon.jpg");
        buffer.getNintendoCharacters()[1] = cb.CreateCharacter(TierEnum.WEAK, "Bokoblin", CompanyEnum.NINTENDO, "src\\characterImages\\bokoblin.jpg");
        buffer.getNintendoCharacters()[2] = cb.CreateCharacter(TierEnum.NORMAL, "Bokoblin Army", CompanyEnum.NINTENDO, "src\\characterImages\\bokoblinArmy.jpg");
        buffer.getNintendoCharacters()[3] = cb.CreateCharacter(TierEnum.STRONG, "Demon King", CompanyEnum.NINTENDO, "src\\characterImages\\demonKing.jpg");
        buffer.getNintendoCharacters()[4] = cb.CreateCharacter(TierEnum.STRONG, "Dinraal", CompanyEnum.NINTENDO, "src\\characterImages\\dinraal.jpg");
        buffer.getNintendoCharacters()[5] = cb.CreateCharacter(TierEnum.STRONG, "Farosh", CompanyEnum.NINTENDO, "src\\characterImages\\farosh.jpg");
        buffer.getNintendoCharacters()[6] = cb.CreateCharacter(TierEnum.STRONG, "Ganondorf", CompanyEnum.NINTENDO, "src\\characterImages\\ganondorf.jpg");
        buffer.getNintendoCharacters()[7] = cb.CreateCharacter(TierEnum.WEAK, "Hetsu", CompanyEnum.NINTENDO, "src\\characterImages\\hetsu.jpg");
        buffer.getNintendoCharacters()[8] = cb.CreateCharacter(TierEnum.NORMAL, "Khoga", CompanyEnum.NINTENDO, "src\\characterImages\\khoga.jpg");
        buffer.getNintendoCharacters()[9] = cb.CreateCharacter(TierEnum.STRONG, "Light Dragon", CompanyEnum.NINTENDO, "src\\characterImages\\lightDragon.jpg");
        buffer.getNintendoCharacters()[10] = cb.CreateCharacter(TierEnum.STRONG, "Link", CompanyEnum.NINTENDO, "src\\characterImages\\link.jpg");
        buffer.getNintendoCharacters()[11] = cb.CreateCharacter(TierEnum.NORMAL, "Lynel", CompanyEnum.NINTENDO, "src\\characterImages\\lynel.jpg");
        buffer.getNintendoCharacters()[12] = cb.CreateCharacter(TierEnum.NORMAL, "Mineru", CompanyEnum.NINTENDO, "src\\characterImages\\mineru.jpg");
        buffer.getNintendoCharacters()[13] = cb.CreateCharacter(TierEnum.STRONG, "Naydra", CompanyEnum.NINTENDO, "src\\characterImages\\naydra.jpg");
        buffer.getNintendoCharacters()[14] = cb.CreateCharacter(TierEnum.NORMAL, "Rauru", CompanyEnum.NINTENDO, "src\\characterImages\\rauru.jpg");
        buffer.getNintendoCharacters()[15] = cb.CreateCharacter(TierEnum.NORMAL, "Riju", CompanyEnum.NINTENDO, "src\\characterImages\\riju.jpg");
        buffer.getNintendoCharacters()[16] = cb.CreateCharacter(TierEnum.NORMAL, "Sidon", CompanyEnum.NINTENDO, "src\\characterImages\\sidon.jpg");
        buffer.getNintendoCharacters()[17] = cb.CreateCharacter(TierEnum.NORMAL, "Tulin", CompanyEnum.NINTENDO, "src\\characterImages\\tulin.jpg");
        buffer.getNintendoCharacters()[18] = cb.CreateCharacter(TierEnum.NORMAL, "Yunobo", CompanyEnum.NINTENDO, "src\\characterImages\\yunobo.jpg");
        buffer.getNintendoCharacters()[19] = cb.CreateCharacter(TierEnum.NORMAL, "Zelda", CompanyEnum.NINTENDO, "src\\characterImages\\zelda.jpg");
        
        buffer.getCapcomCharacters()[0] = cb.CreateCharacter(TierEnum.STRONG, "Aki", CompanyEnum.CAPCOM, "src\\capcomImages\\aki.jpg");
        buffer.getCapcomCharacters()[1] = cb.CreateCharacter(TierEnum.WEAK, "Blanka", CompanyEnum.CAPCOM, "src\\capcomImages\\blanka.jpg");
        buffer.getCapcomCharacters()[2] = cb.CreateCharacter(TierEnum.STRONG, "Cammy", CompanyEnum.CAPCOM, "src\\capcomImages\\cammy.jpg");
        buffer.getCapcomCharacters()[3] = cb.CreateCharacter(TierEnum.STRONG, "Chunli", CompanyEnum.CAPCOM, "src\\capcomImages\\chunli.jpg");
        buffer.getCapcomCharacters()[4] = cb.CreateCharacter(TierEnum.STRONG, "Deejay", CompanyEnum.CAPCOM, "src\\capcomImages\\deejay.jpg");
        buffer.getCapcomCharacters()[5] = cb.CreateCharacter(TierEnum.STRONG, "Dhalsim", CompanyEnum.CAPCOM, "src\\capcomImages\\dhalsim.jpg");
        buffer.getCapcomCharacters()[6] = cb.CreateCharacter(TierEnum.WEAK, "Ehonda", CompanyEnum.CAPCOM, "src\\capcomImages\\ehonda.jpg");
        buffer.getCapcomCharacters()[7] = cb.CreateCharacter(TierEnum.NORMAL, "Guile", CompanyEnum.CAPCOM, "src\\capcomImages\\guile.jpg");
        buffer.getCapcomCharacters()[8] = cb.CreateCharacter(TierEnum.STRONG, "Jamie", CompanyEnum.CAPCOM, "src\\capcomImages\\jamie.jpg");
        buffer.getCapcomCharacters()[9] = cb.CreateCharacter(TierEnum.STRONG, "JP", CompanyEnum.CAPCOM, "src\\capcomImages\\jp.jpg");
        buffer.getCapcomCharacters()[10] = cb.CreateCharacter(TierEnum.NORMAL, "Juri", CompanyEnum.CAPCOM, "src\\capcomImages\\juri.jpg");
        buffer.getCapcomCharacters()[11] = cb.CreateCharacter(TierEnum.NORMAL, "Ken", CompanyEnum.CAPCOM, "src\\capcomImages\\ken.jpg");
        buffer.getCapcomCharacters()[12] = cb.CreateCharacter(TierEnum.STRONG, "Kimberly", CompanyEnum.CAPCOM, "src\\capcomImages\\kimberly.jpg");
        buffer.getCapcomCharacters()[13] = cb.CreateCharacter(TierEnum.NORMAL, "Lily", CompanyEnum.CAPCOM, "src\\capcomImages\\lily.jpg");
        buffer.getCapcomCharacters()[14] = cb.CreateCharacter(TierEnum.NORMAL, "Luke", CompanyEnum.CAPCOM, "src\\capcomImages\\luke.jpg");
        buffer.getCapcomCharacters()[15] = cb.CreateCharacter(TierEnum.NORMAL, "Manon", CompanyEnum.CAPCOM, "src\\capcomImages\\manon.jpg");
        buffer.getCapcomCharacters()[16] = cb.CreateCharacter(TierEnum.NORMAL, "Marisa", CompanyEnum.CAPCOM, "src\\capcomImages\\marisa.jpg");
        buffer.getCapcomCharacters()[17] = cb.CreateCharacter(TierEnum.NORMAL, "Rashid", CompanyEnum.CAPCOM, "src\\capcomImages\\rashid.jpg");
        buffer.getCapcomCharacters()[18] = cb.CreateCharacter(TierEnum.NORMAL, "Ryu", CompanyEnum.CAPCOM, "src\\capcomImages\\ryu.jpg");
        buffer.getCapcomCharacters()[19] = cb.CreateCharacter(TierEnum.NORMAL, "Zangief", CompanyEnum.CAPCOM, "src\\capcomImages\\zangief.jpg");
    }

}
