package inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok; //stok menggunakan modifier private agar tidak bisa di akses secara langsung dari luar

    public int getStok() {
        return stok;
    }

    public void addStok(int stok) { 
        /*Method untuk melakukan penambahan pada stok*/
        this.stok += stok; 
    }
      
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
