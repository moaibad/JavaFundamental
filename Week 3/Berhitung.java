package berhitung;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int result = 0;
        
        //scan input user
        int number1 = input.nextInt();
        char operator = input.next().charAt(0);
        int number2 = input.nextInt();
        input.close();
        
        //condition check
        if(number1>=1 && number2>=1 && number1<=1000 && number2<=1000){
            switch(operator){
                case '+':
                    result = number1 + number2;break;
                case '-':
                    result = number1 - number2;break;
                case '*':
                    result = number1 * number2;break;
                case '/':
                    result = number1 / number2;break;
                case '%':
                    result = number1 % number2;break;           
                default :
                    System.out.println("Please input the valid operator");
            }
        }
        else{
            System.out.println("Please input only range 0-1000");
        }
        
        System.out.println(result);
               
    }
    
}
