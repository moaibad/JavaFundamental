package naruto;

/**
* @author Moaibad
* @version 1.0
* @since 2022-03-13
*/

public class Itachi extends Rikudo{
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    
    void printKekkeiGenkai (){
        System.out.println(this.KekkeiGenkai);
    }
    
    void printDojutsu (){
        System.out.println (this.Dojutsu);
        setDojutsu();
        System.out.println (this.Dojutsu);
    }
    
    private void setDojutsu(){
        this.Dojutsu = "Mangekyou Sharingan";       
    }
}
