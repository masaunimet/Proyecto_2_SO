/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Character.Character;
import Enums.CharacterTypeEnum;
import Primitives.Queue;
import java.awt.Image;
import java.util.concurrent.Semaphore;
import javax.swing.ImageIcon;

/**
 *
 * @author Andres
 */
public class Buffer {

    //Personajes
    private final Character[] nintendoCharacters = new Character[20];
    private final Character[] capcomCharacters = new Character[20];

    //colas de Victoria
    private Queue capcomWinningQueue = new Queue();
    private Queue nintendoWinningQueue = new Queue();

    //Colas de prioridad Nintendo
    private Queue nintendoQueue1 = new Queue();
    private Queue nintendoQueue2 = new Queue();
    private Queue nintendoQueue3 = new Queue();
    private Queue nintendoQueue4 = new Queue();

    //Colas de prioradad Capcom
    private Queue capcomQueue1 = new Queue();
    private Queue capcomQueue2 = new Queue();
    private Queue capcomQueue3 = new Queue();
    private Queue capcomQueue4 = new Queue();

    //Semaforos de sincornización
    private final Semaphore s1 = new Semaphore(0);
    private final Semaphore s2 = new Semaphore(0);

    //Ciclo de revision
    private int numberOfCycles = 0;

    //Fighters
    private Character nintendoFighter;
    private Character capcomFighter;

    //Velocidad de simulacion
    private double simSpeed = 1000;
    private double simLoad = 2000;
    private double nextSim = 4000;

    //Imagenes
    private ImageIcon loadImage = new ImageIcon("src\\Images\\loading-gif-png-5-export.gif");

    public ImageIcon getBorderType(CharacterTypeEnum type) {

        ImageIcon border = null;

        switch (type) {
            case AIR:
                border = new ImageIcon("src\\Images\\Air.png");
                break;
            case WATER:
                border = new ImageIcon("src\\Images\\Water.png");
                break;
            case EARTH:
                border = new ImageIcon("src\\Images\\Earth.png");
                break;
            case FIRE:
                border = new ImageIcon("src\\Images\\Fire.png");
                break;
            case LIGHT:
                border = new ImageIcon("src\\Images\\Light.png");
                break;
            case DARKNESS:
                border = new ImageIcon("src\\Images\\Dark.png");
                break;
            case THUNDER:
                border = new ImageIcon("src\\Images\\Thunder.png");
                break;
            case ICE:
                border = new ImageIcon("src\\Images\\Ice.png");
                break;
            case STEEL:
                border = new ImageIcon("src\\Images\\Steel.png");
                break;
            case MAGMA:
                border = new ImageIcon("src\\Images\\Lava.png");
                break;
            case ARMONY:
                border = new ImageIcon("src\\Images\\Armony.png");
                break;
            case CHAOS:
                border = new ImageIcon("src\\Images\\Chaos.png");
                break;
            case NORMAL:
                border = new ImageIcon("src\\Images\\Normal.png");
                break;
            default:
                throw new AssertionError(type.name());
        }

        return border;
    }

    /**
     * @return the nintendoCharacters
     */
    public Character[] getNintendoCharacters() {
        return nintendoCharacters;
    }

    /**
     * @return the capcomCharacters
     */
    public Character[] getCapcomCharacters() {
        return capcomCharacters;
    }

    /**
     * @return the nintendoQueue1
     */
    public Queue getNintendoQueue1() {
        return nintendoQueue1;
    }

    /**
     * @param nintendoQueue1 the nintendoQueue1 to set
     */
    public void setNintendoQueue1(Queue nintendoQueue1) {
        this.nintendoQueue1 = nintendoQueue1;
    }

    /**
     * @return the nintendoQueue2
     */
    public Queue getNintendoQueue2() {
        return nintendoQueue2;
    }

    /**
     * @param nintendoQueue2 the nintendoQueue2 to set
     */
    public void setNintendoQueue2(Queue nintendoQueue2) {
        this.nintendoQueue2 = nintendoQueue2;
    }

    /**
     * @return the nintendoQueue3
     */
    public Queue getNintendoQueue3() {
        return nintendoQueue3;
    }

    /**
     * @param nintendoQueue3 the nintendoQueue3 to set
     */
    public void setNintendoQueue3(Queue nintendoQueue3) {
        this.nintendoQueue3 = nintendoQueue3;
    }

    /**
     * @return the nintendoQueue4
     */
    public Queue getNintendoQueue4() {
        return nintendoQueue4;
    }

