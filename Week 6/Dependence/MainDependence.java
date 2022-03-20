/**
 *
 * @author Moaibad
 */
public class MainDependence {
    public static void main(String[] args){
        
        // Instansiasi Objek 1
        Singer singer1 = new Singer();
        singer1.setName("Michael Carreon");
        singer1.setRegion("San Fransisco, USA");
        singer1.genre = "POP";
        
        singer1.printSinger();
        
        // Instansiasi Objek 1
        Singer singer2 = new Singer();
        singer2.setName("Bruno Major");
        singer2.setRegion("Northampton, England");
        singer2.genre = "Alternative/Indie";
        
        singer2.printSinger();
    }
   
}
