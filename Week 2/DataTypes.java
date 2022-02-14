
package datatypes;
import java.util.Scanner;
/**
 *<h1>DataTypes Program</h1>
 * The DataTypes program that will determine
 * which data types can store the data
 * 
 * @author moaibad
 * @version 1.0
 * @since 2022-02-13
 */
public class DataTypes {

    /**
     * This method is used to determine the data types.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test;
        long N;
        Scanner input = new Scanner(System.in);
        test = input.nextInt(); //input how many test case that u want to run
        
        for(int counter = 0; counter < test; counter++){
            try{
                N = input.nextLong();
                System.out.println(N + " can be fitted in:");
                
                if(N>=Byte.MIN_VALUE && N<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(N>=Short.MIN_VALUE && N<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(N>=Integer.MIN_VALUE && N<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(N>=Long.MIN_VALUE && N<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }              
    }    
}
