package input_output;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Input_Output_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int counter;
        
        //declaring arrays
        String[] word = new String[3];
        int[] number = new int[3];
               
        //input from user
        Scanner input = new Scanner(System.in);
        for(counter=0; counter<3; counter++){
            //Input string
            word[counter] = input.next();
            //Input number        
            number[counter] = input.nextInt();
        }
        input.close();
        
        //print output
        System.out.println("================================");
        for(counter=0; counter<3; counter++){
            System.out.printf("%-15s", word[counter]);
            System.out.printf("%03d%n", number[counter]);           
        }
        System.out.println("================================");
           
    }
    
}


 