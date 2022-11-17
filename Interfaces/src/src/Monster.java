/*
Goal: Write a class called Monster that uses the ISaveable interface.
- Has three fields:
    1. String Name;
    2. int hitPoints;
    3. int strength;
- A constructor that accepts a String (name) and two ints (hitPoints and strength)
It will initalise name, hitPoints and strength with the parameters.
- Six methods:
    1. Only getters for the first three fields.
    2. Write()
    3. read()
    4. toString()
    5.
 */

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength=strength;
    }

    public List<String> write(){
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(this.hitPoints+"");
        values.add(this.strength+"");
        return values;
    }
    public void read(List<String> listItem){
        if(listItem != null && listItem.size()>0){
            this.name = listItem.get(0);
            this.hitPoints=Integer.parseInt(listItem.get(1));
            this.strength=Integer.parseInt(listItem.get(2));
        }

    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
