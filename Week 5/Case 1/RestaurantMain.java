package Restaurant;

import java.util.Scanner;

/**
* @author Mohammad Fathul'Ibad
* @version 1.0
* @since 2022-03-13
*/

public class RestaurantMain {

    public static void main(String args[]) {
        
        //Memanggil Constructor
        Restaurant menu = new Restaurant();
        
        //Memanggil method tambah menu
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 2_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_500, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 2_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Pisang", 2_000, 20);
        
        //Pesan makanan
        System.out.println("~Menu~");
        menu.tampilMenuMakanan();
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("~User Input");
        System.out.print("Input Food Name : ");
        String nama = scan.nextLine();
        System.out.print("Input Qty : ");
        Integer jumlah = scan.nextInt();
        System.out.println("");
        menu.pesanMakanan(nama,jumlah);
        scan.close();
        
        //Menampilkan stok terbaru
        System.out.println("");
        System.out.println("~Newest Stock~");
        menu.tampilMenuMakanan();
    }
}
