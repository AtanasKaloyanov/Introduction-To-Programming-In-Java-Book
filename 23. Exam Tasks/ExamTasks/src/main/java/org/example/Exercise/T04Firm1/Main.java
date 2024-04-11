package org.example.Exercise.T04Firm1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Song song1 = new Song("song1", 181);
       Song song2 = new Song("song2", 182);
       Song song3 = new Song("song3", 183);
       Song song4 = new Song("song4", 184);
       Song song5 = new Song("song5", 185);
       Song song6 = new Song("song6", 186);

       List<Song> songs1 = new ArrayList<>(List.of(song1, song2));
       List<Song> songs2 = new ArrayList<>(List.of(song3, song4));
       List<Song> songs3 = new ArrayList<>(List.of(song5, song6));

       Album album1 = new Album("album1", "genre1", 2001, 1001, songs1);
       Album album2 = new Album("album2", "genre2", 2002, 1002, songs2);
       Album album3 = new Album("album3", "genre3", 2003, 1003, songs3);

       Set<Album> albums1 = new LinkedHashSet<>();
       albums1.add(album1);
       albums1.add(album2);
       Set<Album> albums2 = new LinkedHashSet<>(Set.of(album3));

       Performer performer1 = new Performer("performer1", "alias1", albums1);
       Performer performer2 = new Performer("performer2", "alias2", albums2);

       Set<Performer> performers = new LinkedHashSet<>();
       performers.add(performer1);
       performers.add(performer2);

        Company company = new Company("company", "address", "owner", performers);
        System.out.println(company);
    }
}

/*
class Company

1. String name
2. String address
3. String owner
4. Set<Performer> performers

class Performer

1. String name
2. String alias
3. Set<Album> albums

class Album

1. String name
2. String genre
3. int year
4. int soldAlbums
5. List<Song> songs

class Song

1. String name
2. double seconds


 */
