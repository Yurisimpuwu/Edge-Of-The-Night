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

public class Level {

    private String difficulty;
    private ArrayList<Monster> monsterList;
    private ArrayList<Item> itemList;
    private Item prize;

    public Level(String d, ArrayList<Monster> a, ArrayList<Item> i, Item t) {
        this.difficulty = d;
        this.monsterList = a;
        this.itemList = i;
        this.prize = t;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(ArrayList<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public Item getPrize() {
        return prize;
    }

    public void setPrize(Item prize) {
        this.prize = prize;
    }
 public void removeItem(Item i){
 }
 
}
