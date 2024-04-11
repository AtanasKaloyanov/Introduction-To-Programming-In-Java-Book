package org.example.Exercise.T04Firm1;

public class Song {
    private String name;
    private int seconds;

    public Song(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    public String songTime() {
        int minutes = Integer.parseInt(String.valueOf(this.seconds / 60));
        int seconds = Integer.parseInt(String.valueOf(this.seconds % 60));

        String remainingSeconds = seconds < 10 ? String.valueOf(0) + seconds : String.valueOf(seconds);

        return minutes + ":" + remainingSeconds;
    }

    @Override
    public String toString() {
        return "\n" + "               Name: " + this.name + " | Time: " + songTime();
    }
}

// 1. String name
// 2. double seconds
