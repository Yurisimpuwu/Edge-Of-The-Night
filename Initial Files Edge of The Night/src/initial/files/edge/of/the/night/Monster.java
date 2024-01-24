/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package initial.files.edge.of.the.night;

/**
 *
 * @author Zabieru
 */
public class Monster extends Character {

    private String type;
    private int damage, health;

    public Monster(String n, int a, int b, int c, int d, String t) {
        super(n, a, b, c);
        this.damage = d;
        this.type = t;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void attackPlayer(Player p){
    }
}
