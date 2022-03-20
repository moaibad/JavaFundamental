import java.util.*;
/**
 *
 * @author Maolana
 */
public class singerGenre {
    // Attributes
    private String singerGenre;
    private List<Singer> singerList;
    
    // Constructor
    public singerGenre(String singerGenre, List<Singer> singerList) {
        this.singerGenre = singerGenre;
        this.singerList = singerList;
    }
    
    // Methods
    public String getSingerList() {
        return this.singerGenre;
    }
    
    public int getTotalSinger() {
        int totalSinger=0;
        
        for(Singer singer : singerList) {
            totalSinger++;
        }
        return totalSinger;
    }
}