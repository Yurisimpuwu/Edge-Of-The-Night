/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package initial.files.edge.of.the.night;

/**
 *
 * @author Zabieru
 */
public class Obstacle implements Interactable {

    private int speedDecrease;
    private boolean blockPlayer;

    public Obstacle(int s, boolean b) {
        this.speedDecrease = s;
        this.blockPlayer = b;
    }

    public int getSpeedDecrease() {
        return speedDecrease;
    }

    public void setSpeedDecrease(int speedDecrease) {
        this.speedDecrease = speedDecrease;
    }

    public boolean isBlockPlayer() {
        return blockPlayer;
    }

    public void setBlockPlayer(boolean blockPlayer) {
        this.blockPlayer = blockPlayer;
    }

    public void decreasePlayerSpeed(Player p) {
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
