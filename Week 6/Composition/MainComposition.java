import java.util.*;
/**
 *
 * @author Moaibad
 */
public class MainComposition {
    public static void main(String[] args) {
        // TODO code application logic here
        Singer singer1 = new Singer("Avi Kaplan", "Bass");
        Singer singer2 = new Singer("Tim Foust", "Bass");
        Singer singer3 = new Singer("Frank Sinatra", "Baritone");
        Singer singer4 = new Singer("Michael Carreon", "Baritone");
    
        List<Singer> bass = new ArrayList<Singer>();
        bass.add(singer1);
        bass.add(singer2);
        
        List<Singer> baritone = new ArrayList<Singer>();
        baritone.add(singer3);
        baritone.add(singer4);
    
        
        vocalRange Bass = new vocalRange(bass);
        vocalRange Baritone = new vocalRange(baritone);
        
        List<Singer> sls = Bass.getTotalSinger();
        System.out.println("Penyanyi dengan suara bass adalah :");
        for(Singer sl : sls) {
            System.out.println("Name : " + sl.getName() + " dengan " + "Vocal Range : " + sl.getVocalRange());
        }
        
        System.out.println("=======================");
        
        List<Singer> slss = Baritone.getTotalSinger();
        System.out.println("Penyanyi dengan suara baritone adalah :");
        for(Singer sl : slss) {
            System.out.println("Name : " + sl.getName() + " dengan " + "Vocal Range : " + sl.getVocalRange());
        }
    }
}
