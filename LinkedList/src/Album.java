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
    4. Another addToPlayList() function. Two parameters of type String (title of song) and a LinkedList (the playlist).
    Returns true if the song exists in the playlist and was successfully added. False otherwise.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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
        Song song=findSong(title);
        if(song==null){
            return this.songs.add(new Song(title,duration));
        }
        return false;

    }
    private Song findSong(String title){
        for (int i = 0; i < this.songs.size(); i++) {
            Song song=this.songs.get(i);
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        ListIterator<Song> playListIterator=playList.listIterator();
        if(trackNumber>this.songs.size() || trackNumber<0){
            return false;
        }
        Song song;
        if(trackNumber==0){
             song = this.songs.get(trackNumber);
        }else{
            song = this.songs.get(trackNumber-1);
        }

        while(playListIterator.hasNext()){
            int comparison = playListIterator.next().toString().compareTo(song.toString());
            if(comparison ==0){
                System.out.println("Song is already in the playlist");
                return false;
            }
        }
        playListIterator.add(song);
        return true;
    }
    public boolean addToPlayList(String songTitle,LinkedList<Song> playList){
        Song song = findSong(songTitle);
        if(song == null){
            return false;
        }
        ListIterator<Song> playListIterator=playList.listIterator();
        while(playListIterator.hasNext()){
            int comparison = playListIterator.next().toString().compareTo(song.toString());
            if(comparison ==0){
                System.out.println("Song is already in the playlist");
                return false;
            }
        }
        playListIterator.add(song);
        return true;
    }

}
