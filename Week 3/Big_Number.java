package big_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Big_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Scan input from user
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        input.close();
        
        //Print the result
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
}
