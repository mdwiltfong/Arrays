/*
Goal: Write a class called Song.
- Two fields: title of type String and duration of type double.
- A constructor that accepts a String called title, and duration of the song in type double.
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
    public Song(String title,double duration){
        this.title=title;
        this.duration=duration;
    }

    @Override
    public String toString(){
        return this.title+": "+this.duration;
    }
}
