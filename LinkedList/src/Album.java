/*
Goal: Write a class called Album.
- Three fields:
    - two Strings called name and artist
    - An ArrayList that holds objects of type Song called songs.
- A constructor that accepts two Strings (name of the album and the artist). It will initalise the fields and instantiates songs.
- Three methods:
    1. addSong(), two parameters of type String (title of song), double (duration of song). Returns true if the song was added.
    2. findSong(), has one parameter of type String (title of song), and returns a Song. Returns null if the song doesn't exist.
    3. addToPlayList(), has two parameters of type int (track number of song in album), and LinkedList(the playlist) that holds
    objects of type Song and returns a boolean. Returns true if it exists, and that it was successfully added to the playlist.
    4. Another addToPlayList() function
 */

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist=artist;
        this.songs=new ArrayList<Song>();
    }
    public boolean addSong(String title,double duration){
        return this.songs.add(new Song(title,duration));
    }
    public Song findSong(String title){
        for (int i = 0; i < this.songs.size(); i++) {
            Song song=this.songs.get(i);
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
}
