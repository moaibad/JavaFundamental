/**
 *
 * @author Moaibad
 */
public class Singer {
     //state /data field
    private String name;
    private String region;
    private String profession = "Singer";
    String genre;
    

    //behaviour
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRegion(){
        return this.region;
    }

    public void setRegion(String region){
        this.region = region;
    }

    void printSinger(){
        System.out.println("Singer Data");
        System.out.println("======================");
        System.out.println("Profession = " + this.profession);
        System.out.println("Name = " + this.name);
        System.out.println("Country of Origin = " + this.region);
        System.out.println("Genre = " + this.genre);
        System.out.println("----------------------");
        System.out.println(" ");
    }
}
