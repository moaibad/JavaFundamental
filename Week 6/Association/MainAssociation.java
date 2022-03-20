import java.util.ArrayList;
import java.util.List;

public class MainAssociation {
    public static void main(String[] args) throws Exception {
            Singer singer = new Singer();
            singer.setSingerName("Michael Carreon");

            Song song1 = new Song();
            song1.setSongName("The Simple Things");
            Song song2 = new Song();
            song2.setSongName("Maybe We Could Be a Thing");

            List<Song> empList = new ArrayList<Song>();
            empList.add(song1);
            empList.add(song2);

            singer.setSinger(empList);

            System.out.println(singer.getSongs()+" adalah lagu yang dinyanyikan oleh "+singer.getSingerName());
 
    }
}