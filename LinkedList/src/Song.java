/*
Goal: Write a class called Song.
- Two fields: title of type String and duration of type double.
- Two methods:
    1. getTitle()
    2. toString(): Song's overriding toString method. Returns a String in the following format: "title: duration"
 */

public class Song {
    private String title;
    private double duration;

    public String getTitle() {
        return title;
    }
    @Override
    public String toString(){
        return this.title+": "+this.duration;
    }
}
