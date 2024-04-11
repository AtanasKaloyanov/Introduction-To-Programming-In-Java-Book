package org.example.Exercise.T04Firm1;

import java.util.List;
public class Album {
    private String name;
    private String genre;
    private int year;
    private int soldAlbums;
    private List<Song> songs;

    public Album(String name, String genre, int year,
                 int soldAlbums, List<Song> songs) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.soldAlbums = soldAlbums;
        this.songs = songs;
    }


    @Override
    public String toString() {
        return "\n" + "          Name: " + this.name + " | Genre: " + this.genre + " | Year: " + this.year + " | Sold albums: "  + this.soldAlbums + " | Songs: " + this.songs.toString().replaceAll("[\\[\\],]", "");
    }
}
//1. String name
//2. String genre
//3. int year
//4. int soldAlbums
//5. List<Song> songs