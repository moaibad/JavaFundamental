import java.util.List;
/**
 *
 * @author Moaibad
 */
public class Singer {
    private String singerName;
    List<Song> songs;
    
    public String getSingerName(){
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public List<Song> getSongs() {
        return songs;
    }
    public void setSinger(List<Song> songs) {
        this.songs = songs;
    }

    
}
