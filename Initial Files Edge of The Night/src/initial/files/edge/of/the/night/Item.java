/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package initial.files.edge.of.the.night;

/**
 *
 * @author Zabieru
 */ 
public class Item implements Interactable {
    private String description;
    private int powerIncrease, healthIncrease, itemPosition;
    boolean isEquippable;

    public Item(String d, int p, int h, boolean b) {
        this.description = d;
        this.powerIncrease = p;
        this.healthIncrease = h;
        this.isEquippable = b;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPowerIncrease() {
        return powerIncrease;
    }

    public void setPowerIncrease(int powerIncrease) {
        this.powerIncrease = powerIncrease;
    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public void setHealthIncrease(int healthIncrease) {
        this.healthIncrease = healthIncrease;
    }

    public int getItemPosition() {
        return itemPosition;
    }

    public void setItemPosition(int itemPosition) {
        this.itemPosition = itemPosition;
    }

    public boolean isIsEquippable() {
        return isEquippable;
    }

    public void setIsEquippable(boolean isEquippable) {
        this.isEquippable = isEquippable;
    }
        
        
        
    
    @Override
    public void useItem(Player p) {
    }

    
    @Override
    public void Observe() {
    }

    
    @Override
    public void Interact() {
    }

}
