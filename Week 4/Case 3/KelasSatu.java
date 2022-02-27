package kelas;

public class KelasSatu {
    {
        System.out.println(11); /*ditampilkan ketika constructor KelasSatu dipanggil*/
    }
    
    static{
        System.out.println(2); /*hanya ditampilkan satu kali dan pertama kali ketika constructor dipanggil*/
    }
    
    public KelasSatu(int i){
        System.out.println(3); /*ditampilkan ketika constructor KelasSatu dengan parameter dipanggil*/
    }
    
    public KelasSatu(){
        System.out.println(4); /*ditampilkan ketika constructor KelasSatu tanpa parameter dipanggil*/
    }
}
