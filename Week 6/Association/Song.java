/**
 *
 * @author Moaibad
 */
public class Song {
     /*State*/
    private String songName;

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString(){
        return songName;
    }
}
