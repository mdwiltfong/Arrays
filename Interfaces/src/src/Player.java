/*
Goal: Write a class called Player with the following specs.
- Has four fields:
    - Two Strings called name and weapon.
    - Two integers called hitPoints and strength.
- A constructor that accepts: a String (name) and two ints (hitPoints and strength). It will initalise name, hitPoints and strenght with
the newly passed in values. It will initalise weapon with the default "Sword."
-Getters and setters for all methods.
- write(), which will return a list of the fields in the order they appear in toString().
- read(), stores the values in the List, and in the order they appear in toString.
Make sure the List is not null and the size is greater than 0 before storing values.
- toString(), which overrides Player's toString method. Ittakes no arguments and returns a String in the following format:
Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon="sword";
    }
    public List<String> write(){
    List<String> values = new ArrayList<String>();
    values.add(this.name);
    values.add(this.hitPoints+"");
    values.add(this.weapon);
    values.add(this.strength+"");
    return values;

    }
    public void read(List<String> listItem){
        if(listItem != null && listItem.size()>0){
            this.name = listItem.get(0);
            this.hitPoints=Integer.parseInt(listItem.get(1));
            this.weapon=listItem.get(2);
            this.strength=Integer.parseInt(listItem.get(3));
        }

    }
    @Override
    public String toString(){
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
