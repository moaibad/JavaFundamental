package input_output;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Input_Output {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input from user
        Scanner input = new Scanner(System.in);            
        String s = input.nextLine();        
        input.close();
        
        //split string to token
        String[] token = s.split("[^a-zA-Z]+");
        int numToken = token.length;
        
        //print total of character
        System.out.println(numToken);
        
        //print splitted string
        for (int counter=0; counter<token.length; counter++){
            System.out.println(token[counter]);
        }
    }
}
