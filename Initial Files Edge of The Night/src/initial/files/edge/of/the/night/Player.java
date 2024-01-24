/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package initial.files.edge.of.the.night;

/**
 *
 * @author Zabieru
 */
import java.util.*;

public class Player extends Character{
    
    private Item itemHeld;
    private int damage;
    private ArrayList<Level> levelsDone;
    
    public Player(String n, int a, int b, int c, int d) {
        super(n, a, b, c);
        this.damage = d;
    }

    public Item getItemHeld() {
        return itemHeld;
    }

    public int getDamage() {
        return damage;
    }

    public ArrayList<Level> getLevelsDone() {
        return levelsDone;
    }

    public void setItemHeld(Item itemHeld) {
        this.itemHeld = itemHeld;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLevelsDone(ArrayList<Level> levelsDone) {
        this.levelsDone = levelsDone;
    }
    
    
    public void attackPlayer(Player p){
    }
    
    public void attack(Monster m, Item i){
        int totalDamage = this.damage + i.getPowerIncrease();
        int monsterHealth = m.getHealth() - totalDamage;
        m.setHealth(monsterHealth);
        System.out.println(m.getName() + "'s health has been reduced to " + m.getHealth() + "after dealing " + totalDamage + " damage." );
    }
}
