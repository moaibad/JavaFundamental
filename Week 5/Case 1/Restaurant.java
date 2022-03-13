package Restaurant;

public class Restaurant{
    public static byte id = 0;
    private Food[] Menu;
    
    //Constructor
    public Restaurant(){
        this.Menu = new Food[10];
        for(int i=0;i<10;i++){
            this.Menu[i] = new Food();
        }
    }
    
    //Accessor & Mutator
    public Food[] getMenu() {
        return Menu;
    }

    public void setMenu(Food[] Menu) {
        this.Menu = Menu;
    }
    
    
    //Method
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.Menu[id].setNama_makanan(nama);
        this.Menu[id].setHarga_makanan(harga);
        this.Menu[id].setStok(stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(this.Menu[i].getNama_makanan() + "[" + this.Menu[i].getStok() + "]" + "\t\tRp. " + this.Menu[i].getHarga_makanan());
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(this.Menu[id].getStok()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }    
    
    public void pesanMakanan(String nama, int jumlah){
        int valid = 0;
        for( int i=0; i<10; i++) {
            if( nama.equals(this.Menu[i].getNama_makanan()) ) {
                if(jumlah > this.Menu[i].getStok()){
                    System.out.println("Sorry, the food is out of stock!");
                    valid = 1;
                }
                else{
                    System.out.println("~Your Order~");
                    System.out.println(jumlah + "x " + nama + "\t\tRp. " + this.Menu[i].getHarga_makanan() + "/pcs");
                    updateStok(i,jumlah);
                    valid = 1;
                    }
            }
        }
        if(valid == 0){
            System.out.println("Please input the correct Food!");
        }
    }
    
    public void updateStok (int i, int jumlah) {
         this.Menu[i].setStok(this.Menu[i].getStok() - jumlah);
    }
}
