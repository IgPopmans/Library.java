package Disco;

public class Album {
    private String title;
    private int year;
    private int countSongs ;
    private Song[] songs;
    private int currentIndexSong = 0;

    public Album(String title, int year, int countSongs) {
        this.title = title;
        this.year = year;
        this.countSongs = countSongs;
        songs= new Song [countSongs];

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void addSong(Song song) {
        if (currentIndexSong == countSongs) {
          //  System.out.println("Not more tracks");
            return;
        }
        songs[currentIndexSong++] = song;
    }
    public String getStringSongs(){
        String output = " ";
       for (Song song: songs){
           output += " * " + song.getTitle() + "  " + song.getArtist().getName() + "\n";
       }
       return output;
        }
    }