    /**
     * @param nintendoQueue4 the nintendoQueue4 to set
     */
    public void setNintendoQueue4(Queue nintendoQueue4) {
        this.nintendoQueue4 = nintendoQueue4;
    }

    /**
     * @return the capcomQueue1
     */
    public Queue getCapcomQueue1() {
        return capcomQueue1;
    }

    /**
     * @param capcomQueue1 the capcomQueue1 to set
     */
    public void setCapcomQueue1(Queue capcomQueue1) {
        this.capcomQueue1 = capcomQueue1;
    }

    /**
     * @return the capcomQueue2
     */
    public Queue getCapcomQueue2() {
        return capcomQueue2;
    }

    /**
     * @param capcomQueue2 the capcomQueue2 to set
     */
    public void setCapcomQueue2(Queue capcomQueue2) {
        this.capcomQueue2 = capcomQueue2;
    }

    /**
     * @return the capcomQueue3
     */
    public Queue getCapcomQueue3() {
        return capcomQueue3;
    }

    /**
     * @param capcomQueue3 the capcomQueue3 to set
     */
    public void setCapcomQueue3(Queue capcomQueue3) {
        this.capcomQueue3 = capcomQueue3;
    }

    /**
     * @return the capcomQueue4
     */
    public Queue getCapcomQueue4() {
        return capcomQueue4;
    }

    /**
     * @param capcomQueue4 the capcomQueue4 to set
     */
    public void setCapcomQueue4(Queue capcomQueue4) {
        this.capcomQueue4 = capcomQueue4;
    }

    /**
     * @return the s1
     */
    public Semaphore getS1() {
        return s1;
    }

    /**
     * @return the s2
     */
    public Semaphore getS2() {
        return s2;
    }

    /**
     * @return the numberOfCycles
     */
    public int getNumberOfCycles() {
        return numberOfCycles;
    }

    /**
     * @param numberOfCycles the numberOfCycles to set
     */
    public void setNumberOfCycles(int numberOfCycles) {
        this.numberOfCycles = numberOfCycles;
    }

    /**
     * @return the nintendoFighter
     */
    public Character getNintendoFighter() {
        return nintendoFighter;
    }

    /**
     * @param nintendoFighter the nintendoFighter to set
     */
    public void setNintendoFighter(Character nintendoFighter) {
        this.nintendoFighter = nintendoFighter;
    }

    /**
     * @return the capcomFighter
     */
    public Character getCapcomFighter() {
        return capcomFighter;
    }

    /**
     * @param capcomFighter the capcomFighter to set
     */
    public void setCapcomFighter(Character capcomFighter) {
        this.capcomFighter = capcomFighter;
    }

    /**
     * @return the nintendoWinningQueue
     */
    public Queue getNintendoWinningQueue() {
        return nintendoWinningQueue;
    }

    /**
     * @param nintendoWinningQueue the nintendoWinningQueue to set
     */
    public void setNintendoWinningQueue(Queue nintendoWinningQueue) {
        this.nintendoWinningQueue = nintendoWinningQueue;
    }

    /**
     * @return the capcomWinningQueue
     */
    public Queue getCapcomWinningQueue() {
        return capcomWinningQueue;
    }

    /**
     * @param capcomWinningQueue the capcomWinningQueue to set
     */
    public void setCapcomWinningQueue(Queue capcomWinningQueue) {
        this.capcomWinningQueue = capcomWinningQueue;
    }

    /**
     * @return the simSpeed
     */
    public double getSimSpeed() {
        return simSpeed;
    }

    /**
     * @param simSpeed the simSpeed to set
     */
    public void setSimSpeed(double simSpeed) {
        this.simSpeed = simSpeed;
    }

    /**
     * @return the simLoad
     */
    public double getSimLoad() {
        return simLoad;
    }

    /**
     * @param simLoad the simLoad to set
     */
    public void setSimLoad(double simLoad) {
        this.simLoad = simLoad;
    }

    /**
     * @return the nextSim
     */
    public double getNextSim() {
        return nextSim;
    }

    /**
     * @param nextSim the nextSim to set
     */
    public void setNextSim(double nextSim) {
        this.nextSim = nextSim;
    }

    /**
     * @return the loadImage
     */
    public ImageIcon getLoadImage() {
        return loadImage;
    }

    /**
     * @param loadImage the loadImage to set
     */
    public void setLoadImage(ImageIcon loadImage) {
        this.loadImage = loadImage;
    }
}
