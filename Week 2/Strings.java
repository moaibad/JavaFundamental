package strings;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 */
public class Strings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        try {
            System.out.println(A.length()+ B.length());
            int result = A.compareTo(B);
            if ((result < 0 )){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
            System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
