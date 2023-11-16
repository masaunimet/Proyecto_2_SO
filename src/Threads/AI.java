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
import GUI.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Andres
 */
public class AI extends Thread {

    private final Buffer buffer;
    private final MainFrame window;

    public AI(Buffer buffer, MainFrame window) {
        this.buffer = buffer;
        this.window = window;
    }

    //TODO: Hacer que se actualice el MainFrame 
    @Override
    public void run() {
        while (true) {
            try {

                try {
                    buffer.getS2().release();
                    buffer.getS1().acquire();

                } catch (InterruptedException ex) {
                    Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);

                }

                //Estado de carga
                window.getNintendoFighterPicture().setIcon(buffer.getLoadImage());
                window.getCapcomFighterPicture().setIcon(buffer.getLoadImage());

                window.getCapcomFighterScore().setText("");
                window.getNintendoFighterScore().setText("");

                window.getCapcomFighterName().setText("");
                window.getNintendoFighterName().setText("");

                window.getCapcomFighterFrame().setIcon(null);
                window.getNintendoFighterFrame1().setIcon(null);

                window.repaint();
                window.getCapcomWinner().setText("SELECTING");
                window.getNintendoWinner().setText("SELECTING");
                sleep((long) buffer.getSimLoad());

                Character capcom = buffer.getCapcomFighter();
                Character nintendo = buffer.getNintendoFighter();

                if (capcom != null && nintendo != null) {

                    System.out.println(capcom.getName());
                    System.out.println(nintendo.getName());

                    window.getCapcomFighterFrame().setIcon(buffer.getBorderType(capcom.getCharacterType()));
                    window.getNintendoFighterFrame1().setIcon(buffer.getBorderType(nintendo.getCharacterType()));

                    window.getCapcomFighterScore().setText(capcom.getPower() + "");
                    window.getNintendoFighterScore().setText(nintendo.getPower() + "");

                    window.getCapcomFighterName().setText(capcom.getName());
                    window.getNintendoFighterName().setText(nintendo.getName());

                    ImageIcon iconNintendo = new ImageIcon(nintendo.getImage());
                    ImageIcon iconCapcom = new ImageIcon(capcom.getImage());
                    System.out.println(nintendo.getImage());
                    window.getNintendoFighterPicture().setIcon(iconNintendo);
                    window.getCapcomFighterPicture().setIcon(iconCapcom);

                    //Estado de batalla
                    window.getCapcomWinner().setText("DECIDING");
                    window.getNintendoWinner().setText("DECIDING");
                    sleep((long) buffer.getSimSpeed());

                    int randNum = (int) (Math.random() * 100);
                    System.out.println("Numero random: " + randNum);

                    if (randNum < 40) {

                        int capcomBuffs = getBuffBonus(capcom.getCharacterType(), nintendo.getCharacterType());
                        capcom.setPower(capcomBuffs + capcom.getPower());

                        int nintendoBuffs = getBuffBonus(nintendo.getCharacterType(), capcom.getCharacterType());
                        nintendo.setPower(nintendoBuffs + nintendo.getPower());

                        if (nintendo.getPower() > capcom.getPower()) {
                            buffer.getCapcomWinningQueue().queue(nintendo);
                            window.getCapcomWinner().setText("LOSER");
                            window.getNintendoWinner().setText("WINNER");
                            int nintendoScore = Integer.parseInt(window.getNintendoScore().getText());
                            nintendoScore++;
                            window.getNintendoScore().setText(String.valueOf(nintendoScore));
                        } else {
                            buffer.getCapcomWinningQueue().queue(capcom);
                            window.getCapcomWinner().setText("WINNER");
                            window.getNintendoWinner().setText("LOSER");
                            int capcomScore = Integer.parseInt(window.getCapcomScore().getText());
                            capcomScore++;
                            window.getCapcomScore().setText(String.valueOf(capcomScore));

                        }
                    } else if (randNum < 67) {

                        getToTierQueue(capcom);
                        getToTierQueue(nintendo);

                        window.getCapcomWinner().setText("TIE");
                        window.getNintendoWinner().setText("TIE");
                    } else {

                        capcom.setTier(TierEnum.FIX);
                        getToTierQueue(capcom);
                        nintendo.setTier(TierEnum.FIX);
                        getToTierQueue(nintendo);

                        window.getCapcomWinner().setText("FIX");
                        window.getNintendoWinner().setText("FIX");
                    }
                } else {
                    System.out.println("no hay personaje");
                }

//                window.getCapcomFighterScore().setText(capcom.getPower()+"");
                //           window.getNintendoFighterScore().setText(nintendo.getPower()+"");
                //Estado de Siguiente batalla o culminacion de una
                sleep((long) buffer.getNextSim());

            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
            window.getCapcomWinner().setText("");
            window.getNintendoWinner().setText("");
        }
    }

    private int getBuffBonus(CharacterTypeEnum characterType, CharacterTypeEnum enemyType) {

        CharacterTypeEnum[] temp = getGoodAgainst(characterType);

        int indexBuff = 0;
        int isNotNull = 0;
        int i = 0;
        boolean buffFound = false;

        for (CharacterTypeEnum type : temp) {

            if (type != null) {
                isNotNull++;
            }

            if (type == enemyType && !buffFound) {
                indexBuff = i;
                buffFound = true;
            } else {
                i++;
            }
        }

        if (buffFound) {
            return isNotNull - indexBuff;
        } else {
            return 0;
        }
    }

    private CharacterTypeEnum[] getGoodAgainst(CharacterTypeEnum characterType) {

        CharacterTypeEnum[] goodAgainst = new CharacterTypeEnum[3];

        switch (characterType) {
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
        switch (ch.getCompanyType()) {
            case CAPCOM:
                switch (ch.getTier()) {

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
                break;
            case NINTENDO:
                switch (ch.getTier()) {

                    case WEAK:
                        buffer.getNintendoQueue3().queue(ch);
                        break;
                    case NORMAL:
                        buffer.getNintendoQueue2().queue(ch);
                        break;
                    case STRONG:
                        buffer.getNintendoQueue1().queue(ch);
                        break;
                    case FIX:
                        buffer.getNintendoQueue4().queue(ch);
                        break;
                    default:
                        throw new AssertionError(ch.getTier().name());
                }
                break;
        }
    }
}
