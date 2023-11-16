/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2_so;

import DB.Buffer;
import GUI.Functions;
import GUI.MainFrame;
import Threads.AI;
import Threads.Administrator;

/**
 *
 * @author Masa500
 */
public class Proyecto_2_SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
    }
    
    public static void init(){
        Buffer buffer = new Buffer();
        MainFrame window = new MainFrame(buffer);
        AI ai = new AI(buffer, window);
        Administrator admin = new Administrator(window, buffer);
        Functions.createCharacters(buffer);
        window.setVisible(true);
        for (int i = 0; i < 30; i++) {
            admin.createCapcomAndNintendoCharacters();
        }
        ai.start();
        admin.start();
    }
    
}
