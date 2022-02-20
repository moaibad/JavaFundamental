package gaji_agent;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Gaji_Agent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Deklarasi
        int gajiPokok = 500000;
        int hargaItem = 50000;
        int bonus;
        int totalGaji = 0;
        
        //Inputan User
        int itemTerjual = input.nextInt();
        input.close();
        
        //Pengecekan kondisi
        if(itemTerjual>=40 && itemTerjual<80){
            bonus = (int)((itemTerjual*hargaItem)*(25.0f/100.0f));
            totalGaji = gajiPokok + bonus;
        }               
        else if(itemTerjual<40 && itemTerjual>=15){
            bonus = (int)((itemTerjual*hargaItem)*(10.0f/100.0f));
            totalGaji = gajiPokok + bonus;
        }
        else if(itemTerjual>=80){
            bonus = (int)((itemTerjual*hargaItem)*(35.0f/100.0f));
            totalGaji = gajiPokok + bonus;
        }
        else{
            itemTerjual = 15-itemTerjual;
            bonus = (int)((itemTerjual*hargaItem)*(15.0f/100.0f));
            totalGaji = gajiPokok - bonus;
        }
        
        //Menampilkan hasil
        System.out.println(totalGaji);
    }
    
}
