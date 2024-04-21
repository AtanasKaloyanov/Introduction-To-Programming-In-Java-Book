package org.example.Exercise.T04Firm1;
import java.util.Set;

public class Performer {
    private String name;
    private String alias;
    private Set<Album> albums;

    public Performer(String name, String alias, Set<Album> albums) {
        this.name = name;
        this.alias = alias;
        this.albums = albums;
    }


    @Override
    public String toString() {
        return "\n" + "     Name: " + this.name + " | Alias: " + this.alias + " | Albums: "  + this.albums.toString().replaceAll("[\\[\\],]", "");
    }
}

// 1. String name
//2. String alias
//3. Set<Album> albums
