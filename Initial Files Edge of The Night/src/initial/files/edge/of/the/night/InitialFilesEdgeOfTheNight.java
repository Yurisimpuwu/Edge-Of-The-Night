/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package initial.files.edge.of.the.night;

/**
 *
 * @author Zabieru
 */
public class InitialFilesEdgeOfTheNight {
    public static void main(String[] args) {
        Player Russ = new Player("Russ", 100, 50, 10, 30);
        Monster Javi = new Monster("Javi", 500, 40, 10, 10, "Ghoul");
        Item Durendal = new Item("Powerful Sword...", 40, 0, true);
        
        Russ.attack(Javi, Durendal);
    }
}
