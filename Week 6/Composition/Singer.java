/**
 *
 * @author Moaibad
 */
public class Singer {
    // Attributes
    private String name;
    private String vocalRange;
    
    // Constructor
    public Singer(String name, String vocalRange) {
        this.name = name;
        this.vocalRange = vocalRange;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getVocalRange(){
        return this.vocalRange;
    }
}
