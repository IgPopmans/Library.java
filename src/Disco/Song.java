package Disco;

public class Song {
    public String title;
    private int lenght;
    private Artist artist;

    public Song(String title, int lenght, Artist artist) {
        this.title = title;
        this.lenght = lenght;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
