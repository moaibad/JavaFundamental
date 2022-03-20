import java.util.*;
/**
 *
 * @author Maolana
 */
public class MainAggregation {

    public static void main(String[] args) {
        // Instansiasi
        Singer singer1 = new Singer("Michael Carreon");
        Singer singer2 = new Singer("Jeff Bernat");
        Singer singer3 = new Singer("Taylor Swift");
        Singer singer4 = new Singer("Mac Ayres");
        Singer singer5 = new Singer("Frank Sinatra");
        Singer singer6 = new Singer("Ardhito Pramono");
        Singer singer7 = new Singer("Michael Bublé");
        
        // List
        List<Singer> Pop = new ArrayList<Singer>();
        Pop.add(singer1);
        Pop.add(singer2);
        Pop.add(singer3);
        Pop.add(singer4);
        

        List<Singer> Jazz = new ArrayList<Singer>();
        Jazz.add(singer5);
        Jazz.add(singer6);
        Jazz.add(singer7);
       
        singerGenre genre1 = new singerGenre("Pop", Pop);
        singerGenre genre2 = new singerGenre("Jazz", Jazz);
        
        // Output
        System.out.println("Penyanyi dengan genre " + genre1.getSingerList() + " berjumlah " + genre1.getTotalSinger());
        System.out.println("Penyanyi dengan genre " + genre2.getSingerList() + " berjumlah " + genre2.getTotalSinger());
        
    }
    
}