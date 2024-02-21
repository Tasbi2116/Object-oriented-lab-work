
package finalproject;

    
import java.io.*;
import java.util.Objects;
public class Item implements Serializable,Comparable{
    protected String title;
    protected int playingTime;
    protected String artist;
    protected int num_of_tracks;
    protected String rating;

   public Item(String theTitle, int time,String theArtist,int num_tracks,String therating) {
        title = theTitle;
        playingTime = time;
        artist = theArtist;
        num_of_tracks = num_tracks;
        rating = therating;
    }
     
   @Override
    public String toString() {
        return new StringBuffer("")
        .append(this.title)
        .append(this.playingTime)
        .append(this.artist)
        .append(this.num_of_tracks)
        .append(this.rating).toString();
    }

    public String getTitle() {
        return title;
    }

    public int getPlayingTime() {
        return playingTime;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getnumoftracks()
    {
        return num_of_tracks;
    }
    public String getRating()
    {
        return rating;
    }
    @Override
    public int compareTo(Object o){
       Item i = (Item)o;
       if(this.playingTime>i.playingTime)
         return 1;
       else if(this.playingTime<i.playingTime)
         return -1;
       else
         return this.title.compareTo(i.title);
   }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (this.playingTime != other.playingTime) {
            return false;
        }
        return true;
    }
}
