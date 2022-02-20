package buka_tutup_jalan;

import java.util.Scanner;

/**
 *
 * @author Moaibad
 * @version 1.0
 * @since 2022-02-19
 */
public class Buka_Tutup_Jalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input user
        String plat = input.nextLine();
        input.close();
        
        //penghapusan spasi pada string
        String noSpacePlat;              
        noSpacePlat = plat.replaceAll("\\s", "");
        
        //merubah plat nomer ke dalam numerik
        long numPlat = Long.parseLong(noSpacePlat);
        
        //pengecekan kondisi sesuai ketentuan
        if(((numPlat-999999)%5)==0){
            System.out.println("berhenti");
        }
        else{
            System.out.println("jalan");
        }
    }
    
}
